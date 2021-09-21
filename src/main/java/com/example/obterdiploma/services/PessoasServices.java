package com.example.obterdiploma.services;

import com.example.obterdiploma.model.Pessoa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PessoasServices {
    List<Pessoa> listaDePessoas = new ArrayList<>();

    public Pessoa adicionarPessoa(Pessoa pessoa){
        listaDePessoas.add(pessoa);
        return pessoa;

    }

    public List<Pessoa> getListaDePessoas() {
        return listaDePessoas;
    }
}
