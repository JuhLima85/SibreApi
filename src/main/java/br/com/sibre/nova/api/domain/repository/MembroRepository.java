package br.com.sibre.nova.api.domain.repository;

import br.com.sibre.nova.api.domain.entity.Membro;
import br.com.sibre.nova.api.dto.MembroDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MembroRepository extends JpaRepository<Membro, Long> {

    List<Membro> findByNomeContainingIgnoreCase(String nome);

    @Query("SELECT new br.com.devsibre.Domain.Entity.DTO.CadastroDTO(f.id_c, f.nome, f.fone, f.email, f.data, f.cep, f.logradouro, f.bairro, f.localidade, f.uf, f.membro) FROM Formulario f WHERE f.id = :id")
    MembroDTO findCadastroDTOById(@Param("id") Long id);

    List<Membro> findByMembroTrue();

    List<Membro> findByMembroFalse();

    Membro findByFone(String fone);
}
