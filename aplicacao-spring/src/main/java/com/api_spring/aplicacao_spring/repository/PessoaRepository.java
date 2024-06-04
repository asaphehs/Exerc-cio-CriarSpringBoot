package com.api_spring.aplicacao_spring.repository;

import com.api_spring.aplicacao_spring.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

//Entidade q se relaciona c repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
