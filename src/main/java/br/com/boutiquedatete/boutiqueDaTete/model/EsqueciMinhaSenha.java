package br.com.boutiquedatete.boutiqueDaTete.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "esqueci minha senha")
@Data
public class EsqueciMinhaSenha {

    private String email;
}
