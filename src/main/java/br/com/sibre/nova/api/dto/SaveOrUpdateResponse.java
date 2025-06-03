package br.com.sibre.nova.api.dto;


import br.com.sibre.nova.api.domain.entity.Membro;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SaveOrUpdateResponse {
    private Membro membro;
    private boolean isNewCadastro;

    public boolean isNewCadastro() {
        return isNewCadastro;
    }
}
