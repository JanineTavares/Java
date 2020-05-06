

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PesoIdealTest.
 *
 * author Janine Tavares
 * @version 1.0
 * @since 04/04/2020
 */
import java.text.DecimalFormat;
public class PesoIdealTest
{
    
    PesoIdeal info = new PesoIdeal();
    
    /**
     * Default constructor for test class PesoIdealTest
     */
    public PesoIdealTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() { 
       info.setPeso(46.3);
       info.setAltura(1.80);
        
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testCalcularIMC() {
        assertEquals(14.290123456790122, info.calcularIMC(), 0.0);
}
}
