package br.com.correios.repositories;

import br.com.correios.domain.dto.mongo.Etiqueta;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtiquetaRepository extends MongoRepository<Etiqueta, String> {

}
