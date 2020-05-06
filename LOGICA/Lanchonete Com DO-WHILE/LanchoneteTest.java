import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste LanchoneteTest.
 *
 * @author  Janine Tavares
 * @version 1.0
 * @since 03/04/2020
 */
public class LanchoneteTest {
    
    Lanchonete lanchonete =  new Lanchonete();
    /**
     * Construtor default para a classe de teste LanchoneteTest
     */
    public LanchoneteTest() {
        lanchonete.setValor(2.50);
        
        //lanchonete.setDescricao("Sanduiche de Presunto");
        lanchonete.setCodigo(1);
        lanchonete.setQuantidade(2);
        
    }

    /**
     * Define a .
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp(){
       //lanchonete.setValor(2.50);
       //lanchonete.setQuantidade(2);
        
    }

    /**
     * Tears down the test fixture.
     *
     * Chamado após cada método de teste de caso.
     */
    @After
    public void tearDown(){
    }
    
    @Test
    public void testDefinirValor() {
        System.out.println(lanchonete.definirValor(1));
        assertEquals(3.65, lanchonete.definirValor(1), 0.0);
        //assertEquals(2.50, lanchonete.definirValor(2), 0.0);
        //assertEquals(3.30, lanchonete.definirValor(3), 0.0);
        //assertEquals(4.70, lanchonete.definirValor(4), 0.0);
    }
    @Test
    public void testCalcularTotal() {
        System.out.println(lanchonete.calcularTotal());
      assertEquals(7.30, lanchonete.calcularTotal(), 0.0);
      //assertEquals(5.00, lanchonete.calcularTotal(), 0.0);
      //assertEquals(6.60, lanchonete.calcularTotal(), 0.0);
      //assertEquals(9.40, lanchonete.calcularTotal(), 0.0);
    }
   
    
    
}
