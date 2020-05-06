package com.example.exemploalunoRota;

import com.example.exemploalunoRota.model.Aluno;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author Janine Tavares
 * @since 15/04/2020
 * @version 1.0
 */
@SpringBootApplication
public class ExemploalunoRotaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemploalunoRotaApplication.class, args);

		Aluno aluno = new Aluno(8.6, 9.2, "Janine");
		System.out.println(aluno);
		System.out.println("Média das notas: "+ aluno.calcularValores());
	}

}
