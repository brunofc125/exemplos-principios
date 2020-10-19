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
public class CarrinhoProduto {
    private Carrinho carrinho;
    private Produto produto;
    private int qtd;
    private double valor;

    public CarrinhoProduto(Carrinho carrinho, Produto produto, int qtd) {
        this.carrinho = carrinho;
        this.produto = produto;
        this.setQtd(qtd);
        carrinho.addProduto(this);
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQtd() {
        return qtd;
    }

    public double getValor() {
        return valor;
    }

    public void setQtd(int qtd) {
        if(qtd < 0) {
            throw new RuntimeException("Quantidade do produto não pode ser negativa");
        } else if (qtd > this.produto.getQtd()) {
            throw new RuntimeException("Quantidade do produto não pode ser maior que o estoque");
        }
        this.produto.setQtd(this.produto.getQtd() - qtd);
        this.qtd = qtd;
        this.valor = qtd*this.produto.getValor();
    }
    
    
    
    
    
}
