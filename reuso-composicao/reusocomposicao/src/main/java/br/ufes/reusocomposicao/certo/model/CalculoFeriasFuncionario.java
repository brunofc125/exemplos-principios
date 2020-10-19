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
public class CalculoFeriasFuncionario implements ICalculoFerias {

    @Override
    public int calcularFerias(Funcionario funcionario) {
        return funcionario.getTempoServicoMesSemFerias() >= 12 ? 1 : 0;

    }
    
}
