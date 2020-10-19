/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.naoserepita.certo.collection;

import br.ufes.naoserepita.certo.model.Cliente;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author bruno
 */
public class ClienteCollection extends BaseCollection<Cliente> {

    public ClienteCollection() {
        super();
    }   
    
    public List<Cliente> getAllByName(String name) {
        return this.dados.stream().filter(p -> p.getNome().toUpperCase().contains(name.toUpperCase())).collect(Collectors.toList());
    }
    
}
