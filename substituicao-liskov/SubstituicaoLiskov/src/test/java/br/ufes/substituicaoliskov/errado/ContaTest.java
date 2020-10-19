/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.substituicaoliskov.errado;

import br.ufes.substituicaoliskov.errado.model.ContaComum;
import br.ufes.substituicaoliskov.errado.model.ContaSalario;
import java.util.ArrayList;
import java.util.List;
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
public class ContaTest {

    public ContaTest() {
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
        List<ContaComum> listaDeContas = new ArrayList<>();
        listaDeContas.add(new ContaComum(2445));

        for (var conta : listaDeContas) {
            conta.rende();

            System.out.println("Novo Saldo:");
            System.out.println(conta.getSaldo());
        }
        
        var saldoNovo = 2493.9;
        
        assertEquals(saldoNovo, listaDeContas.get(0).getSaldo(), 0.001);
        
    }
}
