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
public class LivrariaLivro {
    
    private Livraria livraria;
    private Livro livro;
    private int quantidade;

    public LivrariaLivro(Livraria livraria, Livro livro, int quantidade) {
        this.setLivraria(livraria);
        this.setLivro(livro);
        this.setQuantidade(quantidade);
    }

    public Livraria getLivraria() {
        return livraria;
    }

    public void setLivraria(Livraria livraria) {
        if(livraria == null) {
            throw new RuntimeException("Livraria não foi informada");
        }
        this.livraria = livraria;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        if(livro == null) {
            throw new RuntimeException("Livro não foi informado");
        }
        this.livro = livro;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade < 0) {
            throw new RuntimeException("Quantidade não pode ser negativa");
        }
        this.quantidade = quantidade;
    }
    
    
    
    
}
