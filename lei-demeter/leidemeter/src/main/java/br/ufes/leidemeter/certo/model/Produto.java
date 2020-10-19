/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.leidemeter.certo.model;

/**
 *
 * @author bruno
 */
public class Produto {

    private String nome;
    private double valor;
    private int qtd;

    public Produto(String nome, double valor, int qtd) {
        this.setNome(nome);
        this.setValor(valor);
        this.setQtd(qtd);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null) {
            throw new RuntimeException("Nome do produto não informado");
        }
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        if (qtd < 0) {
            throw new RuntimeException("Quantidade do produto não pode ser negativa");
        }
        this.qtd = qtd;
    }
}
