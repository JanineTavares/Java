package tavares.janine.exemploh2mysql.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tavares.janine.exemploh2mysql.model.ClientEntity;

@Repository
public interface ClientRepository extends CrudRepository<ClientEntity, Long>  {


    }

