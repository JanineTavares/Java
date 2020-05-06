

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste CalculadoraTest.
 *
 * @author  (seu nome)
 * @version (um número de versão ou data)
 */
public class CalculadoraTest {
    
    
        private Calculadora calculadora = new Calculadora();
    
    
   public CalculadoraTest() {
       calculadora.setValor1(10); //
       
       
    }
    
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
    public void testSomar() {
        assertEquals(25.0, calculadora.somar(), 1.0);
        }
       
    @Test
    public void testDividir() {
        assertEquals(0.60, calculadora.dividir(), 1.0);
        }
        
        @Test
    public void testMultiplicar() {
        calculadora.setValor1(20); ///alterando valor da variavel
        assertEquals(300.0, calculadora.multiplicar(), 1.0);
        }
        
        @Test
    public void testSubtrair() {
        assertEquals(-5.0, calculadora.subtrair(), 1.0);
        }
}
