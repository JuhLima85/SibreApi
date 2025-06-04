package br.com.sibre.nova.api.service.impl;

import br.com.sibre.nova.api.domain.entity.GrauDeParentesco;
import br.com.sibre.nova.api.domain.entity.Membro;
import br.com.sibre.nova.api.domain.entity.Relacionamento;
import br.com.sibre.nova.api.domain.repository.GrauDeParentescoRepository;
import br.com.sibre.nova.api.domain.repository.MembroRepository;
import br.com.sibre.nova.api.domain.repository.RelacionamentoRepository;
import br.com.sibre.nova.api.dto.SaveOrUpdateResponse;
import br.com.sibre.nova.api.service.MembroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MembroServiceImpl implements MembroService {

    private MembroRepository membroRepository;
    private final RelacionamentoRepository relacionamentoRepository;
    private final GrauDeParentescoRepository grauDeParentescoRepository;

    @Autowired
    public MembroServiceImpl(MembroRepository membroRepository, RelacionamentoRepository relacionamentoRepository,
                                 GrauDeParentescoRepository grauDeParentescoRepository) {
        this.membroRepository = membroRepository;
        this.relacionamentoRepository = relacionamentoRepository;
        this.grauDeParentescoRepository = grauDeParentescoRepository;
    }

    //lista parentesco - busca todos os cadastros
    @Override
    public List<Membro> listAll() {
        List<Membro> cm = new ArrayList<>();
        membroRepository.findAll().forEach(cm::add);
        return cm;
    }

    @Override
    public List<Membro> findByNomeContainingIgnoreCase(String nome) {
        return membroRepository.findByNomeContainingIgnoreCase(nome);
    }

    public List<Membro> listarApenasMembros() {
        return membroRepository.findByMembroTrue();
    }

    public List<Membro> listarApenasNaoMembros() {
        return membroRepository.findByMembroFalse();
    }

    @Override
    public boolean alterar(Membro dto) {
        try {
            membroRepository.save(dto);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Membro getId(Long id) {
        return membroRepository.findById(id).get();
    }

    @Override
    public SaveOrUpdateResponse saveOrUpdate(Membro cm) {
        // Verifique se já existe um cadastro com o mesmo número de telefone
        Membro existingCadastro = membroRepository.findByTelefone(cm.getCpf());

        if (existingCadastro == null) {
            // Não há cadastro existente com o mesmo número de cpf, então podemos
            // salvar
            membroRepository.save(cm);
            return new SaveOrUpdateResponse(cm, true); // Retorna o DTO com isNewCadastro = true
        }

        return new SaveOrUpdateResponse(existingCadastro, false); // Retorna o DTO com isNewCadastro = false
    }

    @Override
    public void delete(Long id) {
        membroRepository.deleteById(id);
    }

    public GrauDeParentesco buscarGrauDeParentescoPorGrau(int parentesco, Relacionamento relacionamento) {
        GrauDeParentesco descricao = new GrauDeParentesco();
        descricao.setGrau(parentesco);

        switch (parentesco) {
            case 1:
                descricao.setDescricao("Pai");
                break;
            case 2:
                descricao.setDescricao("Mãe");
                break;
            case 3:
                descricao.setDescricao("Cônjuge");
                break;
            case 4:
                descricao.setDescricao("Filho(a)");
                break;
            case 5:
                descricao.setDescricao("Avô(a)");
                break;
            case 6:
                descricao.setDescricao("Neto(a)");
                break;
            case 7:
                descricao.setDescricao("Bisavô(a)");
                break;
            case 8:
                descricao.setDescricao("Bisneto(a)");
                break;
            case 9:
                descricao.setDescricao("Irmão(a)");
                break;
            case 10:
                descricao.setDescricao("Tio(a)");
                break;
            case 11:
                descricao.setDescricao("Sobrinho(a)");
                break;
            case 12:
                descricao.setDescricao("Primo(a)");
                break;
            case 13:
                descricao.setDescricao("Cunhado(a)");
                break;
            case 14:
                descricao.setDescricao("Genro/Nora");
                break;
            case 15:
                descricao.setDescricao("Padrasto(a)");
                break;
            case 16:
                descricao.setDescricao("Enteado(a)");
                break;
            case 17:
                descricao.setDescricao("Sogro(a)");
                break;
            case 18:
                descricao.setDescricao("Companheiro(a)");
                break;
            case 19:
                descricao.setDescricao("Noivo(a)");
                break;
            default:
                descricao.setDescricao("");
                break;
        }

        if (relacionamento != null) {
            GrauDeParentesco grauDeParentesco = relacionamento.getGrauDeParentesco();

            grauDeParentesco.setDescricao(descricao.getDescricao());

            //relacionamentoRepository.save(relacionamento);
            relacionamentoRepository.save(relacionamento);
        } else {
            grauDeParentescoRepository.save(descricao);
        }

        return descricao;
    }
}
