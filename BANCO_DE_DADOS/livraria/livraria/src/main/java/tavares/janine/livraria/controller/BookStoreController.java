package tavares.janine.livraria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tavares.janine.livraria.models.BookStoreEntity;
import tavares.janine.livraria.repository.LivrariaRepository;

import java.util.List;

/**
 * @author Janine Tavares
 * @since 23/04/2020
 * @version 1.0
 */
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")

@RequestMapping("/livros")
public class BookStoreController {

    @Autowired
    private LivrariaRepository livrariaRepository;

    /**
     *
     * @return Retorna toda lista de objetos (livros)
     */
    @GetMapping
    private ResponseEntity<List<BookStoreEntity>> showAll() { //ResponseEntity permite controlar body, status e headers
        return new ResponseEntity<List<BookStoreEntity>>(
                (List<BookStoreEntity>) this.livrariaRepository.findAll(),
                new HttpHeaders(), HttpStatus.OK);

    }

    /**
     *
     * @param id Id do objeto (livro) na lista criada
     * @return Retorna o objeto escolhido de acordo com o ID
     */
    @GetMapping(path = "/{id}")
    public ResponseEntity<BookStoreEntity> findById(@PathVariable("id") long id) {
        if (this.livrariaRepository.findById(id).isPresent()) {
            return new ResponseEntity<BookStoreEntity>(
                    this.livrariaRepository.findById(id).get(),
                    new HttpHeaders(),
                    HttpStatus.OK);
        }
        return new ResponseEntity<BookStoreEntity>(HttpStatus.NOT_FOUND);
    }

    /**
     *
     * @param bookStoreEntity
     * @return Retorna o objeto adicionado a lista
     */
    @PostMapping //metodo para adicionar um objeto a lista
    public ResponseEntity<BookStoreEntity> store (@RequestBody BookStoreEntity bookStoreEntity) {
        return new ResponseEntity<BookStoreEntity>(
                this.livrariaRepository.save(bookStoreEntity),
                new HttpHeaders(),
                HttpStatus.CREATED
        );

    }

    /**
     *
     * @param id
     * @param bookStoreEntity
     * @return
     * @throws Exception Caso objeto que deseja atualizar nao exista, um aviso será exibido
     */
    @PutMapping(value = "/{id}") // metodo para atualizar um valor já existente
    public ResponseEntity<BookStoreEntity> update (@PathVariable("id") long id,
                                                   @RequestBody BookStoreEntity bookStoreEntity) throws Exception {
        if (id == 0 || !this.livrariaRepository.existsById(id)) {
            throw new Exception("Código não encontrado ou inexistente!");
        }
        return new ResponseEntity<BookStoreEntity>(
                this.livrariaRepository.save(bookStoreEntity),
                new HttpHeaders(),
                HttpStatus.OK);
    }

    /**
     *
     * @param id
     * @return Retorna a lista sem o objeto deletado
     */
    @DeleteMapping(value = "/{id}") // metodo para deletar um valor
    public ResponseEntity<BookStoreEntity> delete(@PathVariable("id") long id) {
        this.livrariaRepository.deleteById(id);
        return new ResponseEntity<BookStoreEntity>(new HttpHeaders(), HttpStatus.OK);

    }


}


