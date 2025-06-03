package br.com.sibre.nova.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MembroDTO {

    private Long id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String dataCriacaoCadastro;
    private String dataNascimento;
    private String cep;
    private String enderoco;
    private String cidade;
    private boolean membro;
}
