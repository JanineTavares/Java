

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AlunoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AlunoTest
{
    
        Aluno aluno = new Aluno();
    /**
     * Default constructor for test class AlunoTest
     */
    public AlunoTest(){
        aluno.setNota1(8.0);
        aluno.setNota2(7.0);
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    { 
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
    public void testDefinirSituacao() {
        assertEquals("Aprovado", aluno.definirSituacao());
    
}
@Test 
    public void testDefinirConceito() {
        assertEquals("Conceito C", aluno.definirConceito());
    
}
@Test 
     public void testCalcularMedia() {
         assertEquals(7.5, aluno.calcularMedia(), 0.0);
}
}
