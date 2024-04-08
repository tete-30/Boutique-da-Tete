package br.com.boutiquedatete.boutiqueDaTete.controller;

import br.com.boutiquedatete.boutiqueDaTete.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private LoginRepository loginRepository;
}
