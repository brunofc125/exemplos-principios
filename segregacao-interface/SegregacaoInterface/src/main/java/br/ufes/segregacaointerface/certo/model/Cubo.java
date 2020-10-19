/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.segregacaointerface.certo.model;

import br.ufes.segregacaointerface.certo.interfaces.Figura3d;

/**
 *
 * @author bruno
 */
public class Cubo implements Figura3d {
    
    private int aresta;
    
    public Cubo(int aresta) {
        this.aresta = aresta;
    }

    public int getAresta() {
        return aresta;
    }

    public void setAresta(int aresta) {
        this.aresta = aresta;
    }

    @Override
    public double calcularArea() {
        return 6*this.aresta*this.aresta;
    }

    @Override
    public double calcularVolume() {
        return this.aresta*this.aresta*this.aresta;
    }
    
    
}
