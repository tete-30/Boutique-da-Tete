package br.com.boutiquedatete.boutiqueDaTete.controller;

import br.com.boutiquedatete.boutiqueDaTete.model.dto.CadastroRequestDTO;
import br.com.boutiquedatete.boutiqueDaTete.service.CadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {

    @Autowired
    private CadastroService cadastroService;

    public CadastroController(CadastroService cadastroService) {
        this.cadastroService = cadastroService;
    }

    @PostMapping
    public ResponseEntity<Void> adicionarCadastro (@RequestBody CadastroRequestDTO cadastroRequest) {
        cadastroService.adicionar(cadastroRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
