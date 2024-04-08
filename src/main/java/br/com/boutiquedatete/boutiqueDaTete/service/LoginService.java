package br.com.boutiquedatete.boutiqueDaTete.service;

import br.com.boutiquedatete.boutiqueDaTete.repository.LoginRepository;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private LoginRepository loginRepository;

    public LoginService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }
}
