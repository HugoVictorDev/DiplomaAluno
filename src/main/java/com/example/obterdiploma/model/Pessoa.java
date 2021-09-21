package com.example.obterdiploma.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class Pessoa {

    private String nome;
    private String endereco;
    private int idade;
    private List<Disciplinas> listaDeDisciplinas;


    public Pessoa(String nome, String endereco, int idade, List listaDeDisciplinas) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.listaDeDisciplinas = listaDeDisciplinas;

    }




    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", idade=" + idade +
                '}';
    }


//    public void add(String nome, String endereco, int idade, List<Disciplinas> listaDeDisciplinas) {
//    }
}
