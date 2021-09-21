package com.example.obterdiploma.model;


import lombok.Data;

import java.util.List;

@Data
public class Disciplinas {
    private String materia;
    private Double nota;




    public Disciplinas(String materia, Double nota) {
        this.materia = materia;
        this.nota = nota;
    }

    public Disciplinas() {

    }

    @Override
    public String toString() {
        return "Disciplinas{" +
                "materia='" + materia + '\'' +
                ", nota=" + nota +
                '}';
    }
}
