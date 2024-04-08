package br.com.boutiquedatete.boutiqueDaTete.controller;

import br.com.boutiquedatete.boutiqueDaTete.repository.EsqueciMinhaSenhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EsqueciMinhaSenhaController {

    @Autowired
    private EsqueciMinhaSenhaRepository esqueciMinhaSenhaRepository;
}
