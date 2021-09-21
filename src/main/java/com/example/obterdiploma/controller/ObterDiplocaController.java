package com.example.obterdiploma.controller;

import com.example.obterdiploma.model.Disciplinas;

import com.example.obterdiploma.model.Pessoa;
import com.example.obterdiploma.services.PessoasServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@RestController
public class ObterDiplocaController {



    @Autowired
    private PessoasServices pessoasServices;

    @GetMapping("/listadepessoas")
    public List<Pessoa> retornarPessoas() {

        return pessoasServices.getListaDePessoas();
    }



    @PostMapping("/pessoaPost")
    public Pessoa cadastrarPessoa(@RequestBody Pessoa pessoa){

       return pessoasServices.adicionarPessoa(pessoa);




    }
}
