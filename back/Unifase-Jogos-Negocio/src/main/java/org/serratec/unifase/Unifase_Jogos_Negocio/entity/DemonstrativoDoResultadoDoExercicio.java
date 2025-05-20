package org.serratec.unifase.Unifase_Jogos_Negocio.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class DemonstrativoDoResultadoDoExercicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dre")
    private Long id;

    @Column(name = "quantidade_de_vendas", nullable = false)
    private Integer quantidadeDeVendas;

    @Column(name = "valor_produto", nullable = false)
    private BigDecimal valorProduto;

    @Column(name = "recurso_financeiro", nullable = false)
    private BigDecimal recursoFinanceiro;

    @Column(name = "despesa_administrativa", nullable = false)
    private BigDecimal despesaAdministrativa;

    @Column(name = "numero_funcionarios", nullable = false)
    private Integer numeroFuncionarios;

    @Column(name = "salario_funcionario", nullable = false)
    private BigDecimal salarioFuncionario;

    //Dados para calcular o DRE

    @Column(name = "receita_bruta")
    private BigDecimal receitaBruta;

    @Column(name = "percentual_icms")
    private BigDecimal percentualIcms;

    @Column(name = "deducao_icms")
    private BigDecimal deducaoIcms;

    @Column(name = "receita_liquida")
    private BigDecimal receitaLiquida;

    @Column(name = "percentual_cmv")
    private BigDecimal percentualCmv;

    @Column(name = "custo_mercadoria_vendida")
    private BigDecimal custoMercadoriaVendida;

    @Column(name = "lucro_bruto")
    private BigDecimal lucroBruto;

    @Column(name = "despesa_comercial")
    private BigDecimal despesaComercial;

    @Column(name = "despesa_operacional")
    private BigDecimal despesaOperacional;

    @Column(name = "lucro_antes_imposto")
    private BigDecimal lucroAntesImposto;

    @Column(name = "percentual_irpj")
    private BigDecimal percentualIrpj;

    @Column(name = "imposto_renda_pessoa_juridica")
    private BigDecimal impostoRendaPessoaJuridica;

    @Column(name = "lucro_liquido")
    private BigDecimal lucroLiquido;

    @Column(name = "data_calculo")
    private LocalDateTime dataCalculo;

    @ManyToOne
    @JoinColumn(name = "empresa_gerida_id")
    private EmpresaEmGestao empresa;

    public DemonstrativoDoResultadoDoExercicio() {
    }

    public DemonstrativoDoResultadoDoExercicio(Long id, Integer quantidadeDeVendas, BigDecimal valorProduto, BigDecimal recursoFinanceiro, BigDecimal despesaAdministrativa, Integer numeroFuncionarios, BigDecimal salarioFuncionario, BigDecimal receitaBruta, BigDecimal percentualIcms, BigDecimal deducaoIcms, BigDecimal receitaLiquida, BigDecimal percentualCmv, BigDecimal custoMercadoriaVendida, BigDecimal lucroBruto, BigDecimal despesaComercial, BigDecimal despesaOperacional, BigDecimal lucroAntesImposto, BigDecimal percentualIrpj, BigDecimal impostoRendaPessoaJuridica, BigDecimal lucroLiquido, LocalDateTime dataCalculo, EmpresaEmGestao empresa) {
        this.id = id;
        this.quantidadeDeVendas = quantidadeDeVendas;
        this.valorProduto = valorProduto;
        this.recursoFinanceiro = recursoFinanceiro;
        this.despesaAdministrativa = despesaAdministrativa;
        this.numeroFuncionarios = numeroFuncionarios;
        this.salarioFuncionario = salarioFuncionario;
        this.receitaBruta = receitaBruta;
        this.percentualIcms = percentualIcms;
        this.deducaoIcms = deducaoIcms;
        this.receitaLiquida = receitaLiquida;
        this.percentualCmv = percentualCmv;
        this.custoMercadoriaVendida = custoMercadoriaVendida;
        this.lucroBruto = lucroBruto;
        this.despesaComercial = despesaComercial;
        this.despesaOperacional = despesaOperacional;
        this.lucroAntesImposto = lucroAntesImposto;
        this.percentualIrpj = percentualIrpj;
        this.impostoRendaPessoaJuridica = impostoRendaPessoaJuridica;
        this.lucroLiquido = lucroLiquido;
        this.dataCalculo = dataCalculo;
        this.empresa = empresa;
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

    public EmpresaEmGestao getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaEmGestao empresa) {
        this.empresa = empresa;
    }
}
