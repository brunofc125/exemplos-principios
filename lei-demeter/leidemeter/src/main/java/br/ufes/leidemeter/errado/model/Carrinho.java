/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.leidemeter.errado.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bruno
 */
public class Carrinho {
    private List<CarrinhoProduto> produtos;
    private String nome;
    private double valor;

    public Carrinho(String nome) {
        this.produtos = new ArrayList<>();
        this.setNome(nome);
        this.valor = 0;
    }

    public List<CarrinhoProduto> getProdutos() {
        return produtos;
    }

    public void addProduto(CarrinhoProduto produto) {
        this.produtos.add(produto);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null) {
            throw new RuntimeException("Nome de identificacao do carrinho nao foi informado");
        }
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }
    
    public double calcularValor() {
        double valorTotal = 0;
        for(var produto : this.produtos){
            valorTotal+=produto.getQtd()*produto.getProduto().getValor();
        }
        this.valor = valorTotal;
        return valorTotal;
    }
    
}
