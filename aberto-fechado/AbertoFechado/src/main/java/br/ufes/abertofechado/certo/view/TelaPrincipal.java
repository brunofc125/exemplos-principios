package br.ufes.abertofechado.certo.view;

import br.ufes.abertofechado.certo.model.Funcionario;
import br.ufes.abertofechado.certo.model.TipoFuncionarioEnum;


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
