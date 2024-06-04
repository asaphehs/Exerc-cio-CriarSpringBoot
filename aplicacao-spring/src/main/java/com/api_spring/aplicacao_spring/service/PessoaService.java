package com.api_spring.aplicacao_spring.service;

import com.api_spring.aplicacao_spring.model.Pessoa;
import com.api_spring.aplicacao_spring.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service //Anotar como service pra comecar
public class PessoaService {

    @Autowired //Injetar as dependencias pra n fazer o new
    private PessoaRepository pessoaRepository; //Acessar camada Repository por isso cria obj do repository

    //São Query Methods, usados para recuperar info do BD

    //Salvou no BD
    public Pessoa save(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }
    //Lista td mundo
    public List<Pessoa> findAll() {
        return pessoaRepository.findAll();
    }
    //Lista por Id
    public Optional<Pessoa> findById(Long id) {
        return pessoaRepository.findById(id);
    }
    //Deletar por ID
    public void deletById(Long id) {
        pessoaRepository.deleteById(id);
    }


}
