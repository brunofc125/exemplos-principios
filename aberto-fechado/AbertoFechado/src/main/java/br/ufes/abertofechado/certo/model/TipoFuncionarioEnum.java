/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.abertofechado.certo.model;

import br.ufes.abertofechado.certo.calculo_salario.CalculoSalarioGerente;
import br.ufes.abertofechado.certo.calculo_salario.CaluloSalarioAtendente;
import br.ufes.abertofechado.certo.calculo_salario.ICalculoSalario;

/**
 *
 * @author bruno
 */
public enum TipoFuncionarioEnum {
    ATENDENTE("Atendente", new CaluloSalarioAtendente()),
    GERENTE("Gerente", new CalculoSalarioGerente());

    private TipoFuncionarioEnum(String descricao, ICalculoSalario calculoSalario) {
        this.descricao = descricao;
        this.calculoSalario = calculoSalario;
    }
    
    private final String descricao;
    private final ICalculoSalario calculoSalario;
    
    public String getDescricao() {
        return this.descricao;
    }
    
    public ICalculoSalario getCalculoSalario() {
        return this.calculoSalario;
    }
    
}
