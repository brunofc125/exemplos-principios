/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.segregacaointerface.certo.view;

import br.ufes.segregacaointerface.certo.model.Cubo;
import br.ufes.segregacaointerface.certo.model.Quadrado;


/**
 *
 * @author bruno
 */
public class TelaPrincipal {

    public static void main(String[] args) {

        try {
            var quadrado = new Quadrado(3);
            var cubo = new Cubo(4);

            System.out.println("Area Cubo: " + cubo.calcularArea());
            System.out.println("Volume Cubo: " + cubo.calcularVolume());
            System.out.println("Area Quadrado: " + quadrado.calcularArea());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
