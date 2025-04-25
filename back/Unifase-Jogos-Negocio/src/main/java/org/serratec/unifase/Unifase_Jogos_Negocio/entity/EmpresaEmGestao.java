package org.serratec.unifase.Unifase_Jogos_Negocio.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class EmpresaEmGestao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empresa_gerida")
    private Long id;

    @Column(name = "nome_empresa", nullable = false)
    private String nomeEmpresa;

    @Column(name = "setor", nullable = false)
    private String setor;

    @Column(name = "tamanho", nullable = false)
    private String tamanho;

    @Column(name = "tipo_produto_servico", nullable = false)
    private String tipoProdutoServiço;

    @Column(name = "valor_produto", nullable = false)
    private BigDecimal valorProduto;

    @Column(name = "capital_inicial", nullable = false)
    private BigDecimal capitalInicial;

    @Column(name = "numero_funcionarios", nullable = false)
    private Integer numeroFuncionarios;

    @Column(name = "salario_funcionario", nullable = false)
    private BigDecimal salarioFuncionario;

    @Column(name = "historia", nullable = false, columnDefinition = "TEXT")
    private String historia;

    @ManyToOne
    private EmpresaModelo empresaModeloOriginal;

    //Adiconar aluno responsável


    public EmpresaEmGestao() {
    }

    public EmpresaEmGestao(Long id, String nomeEmpresa, String setor, String tamanho, String tipoProdutoServiço, BigDecimal valorProduto, BigDecimal capitalInicial, Integer numeroFuncionarios, BigDecimal salarioFuncionario, String historia, EmpresaModelo empresaModeloOriginal) {
        this.id = id;
        this.nomeEmpresa = nomeEmpresa;
        this.setor = setor;
        this.tamanho = tamanho;
        this.tipoProdutoServiço = tipoProdutoServiço;
        this.valorProduto = valorProduto;
        this.capitalInicial = capitalInicial;
        this.numeroFuncionarios = numeroFuncionarios;
        this.salarioFuncionario = salarioFuncionario;
        this.historia = historia;
        this.empresaModeloOriginal = empresaModeloOriginal;
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

    public String getTipoProdutoServiço() {
        return tipoProdutoServiço;
    }

    public void setTipoProdutoServiço(String tipoProdutoServiço) {
        this.tipoProdutoServiço = tipoProdutoServiço;
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

    public EmpresaModelo getEmpresaModeloOriginal() {
        return empresaModeloOriginal;
    }

    public void setEmpresaModeloOriginal(EmpresaModelo empresaModeloOriginal) {
        this.empresaModeloOriginal = empresaModeloOriginal;
    }
}
