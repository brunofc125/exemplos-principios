/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.reusocomposicao.errado.model;

/**
 *
 * @author bruno
 */
public class Funcionario {
    private int tempoServicoMesSemFerias;

    public Funcionario(int tempoServicoMesSemFerias) {
        this.tempoServicoMesSemFerias = tempoServicoMesSemFerias;
    }

    public int getTempoServicoMesSemFerias() {
        return tempoServicoMesSemFerias;
    }

    public void setTempoServicoMesSemFerias(int tempoServicoMesSemFerias) {
        this.tempoServicoMesSemFerias = tempoServicoMesSemFerias;
    }
    
    public int calcularFerias(){
        return this.tempoServicoMesSemFerias >= 12 ? 1 : 0;
    }
}
