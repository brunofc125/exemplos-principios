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
public class CalculoFeriasGerente implements ICalculoFerias {

    @Override
    public int calcularFerias(Funcionario funcionario) {
        var g = (Gerente) funcionario;
        return g.isChefe() ? g.getTempoServicoMesSemFerias() / 6 : g.getTempoServicoMesSemFerias() / 8;
    }
    
}
