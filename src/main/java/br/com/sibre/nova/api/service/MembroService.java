package br.com.sibre.nova.api.service;

import br.com.sibre.nova.api.domain.entity.GrauDeParentesco;
import br.com.sibre.nova.api.domain.entity.Membro;
import br.com.sibre.nova.api.domain.entity.Relacionamento;
import br.com.sibre.nova.api.dto.SaveOrUpdateResponse;

import java.util.List;

public interface MembroService {
    List<Membro> listAll();

    List<Membro> findByNomeContainingIgnoreCase(String nome);

    boolean alterar(Membro dto);

    Membro getId(Long id);

    //FormularioModel saveOrUpdate(FormularioModel cm);

    SaveOrUpdateResponse saveOrUpdate(Membro cm);

    void delete(Long id);

    GrauDeParentesco buscarGrauDeParentescoPorGrau(int parentesco, Relacionamento relacionamento);
}
