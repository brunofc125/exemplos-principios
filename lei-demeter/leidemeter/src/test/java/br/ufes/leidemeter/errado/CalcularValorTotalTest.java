/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.leidemeter.errado;

import br.ufes.leidemeter.errado.model.Carrinho;
import br.ufes.leidemeter.errado.model.CarrinhoProduto;
import br.ufes.leidemeter.errado.model.Produto;
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
public class CalcularValorTotalTest {

    public CalcularValorTotalTest() {
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
        var p1 = new Produto("Arroz", 10, 5);
        var p2 = new Produto("Feijao", 7, 9);
        var carrin = new Carrinho("Carrinho 1");
        var cp1 = new CarrinhoProduto(carrin, p1, 4);
        var cp2 = new CarrinhoProduto(carrin, p2, 5);
        var valorTotal = carrin.calcularValor();
        assertEquals(75, valorTotal, 0.001);
    }
}
