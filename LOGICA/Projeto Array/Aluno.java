
/**
 * Write a description of class Aluno here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.List;
public class Aluno {
   
    List<Aluno> alunos;
    
    
    public String nomes;
    public double notas1;
    public double notas2;
    
    public String definirNomes() {
        return nomes;
    }
    
    
    public double calcularMedia() {
        return (notas1 + notas2) / 2;
}




}


