package com.api_spring.aplicacao_spring.controller;

import com.api_spring.aplicacao_spring.model.Pessoa;
import com.api_spring.aplicacao_spring.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//Ja anota q é um controller
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private final PessoaService pessoaService;

    public PessoaController(final PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    //Endpoint
    //Salvar pessoa
    @PostMapping
    public ResponseEntity<Pessoa> save(@RequestBody Pessoa pessoa) {
        pessoaService.save(pessoa);
        return ResponseEntity.ok(pessoa);
    }

    @GetMapping
    public List<Pessoa> findAll() {
        return pessoaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> findById(@PathVariable Long id) {
        return pessoaService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        pessoaService.deletById(id);
        return ResponseEntity.ok().build();
    }

}
