/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.segregacaointerface.certo;

import br.ufes.segregacaointerface.certo.model.Cubo;
import br.ufes.segregacaointerface.certo.model.Quadrado;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
        var quadrado = new Quadrado(3);
        var cubo = new Cubo(4);

        var areaQuadrado = 9;
        var areaCubo = 96;
        var volumeCubo = 64;
        
        assertEquals(areaQuadrado, quadrado.calcularArea(), 0.001);
        assertEquals(areaCubo, cubo.calcularArea(), 0.001);
        assertEquals(volumeCubo, cubo.calcularVolume(), 0.001);
    }
}
