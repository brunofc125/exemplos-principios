/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.abertofechado.errado.view;

import br.ufes.abertofechado.errado.model.Funcionario;
import br.ufes.abertofechado.errado.model.TipoFuncionarioEnum;

/**
 *
 * @author bruno
 */
public class TelaPrincipal {

    public static void main(String[] args) {
        try {
            var func = new Funcionario("Bruno", TipoFuncionarioEnum.GERENTE, 20000);
            func.calcularSalarioTotal();
            System.out.println("Salario total: " + func.getSalarioTotal());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
