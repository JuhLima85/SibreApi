package br.com.sibre.nova.api.dto;


import br.com.sibre.nova.api.domain.entity.Membro;

public class SaveOrUpdateResponse {
    private Membro membro;
    private boolean isNewCadastro;

    public SaveOrUpdateResponse(Membro membro, boolean isNewCadastro) {
        this.membro= membro;
        this.isNewCadastro = isNewCadastro;
    }

    public Membro getMembro() {
        return membro;
    }

    public boolean isNewCadastro() {
        return isNewCadastro;
    }
}
