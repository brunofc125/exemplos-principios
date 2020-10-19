/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.substituicaoliskov.certo;

import br.ufes.substituicaoliskov.certo.model.ContaComum;
import br.ufes.substituicaoliskov.certo.model.ContaSalario;
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
        var contaComum = new ContaComum(2445);
        var contaSalario = new ContaSalario(6843);
        contaComum.rende();
        var saldoNovoComum = 2493.9;
        var saldoNovoSalario = 6843;
        
        assertEquals(saldoNovoComum, contaComum.getSaldo(), 0.001);
        assertEquals(saldoNovoSalario, contaSalario.getSaldo(), 0.001);
    }
}
