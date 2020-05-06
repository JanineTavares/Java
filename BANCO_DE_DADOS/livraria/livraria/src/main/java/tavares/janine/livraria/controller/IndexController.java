package tavares.janine.livraria.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class IndexController {
    @GetMapping("/")
    public String index() {
        return "Seja bem-vindo a nossa livraria! " +
                "\n Adicione /livros ao final da url para ver os livros disponiveis";

    }
}
