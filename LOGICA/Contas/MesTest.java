import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste MesTest.
 *
 * @author  Janine Tavares
 * @version 1.0
 * @since 03/04/2020 - 11:06
 */
public class MesTest {
    
    private Mes mes = new Mes();
   
    public MesTest() {
        mes.setNumero(6);
       
    }

    
    @Before
    public void setUp()
    {
    }

    
    @After
    public void tearDown() {
    }
    
    @Test
    public void  testMostrarMes() {
        assertEquals("Mês válido", mes.mostrarMes());
        
    }
}
