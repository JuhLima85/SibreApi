package br.com.sibre.nova.api.dto;

import java.util.Objects;

public class MembroDTO {

    private Long id;
    private String nome;
    private String telefone;
    private String email;
    private String dataNascimento;
    private String dataCriacaoCadastro;
    private String cpf;
    private String cep;
    private String endereco;
    private String cidade;
    private boolean membro;

    // Construtor vazio
    public MembroDTO() {
    }

    // Construtor completo
    public MembroDTO(Long id, String nome, String telefone, String email, String dataNascimento,
                     String dataCriacaoCadastro, String cpf, String cep, String endereco, String cidade, boolean membro) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.dataCriacaoCadastro = dataCriacaoCadastro;
        this.cpf = cpf;
        this.cep = cep;
        this.endereco = endereco;
        this.cidade = cidade;
        this.membro = membro;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDataCriacaoCadastro() {
        return dataCriacaoCadastro;
    }

    public void setDataCriacaoCadastro(String dataCriacaoCadastro) {
        this.dataCriacaoCadastro = dataCriacaoCadastro;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
}
