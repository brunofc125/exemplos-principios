/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.responsabilidadeunica.certo.model;

import java.util.UUID;

/**
 *
 * @author bruno
 */
public class Livro {
    
    private UUID id;
    private String ISBN;
    private String nome;
    private String autor;

    public Livro(String ISBN, String nome, String autor) {
        this.id = UUID.randomUUID();
        this.setISBN(ISBN);
        this.setNome(nome);
        this.setAutor(autor);
    }

    public UUID getId() {
        return id;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        if(ISBN == null) {
            throw new RuntimeException("ISBN do livro não informado");
        }
        this.ISBN = ISBN;
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
