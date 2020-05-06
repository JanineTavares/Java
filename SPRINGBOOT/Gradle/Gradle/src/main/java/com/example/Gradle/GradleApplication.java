package com.example.Gradle;

import model.Calculadora;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author Janine Tavares
 * @since 15/04/2020
 * @version 1.0
 */
@SpringBootApplication
public class GradleApplication {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();

		calculadora.setValor1(8.6);
		calculadora.setValor2(7.2);

		SpringApplication.run(GradleApplication.class, args);
		System.out.println(calculadora);
		System.out.println("Resultado da soma entre os dois valores: " +calculadora.calcularValores());

	}

}
