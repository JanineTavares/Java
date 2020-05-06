
/**
 * Write a description of class Main here.
 *
 * author Janine Tavares
 * @version 1.0
 * @since 04/04/2020
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    public static void main(String args[]) {
        PesoIdeal info = new PesoIdeal();
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");  
        
        
        
       System.out.println("\nDigite seu nome: ");
       info.setNome(input.next());
       System.out.println("\nDigite sua idade: ");
       info.setIdade(input.nextInt());
       System.out.println("\nDigite seu sexo: ");
       info.setSexo(input.next());
       System.out.println("\nDigite seu peso: ");
       info.setPeso(input.nextDouble());
       System.out.println("\n\nDigite sua altura: ");
       info.setAltura(input.nextDouble());
        
       System.out.println(info.toString());
        
       System.out.printf("Seu IMC é: "+ df.format(info.calcularIMC()));
    }
}
