package com.marcianos.learning.api.exception;

public class ContaNotFoundException extends RuntimeException{
    public ContaNotFoundException(){
        super("Conta não existente");
    }

}
