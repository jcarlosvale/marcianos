package com.marcianos.learning.lambda.expressions;

import java.util.function.Supplier;

public class ExemploSupplier {

    public static void main(String[] args) {
        Supplier<Double> randomico = Math::random;

        for (int i = 0; i < 10; i++) {
            System.out.println(randomico.get());
        }
    }
}
