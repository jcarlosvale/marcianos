package com.marcianos.learning.loja.entidade;

public sealed interface Entregavel permits Livro {
    double custoFrete();
}
