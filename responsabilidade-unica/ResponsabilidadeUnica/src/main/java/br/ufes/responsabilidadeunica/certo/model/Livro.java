/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.responsabilidadeunica.certo.model;

import br.ufes.responsabilidadeunica.errado.model.*;

/**
 *
 * @author bruno
 */
public class Livro {
    
    private Long id;
    private String nome;
    private String autor;

    public Livro(Long id, String nome, String autor) {
        this.id = id;
        this.setNome(nome);
        this.setAutor(autor);
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null) {
            throw new RuntimeException("Nome do livro não informado");
        }
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if(autor == null) {
            throw new RuntimeException("Nome do autor não informado");
        }
        this.autor = autor;
    }
    
    
    
}
