

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste QuadradoTest.
 *
 * @author  (seu nome)
 * @version (um número de versão ou data)
 */
public class QuadradoTest
{
   //
    public QuadradoTest()
    {  quadrado.setLados(20);
    }
    
    public Quadrado quadrado = new Quadrado();

   
    /**
     * Define a .
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Chamado após cada método de teste de caso.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void calcularArea() {
        assertEquals(400, quadrado.calcularArea());
}
    @Test
    public void calcularPerimetro() {
        assertEquals(80, quadrado.calcularPerimetro());
}
}
