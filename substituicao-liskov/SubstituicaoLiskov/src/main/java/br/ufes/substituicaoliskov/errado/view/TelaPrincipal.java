/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.substituicaoliskov.errado.view;

import br.ufes.substituicaoliskov.errado.model.ContaComum;
import br.ufes.substituicaoliskov.errado.model.ContaSalario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bruno
 */
public class TelaPrincipal {

    public static void main(String[] args) {
        try {
            List<ContaComum> listaDeContas = new ArrayList<>();
            listaDeContas.add(new ContaComum(2445));
            listaDeContas.add(new ContaSalario(6843));

            for (var conta : listaDeContas) {
                conta.rende();

                System.out.println("Novo Saldo:");
                System.out.println(conta.getSaldo());
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
