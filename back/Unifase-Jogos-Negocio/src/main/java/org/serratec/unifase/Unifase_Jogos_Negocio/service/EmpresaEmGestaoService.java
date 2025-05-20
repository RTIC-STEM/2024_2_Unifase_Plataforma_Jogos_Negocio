package org.serratec.unifase.Unifase_Jogos_Negocio.service;

import org.serratec.unifase.Unifase_Jogos_Negocio.entity.DemonstrativoDoResultadoDoExercicio;
import org.serratec.unifase.Unifase_Jogos_Negocio.entity.EmpresaEmGestao;
import org.serratec.unifase.Unifase_Jogos_Negocio.entity.EmpresaModelo;
import org.serratec.unifase.Unifase_Jogos_Negocio.exception.NotFoundException;
import org.serratec.unifase.Unifase_Jogos_Negocio.repository.DemonstrativoDoResultadoDoExercicioRepository;
import org.serratec.unifase.Unifase_Jogos_Negocio.repository.EmpresaEmGestaoRepository;
import org.serratec.unifase.Unifase_Jogos_Negocio.repository.EmpresaModeloRepository;
import org.serratec.unifase.Unifase_Jogos_Negocio.utils.CalcularImpostos;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class EmpresaEmGestaoService {
    private final EmpresaEmGestaoRepository empresaEmGestaoRepository;
    private final EmpresaModeloRepository empresaModeloRepository;
    private final DemonstrativoDoResultadoDoExercicioRepository dreRepository;
    private final CalcularImpostos calcularImpostos;

    public EmpresaEmGestaoService(EmpresaEmGestaoRepository empresaEmGestaoRepository, EmpresaModeloRepository empresaModeloRepository, DemonstrativoDoResultadoDoExercicioRepository dreRepository, CalcularImpostos calcularImpostos) {
        this.empresaEmGestaoRepository = empresaEmGestaoRepository;
        this.empresaModeloRepository = empresaModeloRepository;
        this.dreRepository = dreRepository;
        this.calcularImpostos = calcularImpostos;
    }

    public String createEmpresaEmGestao (Long idEmpresaModelo, String nomeEmpresaEmGestao){
        Optional<EmpresaModelo> empresaModelo = empresaModeloRepository.findById(idEmpresaModelo);

        if(empresaModelo.isPresent()){
            EmpresaEmGestao  empresaEmGestao = new EmpresaEmGestao();
            empresaEmGestao.setNomeEmpresa(nomeEmpresaEmGestao);
            empresaEmGestao.setSetor(empresaModelo.get().getSetor());
            empresaEmGestao.setTipoProdutoServico(empresaModelo.get().getTipoProdutoServico());
            empresaEmGestao.setTamanho(empresaModelo.get().getTamanho());
            empresaEmGestao.setHistoria(empresaModelo.get().getHistoria());
            empresaEmGestao.setEmpresaModeloOriginal(empresaModelo.get());

            empresaEmGestaoRepository.save(empresaEmGestao);

            //Criando o DRE inicial após criar a empresa
            DemonstrativoDoResultadoDoExercicio dre = new DemonstrativoDoResultadoDoExercicio();
            dre.setQuantidadeDeVendas(empresaModelo.get().getQuantidadeDeVendas());
            dre.setValorProduto(empresaModelo.get().getValorProduto());
            dre.setRecursoFinanceiro(empresaModelo.get().getRecursoFinanceiro());
            dre.setDespesaAdministrativa(empresaModelo.get().getDespesaAdministrativa());
            dre.setNumeroFuncionarios(empresaModelo.get().getNumeroFuncionarios());
            dre.setSalarioFuncionario(empresaModelo.get().getSalarioFuncionario());

            //Calculando variáveis

            BigDecimal receitaBruta = empresaModelo.get().getValorProduto().multiply(BigDecimal.valueOf(empresaModelo.get().getQuantidadeDeVendas()));
            BigDecimal percentualIcms = BigDecimal.valueOf(calcularImpostos.determinarPercentualIcms(empresaModelo.get().getSetor(), empresaModelo.get().getTamanho()));
            BigDecimal deducaoIcms = receitaBruta.multiply(percentualIcms);
            BigDecimal receitaLiquida = receitaBruta.subtract(deducaoIcms);
            BigDecimal percentualCmv = BigDecimal.valueOf(calcularImpostos.determinarPercentualCmv(empresaModelo.get().getSetor(), empresaModelo.get().getTamanho()));
            BigDecimal custoMercadoriaVendida = receitaBruta.multiply(percentualCmv);
            BigDecimal lucroBruto = receitaLiquida.subtract(custoMercadoriaVendida);
            BigDecimal despesaComercial = empresaModelo.get().getSalarioFuncionario().multiply(BigDecimal.valueOf(empresaModelo.get().getNumeroFuncionarios()));
            BigDecimal despesaOperacional = empresaModelo.get().getDespesaAdministrativa().add(despesaComercial);
            BigDecimal lucroAntesImposto = lucroBruto.subtract(despesaOperacional);
            BigDecimal percentualIrpj = BigDecimal.valueOf(calcularImpostos.determinarPercentualIrpj(empresaModelo.get().getSetor(), empresaModelo.get().getTamanho()));
            BigDecimal impostoRendaPessoaJuridica = lucroAntesImposto.multiply(percentualIrpj);
            BigDecimal lucroLiquido = lucroAntesImposto.subtract(impostoRendaPessoaJuridica);


            dre.setReceitaBruta(receitaBruta);
            dre.setPercentualIcms(percentualIcms);
            dre.setDeducaoIcms(deducaoIcms);
            dre.setReceitaLiquida(receitaLiquida);
            dre.setPercentualCmv(percentualCmv);
            dre.setCustoMercadoriaVendida(custoMercadoriaVendida);
            dre.setLucroBruto(lucroBruto);
            dre.setDespesaComercial(despesaComercial);
            dre.setDespesaOperacional(despesaOperacional);
            dre.setLucroAntesImposto(lucroAntesImposto);
            dre.setPercentualIrpj(percentualIrpj);
            dre.setImpostoRendaPessoaJuridica(impostoRendaPessoaJuridica);
            dre.setLucroLiquido(lucroLiquido);
            dre.setDataCalculo(LocalDateTime.now());
            dre.setEmpresa(empresaEmGestao);

            dreRepository.save(dre);

            return "Nova empresa salva com sucesso";
        } else {
            throw new NotFoundException("Não foi encontrada empresa Modelo com o id informado: " + idEmpresaModelo);
        }
    }



}
