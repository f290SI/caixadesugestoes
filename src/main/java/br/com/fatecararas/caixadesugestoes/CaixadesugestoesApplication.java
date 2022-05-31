package br.com.fatecararas.caixadesugestoes;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.fatecararas.caixadesugestoes.model.Curso;
import br.com.fatecararas.caixadesugestoes.repositories.CursoRepository;

@SpringBootApplication
public class CaixadesugestoesApplication implements CommandLineRunner{

	@Autowired
	private CursoRepository cursoRepository;

	public static void main(String[] args) {
		SpringApplication.run(CaixadesugestoesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Curso c1 = new Curso("Sistemas para Internet");
		Curso c2 = new Curso("Desenvolvimento Multiplataforma");
		Curso c3 = new Curso("Administração");

		List<Curso> cursos = Arrays.asList(c1, c2, c3);

		cursoRepository.saveAll(cursos);
	}

}
