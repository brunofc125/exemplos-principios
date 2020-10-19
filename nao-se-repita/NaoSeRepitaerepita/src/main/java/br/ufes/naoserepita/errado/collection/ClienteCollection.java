/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.naoserepita.errado.collection;

import br.ufes.naoserepita.errado.model.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author bruno
 */
public class ClienteCollection {

    private List<Cliente> clientes;

    public ClienteCollection() {
        this.clientes = new ArrayList<>();
    }

    public void add(Cliente dado) {
        clientes.add(dado);
    }

    public Cliente findById(int id) {
        for (var cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }

    public List<Cliente> getAllByName(String name) {
        return this.clientes.stream().filter(c -> c.getNome().toUpperCase().contains(name.toUpperCase())).collect(Collectors.toList());
    }

}
