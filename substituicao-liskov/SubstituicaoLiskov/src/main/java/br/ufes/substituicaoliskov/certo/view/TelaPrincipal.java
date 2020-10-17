/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.substituicaoliskov.certo.view;

import br.ufes.substituicaoliskov.certo.model.ContaComum;
import br.ufes.substituicaoliskov.certo.model.ContaSalario;

/**
 *
 * @author bruno
 */
public class TelaPrincipal {

    public static void main(String[] args) {
        try {
            var contaComum = new ContaComum(2445);
            var contaSalario = new ContaSalario(6843);
            contaComum.rende();
            System.out.println("Novo Saldo: " + contaComum.getSaldo());
            System.out.println("Saldo: " + contaSalario.getSaldo());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
