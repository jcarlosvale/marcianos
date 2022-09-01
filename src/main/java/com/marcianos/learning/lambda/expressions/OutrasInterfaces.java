package com.marcianos.learning.lambda.expressions;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class OutrasInterfaces {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        BiConsumer<String, Integer> biConsumer = (s, i) -> map.put(s,i);

        biConsumer.accept("Alan", 32);
        biConsumer.accept("Joao", 18);

//        System.out.println(map);

//        BiPredicate<String, String> verificarPrefixo = (s, s2) -> s.contains(s2);
//        System.out.println(verificarPrefixo.test ("Animalzinho", "inho"));
//        System.out.println(verificarPrefixo.test ("Casarao", "inho"));

        Function<String, Integer> function = s -> {return s.length();};
     //   Function<String, Integer> function1 = s -> s.length();

        System.out.println(function.apply("dfgyuidcohdiuhsdsiojoijsd"));




    }
}
