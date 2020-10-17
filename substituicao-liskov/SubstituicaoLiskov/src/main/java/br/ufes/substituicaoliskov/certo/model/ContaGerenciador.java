/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.substituicaoliskov.certo.model;

/**
 *
 * @author bruno
 */
public class ContaGerenciador {

    private double saldo;

    public ContaGerenciador(double saldo) {
        this.saldo = saldo;
    }
    
    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void rende(double taxa) {
        this.saldo = this.saldo + (this.saldo * taxa);
    }
}
