package br.com.fatecararas.caixadesugestoes.services;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fatecararas.caixadesugestoes.model.Sugestao;
import br.com.fatecararas.caixadesugestoes.repositories.SugestaoRepository;
import br.com.fatecararas.caixadesugestoes.services.interfaces.ISugestaoService;

@Service
public class SugestaoService implements ISugestaoService {

    @Autowired
    SugestaoRepository repository;

    @Override
    public void salvar(Sugestao sugestao) {
        if (Objects.isNull(sugestao.getId())) {
            repository.save(sugestao);
            return;
        }

        Optional<Sugestao> optional = repository.findById(sugestao.getId());

        if (optional.isPresent()) {
            sugestao.setId(optional.get().getId());
            repository.save(sugestao);
        }
    }

    @Override
    public List<Sugestao> buscarTodas() {
        return repository.findAll();
    }

    @Override
    public List<Sugestao> buscarPorIdTipo(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

}
