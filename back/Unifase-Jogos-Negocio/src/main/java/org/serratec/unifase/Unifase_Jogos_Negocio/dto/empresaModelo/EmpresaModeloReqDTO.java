package org.serratec.unifase.Unifase_Jogos_Negocio.dto.empresaModelo;

import org.serratec.unifase.Unifase_Jogos_Negocio.entity.EmpresaModelo;

import java.math.BigDecimal;

public class EmpresaModeloReqDTO {

    private String nomeEmpresa;
    private String setor;
    private String tamanho;
    private String tipoProdutoServico;
    private Integer quantidadeDeVenda;
    private BigDecimal valorProduto;
    private BigDecimal recursoFinanceiro;
    private Integer numeroFuncionarios;
    private BigDecimal salarioFuncionario;
    private BigDecimal despesaAdministrativa;
    private String historia;

    public EmpresaModeloReqDTO() {
    }

    public EmpresaModeloReqDTO(EmpresaModelo empresaModelo) {
        this.nomeEmpresa = empresaModelo.getNomeEmpresa();
        this.setor = empresaModelo.getSetor();
        this.tamanho = empresaModelo.getTamanho();
        this.tipoProdutoServico = empresaModelo.getTipoProdutoServico();
        this.quantidadeDeVenda = empresaModelo.getQuantidadeDeVendas();
        this.valorProduto = empresaModelo.getValorProduto();
        this.recursoFinanceiro = empresaModelo.getRecursoFinanceiro();
        this.numeroFuncionarios = empresaModelo.getNumeroFuncionarios();
        this.salarioFuncionario = empresaModelo.getSalarioFuncionario();
        this.despesaAdministrativa = empresaModelo.getDespesaAdministrativa();
        this.historia = empresaModelo.getHistoria();
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

    public Integer getQuantidadeDeVenda() {
        return quantidadeDeVenda;
    }

    public void setQuantidadeDeVenda(Integer quantidadeDeVenda) {
        this.quantidadeDeVenda = quantidadeDeVenda;
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

    public BigDecimal getDespesaAdministrativa() {
        return despesaAdministrativa;
    }

    public void setDespesaAdministrativa(BigDecimal despesaAdministrativa) {
        this.despesaAdministrativa = despesaAdministrativa;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }
}
