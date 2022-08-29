package com.marcianos.learning.lambda.expressions;

import java.util.function.Predicate;

public class ExemploValidacao {

    public static void main(String[] args) {
        Predicate<Integer> validatorIsPrime =
                (x) -> {
                    for (int i = x-1; i > 1; i--) {
                        if (x % i == 0) {
                            return false;
                        }
                    }
                    return true;
                };


        Predicate<Integer> validatorIsEven = (x) -> (x%2 == 0);

        printValidNumber(12, validatorIsEven);
        printValidNumber(12, validatorIsPrime);


        printValidNumber(5, validatorIsEven);
        printValidNumber(5, validatorIsPrime);

        printValidNumber(2, validatorIsEven);
        printValidNumber(2, validatorIsPrime);
    }

    public static void printValidNumber(Integer x, Predicate<Integer> predicate) {
        if (predicate.test(x)) {
            System.out.println(x + " is valid");
        }
    }
}
