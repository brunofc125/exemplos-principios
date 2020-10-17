/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.responsabilidadeunica.certo.model;

import br.ufes.responsabilidadeunica.errado.model.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bruno
 */
public class Livraria {

    private String id;
    private String nome;
    private List<LivrariaLivro> livrariaLivros;

    public Livraria(String id, String nome, List<LivrariaLivro> livrariaLivros) {
        if(id == null) {
            throw new RuntimeException("Id da livraria não informado");
        }
        this.id = id;
        this.setNome(nome);
        this.livrariaLivros = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null) {
            throw new RuntimeException("Nome da livraria não informado");
        }
        this.nome = nome;
    }

    public List<LivrariaLivro> getLivrariaLivros() {
        return livrariaLivros;
    }

    
    
    
    
    
}
