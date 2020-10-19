/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.reusocomposicao.certo;

import br.ufes.reusocomposicao.certo.model.CalculoFeriasFuncionario;
import br.ufes.reusocomposicao.certo.model.CalculoFeriasGerente;
import br.ufes.reusocomposicao.certo.model.Funcionario;
import br.ufes.reusocomposicao.certo.model.Gerente;
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
public class CalcularFeriasTest {

    public CalcularFeriasTest() {
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
        var f = new Funcionario(15, new CalculoFeriasFuncionario());
        var g = new Gerente(true, 15, new CalculoFeriasGerente());
        var gFerias = g.calcularFerias();
        var fFerias = f.calcularFerias();

        assertEquals(2, gFerias);
        assertEquals(1, fFerias);
    }
}
