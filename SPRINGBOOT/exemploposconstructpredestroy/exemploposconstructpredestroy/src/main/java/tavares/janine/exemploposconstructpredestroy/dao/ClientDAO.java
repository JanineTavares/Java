package tavares.janine.exemploposconstructpredestroy.dao;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tavares.janine.exemploposconstructpredestroy.model.Client;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
/**
 * @author Janine Tavares
 * @since 16/04/2020
 * @version 1.0
 */
@Component
@Getter @Setter
public class ClientDAO {

    @Autowired
    private Client client;

    @PostConstruct
    public void postConstructor() {
        System.out.println("Objeto criado");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Objeto finalizado");
    }

}
