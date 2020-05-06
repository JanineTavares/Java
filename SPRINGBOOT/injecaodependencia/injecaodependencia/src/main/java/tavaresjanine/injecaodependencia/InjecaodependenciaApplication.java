package tavaresjanine.injecaodependencia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import tavaresjanine.injecaodependencia.model.Pet;
/**
 * @author Janine Tavares
 * @since 16/04/2020
 * @version 1.0
 */
@SpringBootApplication
public class InjecaodependenciaApplication {

	public static void main(String[] args) {
		//numero 3 - Criamos uma variável ApplicationContext para ter o contexto da aplicação.
		ApplicationContext applicationContext = SpringApplication.run(InjecaodependenciaApplication.class, args);
		//SpringApplication.run(InjecaodependenciaApplication.class, args);

		Pet pet = applicationContext.getBean(Pet.class);
		pet.execute();

		//Primeira maneira. muda o objeto dentro do metodo execute diretamente na classe. Muito acoplado!
		//Pet pet = new Pet();
		//pet.execute();

		//segunda maneira, reduzimos o acoplamento. Desta forma enviamos qual objeto gostaria de trabalhar.
		//Pet pet1 = new Pet(new Cat());
		//pet1.execute();

		//Pet pet2 = new Pet(new Dog());
		//pet2.execute();


	}

}
