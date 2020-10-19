package br.ufes.resposabilidadeunica.certo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import br.ufes.responsabilidadeunica.certo.model.Livraria;
import br.ufes.responsabilidadeunica.certo.model.Livro;
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
public class LivrariaTest {

    public LivrariaTest() {
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
        var livro = new Livro("1", "n1", "a1");
        var livraria = new Livraria("Livraria A");
        livraria.addLivro(livro);
        
        assertEquals(livro, livraria.getLivrariaLivros().get(0).getLivro());
    }
}
