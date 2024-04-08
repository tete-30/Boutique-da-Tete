package br.com.boutiquedatete.boutiqueDaTete.model.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CadastroRequestDTO {

    private String nome;
    private String sobrenome;
    private LocalDate dataDeNascimento;
    private String cpf;
    private String email;
    private String userNameLogin;
    private String senha;
}
