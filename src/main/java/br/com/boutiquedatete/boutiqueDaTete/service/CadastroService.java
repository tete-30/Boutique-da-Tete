package br.com.boutiquedatete.boutiqueDaTete.service;

import br.com.boutiquedatete.boutiqueDaTete.model.Cadastro;
import br.com.boutiquedatete.boutiqueDaTete.model.dto.CadastroRequestDTO;
import br.com.boutiquedatete.boutiqueDaTete.model.dto.converter.CadastroConverter;
import br.com.boutiquedatete.boutiqueDaTete.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;

@Service
public class CadastroService {

    @Autowired
    private CadastroRepository cadastroRepository;

    public CadastroService(CadastroRepository cadastroRepository) {
        this.cadastroRepository = cadastroRepository;
    }

    public void adicionar(CadastroRequestDTO cadastroRequestDTO) {

        if (cadastroRequestDTO.getNome() == null ||
                cadastroRequestDTO.getSobrenome() == null ||
                cadastroRequestDTO.getCpf() == null ||
                cadastroRequestDTO.getDataDeNascimento() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Todos os campos obrigatórios devem ser preenchidos.");
        }

        LocalDate dataAtual = LocalDate.now();
        if (cadastroRequestDTO.getDataDeNascimento().plusYears(18).isAfter(dataAtual)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Usuário deve ser maior de 18 anos para se cadastrar.");
        }

        String emailDoCadastroAdicionado = cadastroRequestDTO.getEmail();
        Cadastro cadastroExistente = buscarPeloEmail(emailDoCadastroAdicionado);
        if (cadastroExistente != null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Não é possível adicionar um usuário repetido. O usuário "
                    + emailDoCadastroAdicionado + " já existe no banco de dados.");
        }

        Cadastro cadastroEntity = CadastroConverter.converterParaEntidade(cadastroRequestDTO);
        cadastroRepository.save(cadastroEntity);
        throw new ResponseStatusException(HttpStatus.OK, "Cadastro realizado com sucesso!");
        }

    private Cadastro buscarPeloEmail(String email) {
        return cadastroRepository.findByEmail(email);
    }
}

