package com.marcianos.learning.interfaces.impl;

import com.marcianos.learning.interfaces.AdvancedArithmetic;

import java.util.stream.IntStream;

public class MyCalculatorV2 implements AdvancedArithmetic {

    @Override
    public int divisor_sum(int n) {
        if (n > 1000){
            throw new RuntimeException("Valor excede o máximo de 1000");
        }
        //pipeline, deferred execution
        return IntStream
                .range(1, n+1)
                .filter(i -> n%i == 0) //intermediarias
                .sum(); //operacao terminal
    }

    @Override
    public int somar(int n){
        return 200;
    }

}
