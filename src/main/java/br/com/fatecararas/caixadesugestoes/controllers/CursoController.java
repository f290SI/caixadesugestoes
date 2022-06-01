package br.com.fatecararas.caixadesugestoes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fatecararas.caixadesugestoes.model.Curso;

@RequestMapping("/cursos")
@Controller
public class CursoController {
    
    @GetMapping("/adicionar")
    public String adicionarCurso(Curso curso) {
        return "cursos/adicionar";
    }
}
