package org.serratec.unifase.Unifase_Jogos_Negocio.service;

import org.serratec.unifase.Unifase_Jogos_Negocio.dto.empresaModelo.EmpresaModeloReqDTO;
import org.serratec.unifase.Unifase_Jogos_Negocio.dto.empresaModelo.EmpresaModeloResDTO;
import org.serratec.unifase.Unifase_Jogos_Negocio.entity.EmpresaModelo;
import org.serratec.unifase.Unifase_Jogos_Negocio.exception.NotFoundException;
import org.serratec.unifase.Unifase_Jogos_Negocio.repository.EmpresaModeloRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmpresaModeloService {
    private final EmpresaModeloRepository empresaModeloRepository;

    public EmpresaModeloService(EmpresaModeloRepository empresaModeloRepository) {
        this.empresaModeloRepository = empresaModeloRepository;
    }

    public EmpresaModeloReqDTO createEmpresaModelo (EmpresaModeloReqDTO empresaModeloReqDTO){
        EmpresaModelo empresaModelo = new EmpresaModelo();
        empresaModelo.setNomeEmpresa(empresaModeloReqDTO.getNomeEmpresa());
        empresaModelo.setSetor(empresaModeloReqDTO.getSetor());
        empresaModelo.setCapitalInicial(empresaModeloReqDTO.getCapitalInicial());
        empresaModelo.setTipoProdutoServico(empresaModeloReqDTO.getTipoProdutoServico());
        empresaModelo.setTamanho(empresaModeloReqDTO.getTamanho());
        empresaModelo.setValorProduto(empresaModeloReqDTO.getValorProduto());
        empresaModelo.setNumeroFuncionarios(empresaModeloReqDTO.getNumeroFuncionarios());
        empresaModelo.setSalarioFuncionario(empresaModeloReqDTO.getSalarioFuncionario());
        empresaModelo.setHistoria(empresaModeloReqDTO.getHistoria());

       empresaModeloRepository.save(empresaModelo);

       return new EmpresaModeloReqDTO(empresaModelo);
    }

    public Page<EmpresaModeloResDTO> getAllEmpresasModelo (Pageable pageable){
        Page<EmpresaModelo> empresasModelo = empresaModeloRepository.findAll(pageable);
        return empresasModelo.map(EmpresaModeloResDTO::new);
    }

    public EmpresaModeloResDTO findEmpresaModeloById (Long id){
        EmpresaModelo empresaModelo = empresaModeloRepository.findById(id).orElseThrow(
                () -> new NotFoundException("Não foi encontrada empresa com o id informado: " + id));

        return new EmpresaModeloResDTO(empresaModelo);
    }

    public EmpresaModeloResDTO updateEmpresaModelo (Long id, EmpresaModeloReqDTO empresaModeloReqDTO){
        EmpresaModelo empresaModelo = empresaModeloRepository.findById(id).orElseThrow(
                () -> new NotFoundException("Não foi encontrada empresa com o id informado: " + id));

        empresaModelo.setId(id);
        empresaModelo.setNomeEmpresa(empresaModeloReqDTO.getNomeEmpresa());
        empresaModelo.setSetor(empresaModeloReqDTO.getSetor());
        empresaModelo.setCapitalInicial(empresaModeloReqDTO.getCapitalInicial());
        empresaModelo.setTipoProdutoServico(empresaModeloReqDTO.getTipoProdutoServico());
        empresaModelo.setTamanho(empresaModeloReqDTO.getTamanho());
        empresaModelo.setValorProduto(empresaModeloReqDTO.getValorProduto());
        empresaModelo.setNumeroFuncionarios(empresaModeloReqDTO.getNumeroFuncionarios());
        empresaModelo.setSalarioFuncionario(empresaModeloReqDTO.getSalarioFuncionario());
        empresaModelo.setHistoria(empresaModeloReqDTO.getHistoria());

        EmpresaModelo empresaAtualizada = empresaModeloRepository.save(empresaModelo);

        return new EmpresaModeloResDTO(empresaAtualizada);
    }
}
