/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.inversaodependencia.certo.view;

import br.ufes.inversaodependencia.certo.model.GeradorRelatorioPDF;
import br.ufes.inversaodependencia.certo.model.Produto;


/**
 *
 * @author bruno
 */
public class TelaPrincipal {

    public static void main(String[] args) {
        try {
            var p = new Produto(1, "Arroz", 40, new GeradorRelatorioPDF());
            p.gerarRelatorio();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
