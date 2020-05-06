package tavaresjanine.exemploescopo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import tavaresjanine.exemploescopo.dao.ClassDAO;
/**
 * @author Janine Tavares
 * @since 16/04/2020
 * @version 1.0
 */
@SpringBootApplication
public class ExemploescopoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExemploescopoApplication.class, args);


		//Desta forma o objectDAO1 e objectDAO2 serão a mesma instancia, isso devido ao fato que o Spring controla os Components com o patter Singleton


		//Para que isso não aconteça, devemos utilizar nas classes:
		//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)


		ClassDAO objectDAO1 = applicationContext.getBean(ClassDAO.class);
		ClassDAO objectDAO2 = applicationContext.getBean(ClassDAO.class);

		System.out.println("Objeto DAO: " + objectDAO1);
		System.out.println("Objeto JDBC: " + objectDAO1.getObjectJDBC());

		System.out.println("Objeto DAO: " + objectDAO2);
		System.out.println("Objeto JDBC: " + objectDAO2.getObjectJDBC());
		



	}
}
