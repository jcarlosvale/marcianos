package com.marcianos.learning.loja.entidade.outro;

import com.marcianos.learning.loja.entidade.Livro;

import java.io.Serializable;

public record Pessoa(String nome, int idade) implements Serializable {

}

