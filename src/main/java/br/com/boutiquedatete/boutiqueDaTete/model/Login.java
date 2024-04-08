package br.com.boutiquedatete.boutiqueDaTete.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "login")
@Data
public class Login {

    private String userNameLogin;
    private String senha;

}
