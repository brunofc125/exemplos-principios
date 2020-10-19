/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.abertofechado.errado;

import br.ufes.abertofechado.errado.model.Funcionario;
import br.ufes.abertofechado.errado.model.TipoFuncionarioEnum;
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
public class FuncionarioTest {

    public FuncionarioTest() {
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
        var func = new Funcionario("Bruno", TipoFuncionarioEnum.GERENTE, 20000);
        func.calcularSalarioTotal();
        var salarioEsperado = 26000;
        assertEquals(salarioEsperado, func.getSalarioTotal(), 0.001);
    }
}
