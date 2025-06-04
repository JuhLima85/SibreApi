package br.com.sibre.nova.api.domain.entity;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
public class Relacionamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pessoa1_id")
    private Membro pessoa1;

    @ManyToOne
    @JoinColumn(name = "pessoa2_id")
    private Membro pessoa2;

    @ManyToOne
    @JoinColumn(name = "grau_de_parentesco_id")
    private GrauDeParentesco grauDeParentesco;

    // Construtor vazio
    public Relacionamento() {
    }

    // Construtor completo
    public Relacionamento(Long id, Membro pessoa1, Membro pessoa2, GrauDeParentesco grauDeParentesco) {
        this.id = id;
        this.pessoa1 = pessoa1;
        this.pessoa2 = pessoa2;
        this.grauDeParentesco = grauDeParentesco;
    }

    // Construtor adicional
    public Relacionamento(Long id, Membro pessoa2, GrauDeParentesco grauDeParentesco) {
        this.id = id;
        this.pessoa2 = pessoa2;
        this.grauDeParentesco = grauDeParentesco;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Membro getPessoa1() {
        return pessoa1;
    }

    public void setPessoa1(Membro pessoa1) {
        this.pessoa1 = pessoa1;
    }

    public Membro getPessoa2() {
        return pessoa2;
    }

    public void setPessoa2(Membro pessoa2) {
        this.pessoa2 = pessoa2;
    }

    public GrauDeParentesco getGrauDeParentesco() {
        return grauDeParentesco;
    }

    public void setGrauDeParentesco(GrauDeParentesco grauDeParentesco) {
        this.grauDeParentesco = grauDeParentesco;
    }

    // equals e hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Relacionamento)) return false;
        Relacionamento that = (Relacionamento) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(pessoa1, that.pessoa1) &&
                Objects.equals(pessoa2, that.pessoa2) &&
                Objects.equals(grauDeParentesco, that.grauDeParentesco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pessoa1, pessoa2, grauDeParentesco);
    }

    // toString
    @Override
    public String toString() {
        return "Relacionamento{" +
                "id=" + id +
                ", pessoa1=" + pessoa1 +
                ", pessoa2=" + pessoa2 +
                ", grauDeParentesco=" + grauDeParentesco +
                '}';
    }
}