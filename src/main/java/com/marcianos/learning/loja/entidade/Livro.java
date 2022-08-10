package com.marcianos.learning.loja.entidade;


public final class Livro implements Produto, Entregavel {
    @Override
    public double custoFrete() {
        return 10;
    }
}
