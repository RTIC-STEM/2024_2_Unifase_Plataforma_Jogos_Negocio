package org.serratec.unifase.Unifase_Jogos_Negocio.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class EmpresaModelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empresa_modelo")
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

    @Lob
    @Column(name = "historia", nullable = false, columnDefinition = "TEXT")
    private String historia;

    //Adicionar id do professor responsável pela criação da empresa

}
