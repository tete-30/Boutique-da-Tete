package br.com.boutiquedatete.boutiqueDaTete.repository;

import br.com.boutiquedatete.boutiqueDaTete.model.Cadastro;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CadastroRepository extends MongoRepository<Cadastro,Long> {

    public Cadastro  findByEmail(String email);

}
