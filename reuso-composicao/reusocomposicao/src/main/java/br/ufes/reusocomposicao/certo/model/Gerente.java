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
public class Gerente extends Funcionario {
    
    private boolean chefe;

    public Gerente(boolean chefe, int tempoServicoMesSemFerias, ICalculoFerias calculoFerias) {
        super(tempoServicoMesSemFerias, calculoFerias);
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
        return this.getCalculoFerias().calcularFerias(this);
    }
    
    
}
