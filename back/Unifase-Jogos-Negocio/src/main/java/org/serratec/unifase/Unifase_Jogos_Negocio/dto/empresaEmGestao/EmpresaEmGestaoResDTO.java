package org.serratec.unifase.Unifase_Jogos_Negocio.dto.empresaEmGestao;

import org.serratec.unifase.Unifase_Jogos_Negocio.dto.demonstrativoDoResultadoDoExercicio.DreResDTO;

public class EmpresaEmGestaoResDTO {
    private Long idEmpresa;
    private String nomeEmpresa;
    private String setor;
    private String tamanho;
    private String tipoProdutoServico;
    private String historia;
    private DreResDTO dreMaisRecente;

    public EmpresaEmGestaoResDTO(Long idEmpresa, String nomeEmpresa, String setor, String tamanho, String tipoProdutoServico, String historia, DreResDTO dreMaisRecente) {
        this.idEmpresa = idEmpresa;
        this.nomeEmpresa = nomeEmpresa;
        this.setor = setor;
        this.tamanho = tamanho;
        this.tipoProdutoServico = tipoProdutoServico;
        this.historia = historia;
        this.dreMaisRecente = dreMaisRecente;
    }

    public EmpresaEmGestaoResDTO() {
    }

    public Long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipoProdutoServico() {
        return tipoProdutoServico;
    }

    public void setTipoProdutoServico(String tipoProdutoServico) {
        this.tipoProdutoServico = tipoProdutoServico;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public DreResDTO getDreMaisRecente() {
        return dreMaisRecente;
    }

    public void setDreMaisRecente(DreResDTO dreMaisRecente) {
        this.dreMaisRecente = dreMaisRecente;
    }
}
