/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.abertofechado.certo.model;

/**
 *
 * @author bruno
 */
public class Funcionario {
    private String nome;
    private TipoFuncionarioEnum tipoFuncionario;
    private double salarioBase;
    private double salarioTotal;

    public Funcionario(String nome, TipoFuncionarioEnum tipoFuncionario, double salarioBase) {
        this.setNome(nome);
        this.setTipoFuncionario(tipoFuncionario);
        this.setSalarioBase(salarioBase);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null) {
            throw new RuntimeException("Nome do funcionario nao informado");
        }
        this.nome = nome;
    }

    public TipoFuncionarioEnum getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(TipoFuncionarioEnum tipoFuncionario) {
        if(tipoFuncionario == null) {
            throw new RuntimeException("Tipo do funcionario não informado");
        }
        this.tipoFuncionario = tipoFuncionario;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
        this.calcularSalarioTotal();
    }

    public double getSalarioTotal() {
        return salarioTotal;
    }
    
    //metodo com principio
    public void calcularSalarioTotal() {
        this.salarioTotal = this.tipoFuncionario.getCalculoSalario().calcularSalario(this.salarioBase);
    }
    
}

