/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.naoserepita.certo.view;

import br.ufes.naoserepita.certo.collection.ClienteCollection;
import br.ufes.naoserepita.certo.collection.ProdutoCollection;
import br.ufes.naoserepita.certo.model.Cliente;
import br.ufes.naoserepita.certo.model.Produto;

/**
 *
 * @author bruno
 */
public class TelaPrincipal {
    
    public static ProdutoCollection produtos;
    
    public static ClienteCollection clientes;
    
    public static void main(String[] args) {
        try {
            popularProdutos();
            var p = produtos.findById(3);
            System.out.println("Produto 3: " + p.getNome());
            var produtosComO = produtos.getAllByName("o");
            System.out.println("Produtos com O: ");
            for(var prod : produtosComO) {
                System.out.println(prod.getNome());
            }
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            popularClientes();
            var c = clientes.findById(4);
            System.out.println("Cliente 3: " + c.getNome());
            var clientesComO = clientes.getAllByName("o");
            System.out.println("Clientes com O: ");
            for(var cli : clientesComO) {
                System.out.println(cli.getNome());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    private static void popularProdutos() {
        produtos = new ProdutoCollection();
        produtos.add(new Produto(1, "Arroz"));
        produtos.add(new Produto(2, "Feijao"));
        produtos.add(new Produto(3, "Alface"));
        produtos.add(new Produto(4, "Tomate"));
    }
    
    private static void popularClientes() {
        clientes = new ClienteCollection();
        clientes.add(new Cliente(1, "Bruno"));
        clientes.add(new Cliente(2, "Joao"));
        clientes.add(new Cliente(3, "Saulo"));
        clientes.add(new Cliente(4, "Maria"));
    }
    
}
