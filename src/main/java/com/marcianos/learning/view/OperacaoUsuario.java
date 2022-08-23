package com.marcianos.learning.view;

public enum OperacaoUsuario {
    LISTAR_INFORMACOES, EDITAR_INFORMACOES, SAIR, UNKNOWN;

    static OperacaoUsuario retrieveOperation(String option) {
        switch (option) {
            case "1" :
                return LISTAR_INFORMACOES;
            case "2" :
                return EDITAR_INFORMACOES;
            case "9" :
                return SAIR;
        }
        return UNKNOWN;
    }
}
