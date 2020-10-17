/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.abertofechado.errado.model;

/**
 *
 * @author bruno
 */
public enum TipoFuncionarioEnum {
    ATENDENTE("Atendente"), GERENTE("Gerente");

    private TipoFuncionarioEnum(String descricao) {
        this.descricao = descricao;
    }
    
    private final String descricao;
    
    public String getDescricao() {
        return this.descricao;
    }
    
}
