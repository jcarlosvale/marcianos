package com.marcianos.learning.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Temp {



    public static void main(String[] args) {
        //reduce
        var x =
                Stream.of(1,2,3,4,5,6)
                .reduce(0, (i1, i2) -> i1 + i2);

        System.out.println(x);
        System.out.println("PROGRAMA FIM");

    }
}
