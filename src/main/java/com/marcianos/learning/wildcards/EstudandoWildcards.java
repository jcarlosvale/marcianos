package com.marcianos.learning.wildcards;

import com.marcianos.learning.poker.Card;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EstudandoWildcards {

    //boxing x unboxing
    // type erasure --> bonus
    // uso do extends --> imutavel

    //wildcard
    // ? = qualquer coisa
//    private static void imprimir(List<?> lista) {
//
//    }

    private static void imprimir(List<? extends Exception> lista) {
//        lista.add(new Exception());
//        lista.add(new RuntimeException());
//        lista.add(new IllegalArgumentException());
    }


//    private static void imprimir(Object item) {
//        System.out.println("imprimir item");
//    }
// Object --> Number --> Long

    public static void main(String[] args) {
        List<Exception> exceptionList = new ArrayList<>();
        List<RuntimeException> runtimeExceptionList = new ArrayList<>();
        List<IllegalArgumentException> argumentExceptionList = new ArrayList<>();
       // List<Card> listaOfCards = List.of(new Card());

        imprimir(exceptionList);
        imprimir(runtimeExceptionList);
        imprimir(argumentExceptionList);

        //imprimir(listaOfCards);


//        String s = "gfdhjs";
//        Card card = new Card();
//        Float f = 1.0f;
//
//        imprimir(s);
//        imprimir(card);
//        imprimir(f);
//
//
//
//
//        int i = 10;
//
//        List<Integer> listaInt = new ArrayList<>();
//        listaInt.add(i);
//        i = listaInt.get(0);
//
//
//        i  = Integer.parseInt("123");
//
//        List<String> lista = new ArrayList<>();
//        lista.add("teste");
//        lista.add("java");
//        lista.add("aluno");
//
//        List<Long> listaOfLong = List.of(1L, 2L, 4L);
//        List<Card> listaOfCards = List.of(new Card());
//
//        imprimir(lista);
//        imprimir(listaOfLong);
//        imprimir(listaOfCards);
//
//        imprimir(List.of(1L, 2L, 4L));
//        imprimir(List.of(new Card()));

    }

}
