package alunoprincipal;
import alunoclasse.Aluno;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.00");
        Aluno aluno = new Aluno();
        double notas[] = new double[3];

        aluno.notas = notas;
        System.out.println("Insira o nome do(a) aluno(a)");
        aluno.setNome(scanner.next());
        System.out.println("Insira a primeira nota do aluno");
        notas[0] = scanner.nextDouble();

        System.out.println("Insira a segunda nota do aluno");
        notas[1] = scanner.nextDouble();

        System.out.println("Insira a terceita nota do aluno");
        notas[2] = scanner.nextDouble();


       System.out.println("A média do aluno " + aluno.getNome()+ " é :" + df.format(aluno.calcularMedia()));
       System.out.println("O conceito do aluno é: " + aluno.mostrarConceito());
    }
}