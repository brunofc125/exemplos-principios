/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.inversaodependencia.errado.model;

/**
 *
 * @author bruno
 */
public class GeradorRelatorioPDF {
    public void gerarRelatorio(Produto produto) {
        System.out.println("Relatório: " + produto.toString());
    }
}
