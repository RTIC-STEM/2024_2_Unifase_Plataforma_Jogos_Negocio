package org.serratec.unifase.Unifase_Jogos_Negocio.dto.empresaModelo;

import org.serratec.unifase.Unifase_Jogos_Negocio.entity.EmpresaModelo;

import java.math.BigDecimal;

public class EmpresaModeloResDTO {

    private Long id;
    private String nomeEmpresa;
    private String setor;
    private String tamanho;
    private String tipoProdutoServico;
    private BigDecimal valorProduto;
    private BigDecimal capitalInicial;
    private Integer numeroFuncionarios;
    private BigDecimal salarioFuncionario;
    private String historia;

    public EmpresaModeloResDTO() {
    }

    public EmpresaModeloResDTO(EmpresaModelo empresaModelo) {
        this.id = empresaModelo.getId();
        this.nomeEmpresa = empresaModelo.getNomeEmpresa();
        this.setor = empresaModelo.getSetor();
        this.tamanho = empresaModelo.getTamanho();
        this.tipoProdutoServico = empresaModelo.getTipoProdutoServico();
        this.valorProduto = empresaModelo.getValorProduto();
        this.capitalInicial = empresaModelo.getCapitalInicial();
        this.numeroFuncionarios = empresaModelo.getNumeroFuncionarios();
        this.salarioFuncionario = empresaModelo.getSalarioFuncionario();
        this.historia = empresaModelo.getHistoria();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public BigDecimal getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(BigDecimal valorProduto) {
        this.valorProduto = valorProduto;
    }

    public BigDecimal getCapitalInicial() {
        return capitalInicial;
    }

    public void setCapitalInicial(BigDecimal capitalInicial) {
        this.capitalInicial = capitalInicial;
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

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }
}
