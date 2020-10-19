/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.reusocomposicao.certo.view;

import br.ufes.reusocomposicao.certo.model.CalculoFeriasFuncionario;
import br.ufes.reusocomposicao.certo.model.CalculoFeriasGerente;
import br.ufes.reusocomposicao.certo.model.Funcionario;
import br.ufes.reusocomposicao.certo.model.Gerente;




/**
 *
 * @author bruno
 */
public class TelaPrincipal {

    public static void main(String[] args) {
        try {
            var f = new Funcionario(15, new CalculoFeriasFuncionario());
            var g = new Gerente(true, 15, new CalculoFeriasGerente());
            System.out.println("Meses de ferias gerente: " + g.calcularFerias());
            System.out.println("Meses de ferias funcionario: " + f.calcularFerias());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
