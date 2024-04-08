package br.com.boutiquedatete.boutiqueDaTete.repository;

import br.com.boutiquedatete.boutiqueDaTete.model.Lingeries;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LingeriesRepository extends MongoRepository<Lingeries, String> {
}
