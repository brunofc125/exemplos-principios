/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.responsabilidadeunica.errado.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
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

    public Livraria(String nome, List<LivrariaLivro> livrariaLivros) {
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

    public void addLivro() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ISBN do livro:");
        String ISBN = sc.nextLine();
        var livroISBN = this.livrariaLivros.stream().filter(l -> l.getLivro().getISBN().equals(ISBN)).collect(Collectors.toList());
        if(livroISBN == null || livroISBN.isEmpty()) {
            System.out.println("Nome do livro:");
            String nome = sc.nextLine();
            System.out.println("Nome do autor do livro:");
            String autor = sc.nextLine();
            var livro = new Livro(ISBN, nome, autor);
            var livrariaLivro = new LivrariaLivro(this, livro, 1);
            this.livrariaLivros.add(livrariaLivro);
        } else {
            livroISBN.get(0).incrementarQuantidade();
        }

    }

}
