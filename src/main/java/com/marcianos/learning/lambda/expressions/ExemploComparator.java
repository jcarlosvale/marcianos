package com.marcianos.learning.lambda.expressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploComparator {

    public static void main(String[] args) {

        List<String> alunos = new ArrayList<>();
        alunos.add("Hugo");
        alunos.add("Luiza");
        alunos.add("Mario");
        alunos.add("Lucas");
        alunos.add("Arthur");

        Collections.sort(alunos, (s1, s2) -> s2.compareTo(s1));
        System.out.println(alunos);
    }
}
