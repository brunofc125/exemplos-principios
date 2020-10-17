/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.abertofechado.certo.calculo_salario;

/**
 *
 * @author bruno
 */
public class CaluloSalarioAtendente implements ICalculoSalario{
    
    @Override
    public double calcularSalario(double salarioBase) {
        return salarioBase + salarioBase*0.1;
    }
}
