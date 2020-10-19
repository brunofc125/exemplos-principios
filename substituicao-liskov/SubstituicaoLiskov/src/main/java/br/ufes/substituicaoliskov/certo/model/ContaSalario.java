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
public class ContaSalario {

    private ContaGerenciador gerenciador;

    public ContaSalario(double saldo) {
        this.gerenciador = new ContaGerenciador(saldo);
    }

    public void deposita(double valor) {
        this.gerenciador.deposita(valor);
    }

    public void saca(double valor) {
        this.gerenciador.saca(valor);
    }

    public double getSaldo() {
        return this.gerenciador.getSaldo();
    }

    @Override
    public String toString() {
        return "Saldo conta salario-> " + this.getSaldo();
    }
}
