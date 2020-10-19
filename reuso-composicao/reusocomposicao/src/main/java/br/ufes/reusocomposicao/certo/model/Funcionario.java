/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.reusocomposicao.certo.model;

/**
 *
 * @author bruno
 */
public class Funcionario {
    private int tempoServicoMesSemFerias;
    private ICalculoFerias calculoFerias;

    public Funcionario(int tempoServicoMesSemFerias, ICalculoFerias calculoFerias) {
        this.tempoServicoMesSemFerias = tempoServicoMesSemFerias;
        this.calculoFerias = calculoFerias;
    }

    public int getTempoServicoMesSemFerias() {
        return tempoServicoMesSemFerias;
    }

    public void setTempoServicoMesSemFerias(int tempoServicoMesSemFerias) {
        this.tempoServicoMesSemFerias = tempoServicoMesSemFerias;
    }

    public ICalculoFerias getCalculoFerias() {
        return calculoFerias;
    }

    public void setCalculoFerias(ICalculoFerias calculoFerias) {
        this.calculoFerias = calculoFerias;
    }
    
    public int calcularFerias(){
        return this.calculoFerias.calcularFerias(this);
    }
}
