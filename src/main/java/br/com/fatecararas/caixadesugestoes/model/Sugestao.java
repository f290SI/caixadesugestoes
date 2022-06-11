package br.com.fatecararas.caixadesugestoes.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Sugestao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String conteudo;
    private String autor;
    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "id_tiposugestao")
    private TipoSugestao tipo;

    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Curso curso;
    
    public Sugestao() {
    }

    public Sugestao(String conteudo, String autor, LocalDate data, Curso curso, TipoSugestao tipo) {
        this.conteudo = conteudo;
        this.autor = autor;
        this.data = data;
        this.curso = curso;
        this.tipo = tipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public TipoSugestao getTipo() {
        return tipo;
    }

    public void setTipo(TipoSugestao tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Sugestao [autor=" + autor + ", conteudo=" + conteudo + ", curso=" + curso + ", data=" + data + ", id="
                + id + ", tipo=" + tipo + "]";
    }

}
