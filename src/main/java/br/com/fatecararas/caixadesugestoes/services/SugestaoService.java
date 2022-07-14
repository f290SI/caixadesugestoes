package br.com.fatecararas.caixadesugestoes.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fatecararas.caixadesugestoes.model.Sugestao;
import br.com.fatecararas.caixadesugestoes.repositories.SugestaoRepository;

@Service
public class SugestaoService {
    
    @Autowired
    private SugestaoRepository repository;

    public List<Sugestao> buscarTodas() {
        List<Sugestao> sugestoes = new ArrayList<>();
        sugestoes = repository.findAll();
        // System.out.println(sugestoes);
        return sugestoes;
    }

}
