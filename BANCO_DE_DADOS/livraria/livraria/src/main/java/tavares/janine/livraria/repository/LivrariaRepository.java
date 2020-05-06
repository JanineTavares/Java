package tavares.janine.livraria.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tavares.janine.livraria.models.BookStoreEntity;

@Repository
public interface LivrariaRepository extends CrudRepository<BookStoreEntity, Long> {

}

