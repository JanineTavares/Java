package tavares.janine.exemploposconstructpredestroy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import tavares.janine.exemploposconstructpredestroy.dao.ClientDAO;
import tavares.janine.exemploposconstructpredestroy.model.Client;
/**
 * @author Janine Tavares
 * @since 16/04/2020
 * @version 1.0
 */
@SpringBootApplication
public class ExemploposconstructpredestroyApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExemploposconstructpredestroyApplication.class, args);
		ClientDAO clientDAO = applicationContext.getBean(ClientDAO.class);
		clientDAO.setClient(new Client("Janine Tavares"));

		System.out.println("Objeto ClientDAO: " + clientDAO);
		System.out.println("Objeto cliente: " + clientDAO.getClient());
	}

}
