package br.com.boutiquedatete.boutiqueDaTete.repository;

import br.com.boutiquedatete.boutiqueDaTete.model.EsqueciMinhaSenha;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EsqueciMinhaSenhaRepository extends MongoRepository<EsqueciMinhaSenha,String> {
}
