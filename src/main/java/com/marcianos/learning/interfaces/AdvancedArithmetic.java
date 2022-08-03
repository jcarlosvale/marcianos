package com.marcianos.learning.interfaces;

public interface AdvancedArithmetic {

    int divisor_sum(int n);

    default int somar(int n) {
        div();
        return 100 + divisor_sum(n);
    }

    private int div() {
        return 200;
    }

    static void imprimir(){
        System.out.println("Teste");
    }

}
