package domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cad_Membro", uniqueConstraints = {@UniqueConstraint(columnNames = "cpf", name = "unique_cpf_constraint")})
public class Membro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_c;
    @Column(length = 200, nullable = false)
    private String nome;
    private String cpf;
    @Column(length = 20, unique = true)
    private String telefone;
    @Column(length = 40)
    private String email;
    private String dataCriacaoCadastro;
    private String cep;
    private String endereco;
    private String cidade;
    private boolean membro;
    @OneToMany(mappedBy = "pessoa1", cascade = CascadeType.ALL)
    private List<Relacionamento> relacionamentosPessoa1;

    @OneToMany(mappedBy = "pessoa2", cascade = CascadeType.ALL)
    private List<Relacionamento> relacionamentosPessoa2;
}
