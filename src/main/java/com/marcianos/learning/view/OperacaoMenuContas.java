package com.marcianos.learning.view;

public enum OperacaoMenuContas {
    LISTAR, CADASTRAR, EDITAR, REMOVER, SAIR, UNKNOWN;

    static OperacaoMenuContas retrieveOperation(String option) {
        switch (option) {
            case "1" :
                return LISTAR;
            case "2" :
                return CADASTRAR;
            case "3" :
                return EDITAR;
            case "4" :
                return REMOVER;
            case "9" :
                return SAIR;
        }
        return UNKNOWN;
    }
}
