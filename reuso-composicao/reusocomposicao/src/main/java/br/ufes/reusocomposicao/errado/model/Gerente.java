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
public class Gerente extends Funcionario {
    
    private boolean chefe;

    public Gerente(boolean chefe, int tempoServicoMesSemFerias) {
        super(tempoServicoMesSemFerias);
        this.chefe = chefe;
    }

    public boolean isChefe() {
        return chefe;
    }

    public void setChefe(boolean chefe) {
        this.chefe = chefe;
    }

    @Override
    public int calcularFerias() {
        return this.chefe ? super.getTempoServicoMesSemFerias() / 6 : super.getTempoServicoMesSemFerias() / 8;
    }
    
    
}
