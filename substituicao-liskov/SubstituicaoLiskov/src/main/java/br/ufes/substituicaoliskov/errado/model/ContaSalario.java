/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.substituicaoliskov.errado.model;

/**
 *
 * @author bruno
 */
public class ContaSalario extends ContaComum {
    
    public ContaSalario(double saldo) {
        super(saldo);
    }
    
    @Override
    public void rende() {
        throw new RuntimeException("Essa conta não possui rendimento");
    }
}
