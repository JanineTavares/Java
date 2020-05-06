
/**
 * Escreva a descrição da classe Principal aqui.
 * 
 * @author Janine Tavares
 * @version 1.0
 * @since 02/04/2020
 */

 import java.util.Scanner;
 public class Principal {
   public static void main (String args[]) {
       Scanner scanner = new Scanner(System.in);
       Mes mes = new Mes();
       
       mes.mostrarMes();
       
       System.out.println("Escolha um mês: ");
       mes.setNumero(scanner.nextInt());
       
       System.out.println(mes.mostrarMes());
       
       
       System.out.println("\nEscolha um mês: ");
       mes.setNumero(scanner.nextInt());
       
       System.out.println(mes.mostrarMes());
    }



}

