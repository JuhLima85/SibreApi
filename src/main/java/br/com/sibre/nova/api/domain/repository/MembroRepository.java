package br.com.sibre.nova.api.domain.repository;

import br.com.sibre.nova.api.domain.entity.Membro;
import br.com.sibre.nova.api.dto.MembroDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MembroRepository extends JpaRepository<Membro, Long> {

    List<Membro> findByNomeContainingIgnoreCase(String nome);

    @Query("""
    SELECT new br.com.sibre.nova.api.dto.MembroDTO(
        m.id,
        m.nome,
        m.telefone,
        m.email,
        m.dataNascimento,
        m.dataCriacaoCadastro,
        m.cpf,
        m.cep,
        m.endereco,
        m.cidade,
        m.membro
    )
    FROM Membro m
    WHERE m.id = :id
    """)
    MembroDTO findMembroDTOById(@Param("id") Long id);

    List<Membro> findByMembroTrue();

    List<Membro> findByMembroFalse();

    Membro findByTelefone(String fone);
}
