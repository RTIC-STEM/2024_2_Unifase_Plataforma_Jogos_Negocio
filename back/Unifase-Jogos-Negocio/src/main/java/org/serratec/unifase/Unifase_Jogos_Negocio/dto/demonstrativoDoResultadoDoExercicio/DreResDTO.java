package org.serratec.unifase.Unifase_Jogos_Negocio.dto.demonstrativoDoResultadoDoExercicio;

import org.serratec.unifase.Unifase_Jogos_Negocio.entity.DemonstrativoDoResultadoDoExercicio;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class DreResDTO {
    private Long id;
    private Integer quantidadeDeVendas;
    private BigDecimal valorProduto;
    private BigDecimal recursoFinanceiro;
    private BigDecimal despesaAdministrativa;
    private Integer numeroFuncionarios;
    private BigDecimal salarioFuncionario;

    //Dados relacionados ao DRE

    private BigDecimal receitaBruta;
    private BigDecimal percentualIcms;
    private BigDecimal deducaoIcms;
    private BigDecimal receitaLiquida;
    private BigDecimal percentualCmv;
    private BigDecimal custoMercadoriaVendida;
    private BigDecimal lucroBruto;
    private BigDecimal despesaComercial;
    private BigDecimal despesaOperacional;
    private BigDecimal lucroAntesImposto;
    private BigDecimal percentualIrpj;
    private BigDecimal impostoRendaPessoaJuridica;
    private BigDecimal lucroLiquido;
    private LocalDateTime dataCalculo;

    public DreResDTO(DemonstrativoDoResultadoDoExercicio dre) {
        this.id = dre.getId();
        this.quantidadeDeVendas = dre.getQuantidadeDeVendas();
        this.valorProduto = dre.getValorProduto();
        this.recursoFinanceiro = dre.getRecursoFinanceiro();
        this.despesaAdministrativa = dre.getDespesaAdministrativa();
        this.numeroFuncionarios = dre.getNumeroFuncionarios();
        this.salarioFuncionario = dre.getSalarioFuncionario();
        this.receitaBruta = dre.getReceitaBruta();
        this.percentualIcms = dre.getPercentualIcms();
        this.deducaoIcms = dre.getDeducaoIcms();
        this.receitaLiquida = dre.getReceitaLiquida();
        this.percentualCmv = dre.getPercentualCmv();
        this.custoMercadoriaVendida = dre.getCustoMercadoriaVendida();
        this.lucroBruto = dre.getLucroBruto();
        this.despesaComercial = dre.getDespesaComercial();
        this.despesaOperacional = dre.getDespesaOperacional();
        this.lucroAntesImposto = dre.getLucroAntesImposto();
        this.percentualIrpj = dre.getPercentualIrpj();
        this.impostoRendaPessoaJuridica = dre.getImpostoRendaPessoaJuridica();
        this.lucroLiquido = dre.getLucroLiquido();
        this.dataCalculo = dre.getDataCalculo();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantidadeDeVendas() {
        return quantidadeDeVendas;
    }

    public void setQuantidadeDeVendas(Integer quantidadeDeVendas) {
        this.quantidadeDeVendas = quantidadeDeVendas;
    }

    public BigDecimal getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(BigDecimal valorProduto) {
        this.valorProduto = valorProduto;
    }

    public BigDecimal getRecursoFinanceiro() {
        return recursoFinanceiro;
    }

    public void setRecursoFinanceiro(BigDecimal recursoFinanceiro) {
        this.recursoFinanceiro = recursoFinanceiro;
    }

    public BigDecimal getDespesaAdministrativa() {
        return despesaAdministrativa;
    }

    public void setDespesaAdministrativa(BigDecimal despesaAdministrativa) {
        this.despesaAdministrativa = despesaAdministrativa;
    }

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public BigDecimal getSalarioFuncionario() {
        return salarioFuncionario;
    }

    public void setSalarioFuncionario(BigDecimal salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }

    public BigDecimal getReceitaBruta() {
        return receitaBruta;
    }

    public void setReceitaBruta(BigDecimal receitaBruta) {
        this.receitaBruta = receitaBruta;
    }

    public BigDecimal getPercentualIcms() {
        return percentualIcms;
    }

    public void setPercentualIcms(BigDecimal percentualIcms) {
        this.percentualIcms = percentualIcms;
    }

    public BigDecimal getDeducaoIcms() {
        return deducaoIcms;
    }

    public void setDeducaoIcms(BigDecimal deducaoIcms) {
        this.deducaoIcms = deducaoIcms;
    }

    public BigDecimal getReceitaLiquida() {
        return receitaLiquida;
    }

    public void setReceitaLiquida(BigDecimal receitaLiquida) {
        this.receitaLiquida = receitaLiquida;
    }

    public BigDecimal getPercentualCmv() {
        return percentualCmv;
    }

    public void setPercentualCmv(BigDecimal percentualCmv) {
        this.percentualCmv = percentualCmv;
    }

    public BigDecimal getCustoMercadoriaVendida() {
        return custoMercadoriaVendida;
    }

    public void setCustoMercadoriaVendida(BigDecimal custoMercadoriaVendida) {
        this.custoMercadoriaVendida = custoMercadoriaVendida;
    }

    public BigDecimal getLucroBruto() {
        return lucroBruto;
    }

    public void setLucroBruto(BigDecimal lucroBruto) {
        this.lucroBruto = lucroBruto;
    }

    public BigDecimal getDespesaComercial() {
        return despesaComercial;
    }

    public void setDespesaComercial(BigDecimal despesaComercial) {
        this.despesaComercial = despesaComercial;
    }

    public BigDecimal getDespesaOperacional() {
        return despesaOperacional;
    }

    public void setDespesaOperacional(BigDecimal despesaOperacional) {
        this.despesaOperacional = despesaOperacional;
    }

    public BigDecimal getLucroAntesImposto() {
        return lucroAntesImposto;
    }

    public void setLucroAntesImposto(BigDecimal lucroAntesImposto) {
        this.lucroAntesImposto = lucroAntesImposto;
    }

    public BigDecimal getPercentualIrpj() {
        return percentualIrpj;
    }

    public void setPercentualIrpj(BigDecimal percentualIrpj) {
        this.percentualIrpj = percentualIrpj;
    }

    public BigDecimal getImpostoRendaPessoaJuridica() {
        return impostoRendaPessoaJuridica;
    }

    public void setImpostoRendaPessoaJuridica(BigDecimal impostoRendaPessoaJuridica) {
        this.impostoRendaPessoaJuridica = impostoRendaPessoaJuridica;
    }

    public BigDecimal getLucroLiquido() {
        return lucroLiquido;
    }

    public void setLucroLiquido(BigDecimal lucroLiquido) {
        this.lucroLiquido = lucroLiquido;
    }

    public LocalDateTime getDataCalculo() {
        return dataCalculo;
    }

    public void setDataCalculo(LocalDateTime dataCalculo) {
        this.dataCalculo = dataCalculo;
    }
}
