/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.responsabilidadeunica.certo.view;

import br.ufes.responsabilidadeunica.certo.model.Livraria;
import br.ufes.responsabilidadeunica.certo.model.Livro;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class TelaPrincipal {
    public static void main(String[] args) {
        
        try {
            var livraria = new Livraria("Livraria A");
            System.out.println("ISBN do livro:");
            var sc = new Scanner(System.in);
            String ISBN = sc.nextLine();
            System.out.println("Nome do livro:");
            String nome = sc.nextLine();
            System.out.println("Nome do autor do livro:");
            String autor = sc.nextLine();
            var livro = new Livro(ISBN, nome, autor);
            livraria.addLivro(livro);
            System.out.println("Livros");
            for(var livrariaLivro : livraria.getLivrariaLivros()) {
                System.out.println(livrariaLivro.getLivro().getNome());            
            }
        } catch (RuntimeException e ) {
            System.out.println(e.getMessage());
        }
        
    }
}
