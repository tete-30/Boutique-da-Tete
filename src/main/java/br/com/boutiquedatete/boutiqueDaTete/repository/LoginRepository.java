package br.com.boutiquedatete.boutiqueDaTete.repository;

import br.com.boutiquedatete.boutiqueDaTete.model.Login;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LoginRepository extends MongoRepository<Login,String> {

}
