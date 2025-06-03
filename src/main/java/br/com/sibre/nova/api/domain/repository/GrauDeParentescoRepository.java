package br.com.sibre.nova.api.domain.repository;

import br.com.sibre.nova.api.domain.entity.GrauDeParentesco;
import br.com.sibre.nova.api.domain.entity.Membro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GrauDeParentescoRepository extends JpaRepository<GrauDeParentesco, Long> {
    GrauDeParentesco findByGrau(int grau);
}
