/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.responsabilidadeunica.certo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 *
 * @author bruno
 */
public class Livraria {

    private UUID id;
    private String nome;
    private List<LivrariaLivro> livrariaLivros;

    public Livraria(String nome) {
        this.id = UUID.randomUUID();
        this.setNome(nome);
        this.livrariaLivros = new ArrayList<>();
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null) {
            throw new RuntimeException("Nome da livraria não informado");
        }
        this.nome = nome;
    }

    public List<LivrariaLivro> getLivrariaLivros() {
        return livrariaLivros;
    }

    // metodo correto
    public void addLivro(Livro livro) {
        var livroISBN = this.getLivrariaLivroISBN(livro);
        if(livroISBN == null) {
            var livrariaLivro = new LivrariaLivro(this, livro, 1);
            this.livrariaLivros.add(livrariaLivro);
        } else {
            livroISBN.incrementarQuantidade();
        }
    }
    
    private LivrariaLivro getLivrariaLivroISBN(Livro livro) {
        var livroISBN = this.livrariaLivros.stream().filter(l -> l.getLivro().getISBN().equals(livro.getISBN())).collect(Collectors.toList());
        return livroISBN != null && !livroISBN.isEmpty() ? livroISBN.get(0) : null;
    }

}
