package com.marcianos.learning.lambda.expressions;

import java.util.function.Consumer;

public class ExemploConsumer {

    public static void main(String[] args) {
        Consumer<String> consumer = (s) -> System.out.println("Ola " + s);

        Consumer<String> consumer2 = System.out::println;

        consumer.accept("Joao");
        consumer2.accept("Jose");

    }


}
