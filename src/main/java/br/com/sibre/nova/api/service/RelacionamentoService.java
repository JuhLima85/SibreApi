package br.com.sibre.nova.api.service;

import br.com.sibre.nova.api.domain.entity.GrauDeParentesco;
import br.com.sibre.nova.api.domain.entity.Membro;
import br.com.sibre.nova.api.domain.entity.Relacionamento;
import br.com.sibre.nova.api.dto.RelacionamentoDTO;

import java.util.List;

public interface RelacionamentoService {

    List<Relacionamento> adicionarRelacionamento(Membro pessoa1, Membro pessoa2, GrauDeParentesco grauDeParentesco);

    void deletarRelacionamento(Long id);

    List<RelacionamentoDTO> listarFamiliarEGrauParentesco(Long idPessoa);
}
