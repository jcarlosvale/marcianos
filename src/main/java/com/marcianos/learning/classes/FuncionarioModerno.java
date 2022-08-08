package com.marcianos.learning.classes;

public record FuncionarioModerno(String nome, String matricula, String nacionalidade) {

    public FuncionarioModerno{
        if (nome != null){

        }
    }

    public FuncionarioModerno(String nome, String matricula) {
        this(nome, matricula, null);
    }
}
