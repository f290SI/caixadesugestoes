package br.com.fatecararas.caixadesugestoes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fatecararas.caixadesugestoes.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer>{
    
}
