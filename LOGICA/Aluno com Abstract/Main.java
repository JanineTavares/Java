import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();
        DecimalFormat df = new DecimalFormat("#.00");
        
        System.out.println("\f");
       
        System.out.println("Insira o nome do aluno");
        aluno.setNome(scanner.nextLine());
        
        System.out.println("Insira a nota 1 do aluno");
        aluno.setNota1(scanner.nextDouble());
        
        System.out.println("Insira a nota 2 do aluno");
        aluno.setNota2(scanner.nextDouble());
        
        System.out.println("\nA média é: " + df.format(aluno.calcularMedia() ));
        
        System.out.println("\nO Aluno está: " + aluno.definirSituacao());
        
        System.out.println("\nO aluno recebeu: " +aluno.definirConceito());
    }
}        