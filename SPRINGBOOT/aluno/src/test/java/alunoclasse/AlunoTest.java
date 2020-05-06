package alunoclasse;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlunoTest {

    Aluno aluno = new Aluno();

    @Before
    public void setUp() throws Exception {
        double notas[] = new double[3];
        notas[0] = 1;
        notas[1] = 2;
        notas[2] = 3;
        aluno.notas = notas;
    }
@After
    public void tearDown() throws Exception {


    }

    @Test
    public void testCalcularMedia() {
        assertEquals(2.00, aluno.calcularMedia(), 0.0);
    }

    @Test
    public void testMostrarConceito() {
        assertEquals("Conceito D", aluno.mostrarConceito());

    }
}