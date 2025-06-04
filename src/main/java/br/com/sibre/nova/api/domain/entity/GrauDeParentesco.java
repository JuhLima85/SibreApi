package br.com.sibre.nova.api.domain.entity;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
public class GrauDeParentesco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int grau;

    private String descricao;

    // Construtor vazio
    public GrauDeParentesco() {
    }

    // Construtor com todos os atributos
    public GrauDeParentesco(Long id, int grau, String descricao) {
        this.id = id;
        this.grau = grau;
        this.descricao = descricao;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getGrau() {
        return grau;
    }

    public void setGrau(int grau) {
        this.grau = grau;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // equals e hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GrauDeParentesco)) return false;
        GrauDeParentesco that = (GrauDeParentesco) o;
        return grau == that.grau &&
                Objects.equals(id, that.id) &&
                Objects.equals(descricao, that.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, grau, descricao);
    }

    // toString
    @Override
    public String toString() {
        return "GrauDeParentesco{" +
                "id=" + id +
                ", grau=" + grau +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}