package com.marcianos.learning.lambda.expressions;

import java.util.List;

@FunctionalInterface
public interface ListOfNumberOperation {

    double calculate(List<? extends Number> numbers);

    public static void main(String[] args) {
        var lista1 = List.of(28, 27, 19, 23, 21); //media 23.6
        var lista2 = List.of(34, 39, 36, 35, 37, 40, 36, 38, 36, 38, 41); //moda = 36
        var lista3 = List.of(1.50, 1.54, 1.55, 1.60, 1.65, 1.67, 1.69, 1.75, 1.78); //Md = 1.65


        ListOfNumberOperation operation = null;
        System.out.println("Resultado operacao " + operation.calculate(lista3));
    }
}
