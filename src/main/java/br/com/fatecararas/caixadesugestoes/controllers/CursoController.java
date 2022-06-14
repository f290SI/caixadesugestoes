package br.com.fatecararas.caixadesugestoes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fatecararas.caixadesugestoes.model.Curso;
import br.com.fatecararas.caixadesugestoes.services.CursoService;

@RequestMapping("/cursos")
@Controller
public class CursoController {

    @Autowired
    private CursoService service;
    
    @GetMapping("/adicionar")
    public String adicionarCurso(Curso curso) {
        return "cursos/adicionar";
    }

    @PostMapping("/salvar")
    public String salvar(Curso curso) {
        service.salvar(curso);
        return "redirect:/cursos/adicionar";
    }

}
