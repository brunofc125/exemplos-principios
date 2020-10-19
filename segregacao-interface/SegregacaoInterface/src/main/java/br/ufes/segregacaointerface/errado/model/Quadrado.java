/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.segregacaointerface.errado.model;

import br.ufes.segregacaointerface.errado.interfaces.Figura;

/**
 *
 * @author bruno
 */
public class Quadrado implements Figura {
    
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return this.lado*this.lado;
    }

    @Override
    public double calcularVolume() {
        throw new UnsupportedOperationException("Quadrado não tem volume"); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
