/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.responsabilidadeunica.errado.view;

import br.ufes.responsabilidadeunica.errado.model.Livraria;

/**
 *
 * @author bruno
 */
public class TelaPrincipal {
    public static void main(String[] args) {
        try {
            var livraria = new Livraria("Livraria A");
            livraria.addLivro();
            System.out.println("Livros");
            for(var livro : livraria.getLivrariaLivros()) {
                System.out.println(livro.getLivro().getNome());            
            }
        }  catch (RuntimeException e ) {
            System.out.println(e.getMessage());
        }
        
    }
}
