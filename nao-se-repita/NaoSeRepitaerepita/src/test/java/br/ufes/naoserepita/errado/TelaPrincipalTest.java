/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.naoserepita.errado;

import br.ufes.naoserepita.errado.collection.ClienteCollection;
import br.ufes.naoserepita.errado.collection.ProdutoCollection;
import br.ufes.naoserepita.errado.model.Cliente;
import br.ufes.naoserepita.errado.model.Produto;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bruno
 */
public class TelaPrincipalTest {

    public TelaPrincipalTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void CT001() {
        var produtos = new ProdutoCollection();
        produtos.add(new Produto(1, "Arroz"));
        produtos.add(new Produto(2, "Feijao"));
        produtos.add(new Produto(3, "Alface"));
        produtos.add(new Produto(4, "Tomate"));
        var p = produtos.findById(3);
        var produtosComO = produtos.getAllByName("o");
        assertEquals("Alface", p.getNome());
        assertEquals("Arroz", produtosComO.get(0).getNome());
        assertEquals("Feijao", produtosComO.get(1).getNome());
        assertEquals("Tomate", produtosComO.get(2).getNome());
    }

    @Test
    public void CT002() {
        var clientes = new ClienteCollection();
        clientes.add(new Cliente(1, "Bruno"));
        clientes.add(new Cliente(2, "Joao"));
        clientes.add(new Cliente(3, "Saulo"));
        clientes.add(new Cliente(4, "Maria"));
        var c = clientes.findById(4);
        var clientesComO = clientes.getAllByName("o");
        assertEquals("Maria", c.getNome());
        assertEquals("Bruno", clientesComO.get(0).getNome());
        assertEquals("Joao", clientesComO.get(1).getNome());
        assertEquals("Saulo", clientesComO.get(2).getNome());
    }

}
