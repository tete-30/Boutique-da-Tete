package br.com.boutiquedatete.boutiqueDaTete.model.dto.converter;

import br.com.boutiquedatete.boutiqueDaTete.model.Cadastro;
import br.com.boutiquedatete.boutiqueDaTete.model.dto.CadastroRequestDTO;

public class CadastroConverter {

    public static Cadastro converterParaEntidade (CadastroRequestDTO cadastroRequestDTO) {
        Cadastro cadastroEntity = new Cadastro();

        cadastroEntity.setNome(cadastroRequestDTO.getNome());
        cadastroEntity.setSobrenome(cadastroRequestDTO.getSobrenome());
        cadastroEntity.setDataDeNascimento(cadastroRequestDTO.getDataDeNascimento());
        cadastroEntity.setCpf(cadastroRequestDTO.getCpf());
        cadastroEntity.setUserNameLogin(cadastroRequestDTO.getUserNameLogin());
        cadastroEntity.setSenha(cadastroRequestDTO.getSenha());
        return cadastroEntity;
    }
}
