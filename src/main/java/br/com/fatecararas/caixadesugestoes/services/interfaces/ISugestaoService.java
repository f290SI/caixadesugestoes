package br.com.fatecararas.caixadesugestoes.services.interfaces;

import java.util.List;

import br.com.fatecararas.caixadesugestoes.model.Sugestao;

public interface ISugestaoService {
    
    void salvar(Sugestao sugestao);

    List<Sugestao> buscarTodas();

    List<Sugestao> buscarPorIdTipo(Integer id);
}
