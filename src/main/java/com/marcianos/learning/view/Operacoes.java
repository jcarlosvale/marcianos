package com.marcianos.learning.view;

public enum Operacoes {
    CREDITAR_CONTA, DEBITAR_CONTA, EXTRATO_CONTA, TRANSFERIR_ENTRE_CONTAS, CONSULTAR_DATA_HORA, CONSULTAR_COTACAO, SAIR, UNKNOWN;

    static Operacoes retrieveOperation(String option) {
        switch (option) {
            case "1" :
                return CREDITAR_CONTA;
            case "2" :
                return DEBITAR_CONTA;
            case "3" :
                return EXTRATO_CONTA;
            case "4":
                return TRANSFERIR_ENTRE_CONTAS;
            case "5":
                return CONSULTAR_DATA_HORA;
            case "6":
                return CONSULTAR_COTACAO;
            case "9" :
                return SAIR;
        }
        return UNKNOWN;
    }
}
