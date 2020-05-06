import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um valor");
        calculadora.setValor1(scanner.nextDouble());
        System.out.println("Insira um outro valor");
        calculadora.setValor2(scanner.nextDouble());




        System.out.println("A soma é: " + calculadora.somar());

        System.out.println("A divisao é: " + calculadora.dividir());

        System.out.println("A Multiplicação é: " + calculadora.multiplicar());

        System.out.println("A subtração é: " + calculadora.subtrair());
    }
}
