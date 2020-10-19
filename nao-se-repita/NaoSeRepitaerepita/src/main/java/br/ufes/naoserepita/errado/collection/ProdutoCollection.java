/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.naoserepita.errado.collection;

import br.ufes.naoserepita.errado.model.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author bruno
 */
public class ProdutoCollection {

    private List<Produto> produtos;

    public ProdutoCollection() {
        this.produtos = new ArrayList<>();
    }

    public void add(Produto dado) {
        produtos.add(dado);
    }

    public Produto findById(int id) {
        for (var produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    public List<Produto> getAllByName(String name) {
        return this.produtos.stream().filter(p -> p.getNome().toUpperCase().contains(name.toUpperCase())).collect(Collectors.toList());
    }

}
