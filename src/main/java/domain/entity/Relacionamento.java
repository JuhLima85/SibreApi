package domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Relacionamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "pessoa1_id")
    private Membro pessoa1;
    @ManyToOne
    @JoinColumn(name = "pessoa2_id")
    private Membro pessoa2;
    @ManyToOne
    @JoinColumn(name = "grau_de_parentesco_id")
    private GrauDeParentesco grauDeParentesco;

    public Relacionamento(Long id, Membro pessoa2, GrauDeParentesco grauDeParentesco) {
        super();
        this.id = id;
        this.pessoa2 = pessoa2;
        this.grauDeParentesco = grauDeParentesco;
    }
}
