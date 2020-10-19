/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.leidemeter.certo.view;

import br.ufes.leidemeter.certo.model.Carrinho;
import br.ufes.leidemeter.certo.model.CarrinhoProduto;
import br.ufes.leidemeter.certo.model.Produto;


/**
 *
 * @author bruno
 */
public class TelaPrincipal {

    public static void main(String[] args) {
        try {
            var p1 = new Produto("Arroz", 10, 5);
            var p2 = new Produto("Feijao", 7, 9);
            var carrin = new Carrinho("Carrinho 1");
            var cp1 = new CarrinhoProduto(carrin, p1, 4);
            var cp2 = new CarrinhoProduto(carrin, p2, 5);
            System.out.println("Valor total: " + carrin.getValor());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
