package com.api_spring.aplicacao_spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

@Entity //A classe representa uma entidade q vai ser mapeada p tabela do BD
@Table
public class Pessoa {//Pessoa é uma entidade
    //3. Criar atributos
    @Id
    private String nome;
    private String cpf;
    private String login;
    private String senha;
    private int idade;

    public Pessoa(String nome, String cpf, String login, String senha, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.login = login;
        this.senha = senha;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
