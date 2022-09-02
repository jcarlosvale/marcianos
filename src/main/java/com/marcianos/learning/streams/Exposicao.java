package com.marcianos.learning.streams;

import java.util.List;
import java.util.stream.Stream;

public class Exposicao {

    //varrags
    public static int somar(int ... numeros) {
        int soma = 0;
        for(int x : numeros) {
            soma += x;
        }

        return soma;
    }


    public static void main(String[] args) {
        Stream<String> streamOfString = Stream.empty();//Stream.of("java", "python", "c", "c++");
        List<String> listOfString = List.of("java", "python", "c", "c++");
//        listOfString
//                .stream()
//                .forEach(System.out::println);
        Stream<Double> streamOfRandom = Stream.generate(Math::random);

        //gerar 10 numeros > 0.5
        streamOfRandom.
                filter(d -> d > 0.5);

        //System.out.println(streamOfRandom);
        //streamOfString.forEach(System.out::println);

        streamOfRandom
                .filter(d -> d > 0.5)
                .limit(10)
                .forEach(System.out::println);




    }
}
