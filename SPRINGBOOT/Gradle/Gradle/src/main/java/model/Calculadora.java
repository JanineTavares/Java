package model;
/**
 * @author Janine Tavares
 * @since 15/04/2020
 * @version 1.0
 */
public class Calculadora {
    private double valor1;
    private double valor2;


    public Calculadora() {
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double calcularValores() {
        return this.valor1 + this.valor2;
    }
    @Override
    public String toString() {
        return "Calculadora{" +
                "valor1=" + valor1 +
                ", valor2=" + valor2 +
                '}';
    }
}
