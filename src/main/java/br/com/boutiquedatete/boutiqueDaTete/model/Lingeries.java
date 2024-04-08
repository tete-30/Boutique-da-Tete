package br.com.boutiquedatete.boutiqueDaTete.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.processing.Generated;
import java.math.BigDecimal;

@Document(collection = "lingeries")
@Data
public class Lingeries {
    @Id
    private Long id;
    private String nome;
    private String tipo;
    private BigDecimal preço;
    private int quantidade;
    private String marca;
    private String cor;
    private String tamanho;
    private String descricao;




}
