package com.marcianos.learning.interfaces.impl;

import com.marcianos.learning.interfaces.AdvancedArithmetic;

public class MyCalculator implements AdvancedArithmetic  {

    @Override
    public int divisor_sum(int n){
        if (n > 1000) {
            throw new IllegalArgumentException("Não é possível realizar a operação para um n maior que 1000.");

        }

        var soma = n;

        for (var i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                soma += i;
            }
        }

        return soma;
    }

    //checked x unchecked
    /*
    checked => tratar exceção OU lançar exceção (throwS)
    unchecked ==> não preciso tratar  -> RuntimeException


    n = 10**5

    ==> linear = 100000
    ==> logN =5 operacoes

     */
    public static void main(String[] args) {
        var calculator1 = new MyCalculator();
        var calculator2 = new MyCalculatorV2();


        System.out.println(calculator1.somar(12));

        System.out.println(calculator2.somar(12));


       AdvancedArithmetic.imprimir();
    }

}
