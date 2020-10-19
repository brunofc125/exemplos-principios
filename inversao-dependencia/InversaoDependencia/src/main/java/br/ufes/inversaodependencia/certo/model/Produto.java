/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.inversaodependencia.certo.model;

/**
 *
 * @author bruno
 */
public class Produto {
    private int id;
    private String nome;
    private double preco;
    private GeradorRelatorio geradorRelatorio;

    public Produto(int id, String nome, double preco, GeradorRelatorio geradorRelatorio) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.geradorRelatorio = geradorRelatorio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public GeradorRelatorio getGeradorRelatorio() {
        return geradorRelatorio;
    }

    public void setGeradorRelatorio(GeradorRelatorio geradorRelatorio) {
        this.geradorRelatorio = geradorRelatorio;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", nome=" + nome + ", preco=" + preco + '}';
    }
    
    public void gerarRelatorio() {
        this.geradorRelatorio.gerarRelatorio(this);
    }
    
}
