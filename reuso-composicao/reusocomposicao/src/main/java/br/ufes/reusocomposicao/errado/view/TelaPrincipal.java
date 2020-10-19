/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.reusocomposicao.errado.view;

import br.ufes.reusocomposicao.errado.model.Funcionario;
import br.ufes.reusocomposicao.errado.model.Gerente;


/**
 *
 * @author bruno
 */
public class TelaPrincipal {

    public static void main(String[] args) {
        try {
            var f = new Funcionario(15);
            var g = new Gerente(true, 15);
            System.out.println("Meses de ferias gerente: " + g.calcularFerias());
            System.out.println("Meses de ferias funcionario: " + f.calcularFerias());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
