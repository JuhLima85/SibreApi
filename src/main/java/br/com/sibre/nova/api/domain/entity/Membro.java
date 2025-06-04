package br.com.sibre.nova.api.domain.entity;

import jakarta.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "cad_Membro", uniqueConstraints = {@UniqueConstraint(columnNames = "cpf", name = "unique_cpf_constraint")})
public class Membro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_c;

    @Column(length = 200, nullable = false)
    private String nome;

    private String cpf;

    @Column(length = 20, unique = true)
    private String telefone;

    @Column(length = 40)
    private String email;

    private String dataCriacaoCadastro;

    private String dataNascimento;

    private String cep;

    private String endereco;

    private String cidade;

    private boolean membro;

    @OneToMany(mappedBy = "pessoa1", cascade = CascadeType.ALL)
    private List<Relacionamento> relacionamentosPessoa1;

    @OneToMany(mappedBy = "pessoa2", cascade = CascadeType.ALL)
    private List<Relacionamento> relacionamentosPessoa2;

    // Construtor vazio
    public Membro() {}

    // Getters e Setters
    public Long getId_c() {
        return id_c;
    }

    public void setId_c(Long id_c) {
        this.id_c = id_c;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataCriacaoCadastro() {
        return dataCriacaoCadastro;
    }

    public void setDataCriacaoCadastro(String dataCriacaoCadastro) {
        this.dataCriacaoCadastro = dataCriacaoCadastro;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public boolean isMembro() {
        return membro;
    }

    public void setMembro(boolean membro) {
        this.membro = membro;
    }

    public List<Relacionamento> getRelacionamentosPessoa1() {
        return relacionamentosPessoa1;
    }

    public void setRelacionamentosPessoa1(List<Relacionamento> relacionamentosPessoa1) {
        this.relacionamentosPessoa1 = relacionamentosPessoa1;
    }

    public List<Relacionamento> getRelacionamentosPessoa2() {
        return relacionamentosPessoa2;
    }

    public void setRelacionamentosPessoa2(List<Relacionamento> relacionamentosPessoa2) {
        this.relacionamentosPessoa2 = relacionamentosPessoa2;
    }

    // equals e hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Membro)) return false;
        Membro membro1 = (Membro) o;
        return membro == membro1.membro &&
                Objects.equals(id_c, membro1.id_c) &&
                Objects.equals(nome, membro1.nome) &&
                Objects.equals(cpf, membro1.cpf) &&
                Objects.equals(telefone, membro1.telefone) &&
                Objects.equals(email, membro1.email) &&
                Objects.equals(dataCriacaoCadastro, membro1.dataCriacaoCadastro) &&
                Objects.equals(dataNascimento, membro1.dataNascimento) &&
                Objects.equals(cep, membro1.cep) &&
                Objects.equals(endereco, membro1.endereco) &&
                Objects.equals(cidade, membro1.cidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_c, nome, cpf, telefone, email, dataCriacaoCadastro,
                dataNascimento, cep, endereco, cidade, membro);
    }

    // toString
    @Override
    public String toString() {
        return "Membro{" +
                "id_c=" + id_c +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", dataCriacaoCadastro='" + dataCriacaoCadastro + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", cep='" + cep + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cidade='" + cidade + '\'' +
                ", membro=" + membro +
                '}';
    }
}
