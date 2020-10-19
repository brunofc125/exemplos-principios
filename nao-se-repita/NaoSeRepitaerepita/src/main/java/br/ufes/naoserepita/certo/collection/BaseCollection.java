/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.naoserepita.certo.collection;

import br.ufes.naoserepita.certo.model.BaseModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bruno
 * @param <T>
 */
public class BaseCollection<T extends BaseModel> {
    protected List<T> dados;

    public BaseCollection() {
        this.dados = new ArrayList<>();
    }
    
    public void add(T dado) {
        dados.add(dado);
    }
    
    public T findById(int id) {
        for(var dado : dados) {
            if(dado.getId() == id) {
                return dado;
            }
        }
        return null;
    }
    
}
