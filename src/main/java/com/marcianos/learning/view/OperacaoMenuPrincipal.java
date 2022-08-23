package com.marcianos.learning.view;

public enum OperacaoMenuPrincipal {
    USUARIO, CONTAS, OPERACOES, SAIR, UNKNOWN
    ;

    static OperacaoMenuPrincipal retrieveOperation(String option) {
        switch (option) {
            case "1" :
                return USUARIO;
            case "2" :
                return CONTAS;
            case "3" :
                return OPERACOES;
            case "9" :
                return SAIR;
        }
        return UNKNOWN;
    }
}
