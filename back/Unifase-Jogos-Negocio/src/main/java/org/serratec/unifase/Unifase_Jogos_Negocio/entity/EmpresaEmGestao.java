package org.serratec.unifase.Unifase_Jogos_Negocio.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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
    private String tipoProdutoServico;

    @Column(name = "historia", nullable = false, columnDefinition = "TEXT")
    private String historia;

    @ManyToOne
    private EmpresaModelo empresaModeloOriginal;

    @OneToMany(mappedBy = "empresa",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DemonstrativoDoResultadoDoExercicio> dre = new ArrayList<>();

    //Adiconar aluno responsável


    public EmpresaEmGestao() {
    }

    public EmpresaEmGestao(Long id, String nomeEmpresa, String setor, String tamanho, String tipoProdutoServico, String historia, EmpresaModelo empresaModeloOriginal, List<DemonstrativoDoResultadoDoExercicio> dre) {
        this.id = id;
        this.nomeEmpresa = nomeEmpresa;
        this.setor = setor;
        this.tamanho = tamanho;
        this.tipoProdutoServico = tipoProdutoServico;
        this.historia = historia;
        this.empresaModeloOriginal = empresaModeloOriginal;
        this.dre = dre;
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

    public List<DemonstrativoDoResultadoDoExercicio> getDre() {
        return dre;
    }

    public void setDre(List<DemonstrativoDoResultadoDoExercicio> dre) {
        this.dre = dre;
    }
}
