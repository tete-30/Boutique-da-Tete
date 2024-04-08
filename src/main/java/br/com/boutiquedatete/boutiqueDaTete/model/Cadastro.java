package br.com.boutiquedatete.boutiqueDaTete.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "cadastro")
@Data
public class Cadastro {
    @Id
    private Long id;
    private String nome;
    private String sobrenome;
    private LocalDate dataDeNascimento;
    private String cpf;
    private String email;
    private String userNameLogin;
    private String senha;


}
