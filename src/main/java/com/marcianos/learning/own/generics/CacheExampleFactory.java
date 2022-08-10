package com.marcianos.learning.own.generics;

public class CacheExampleFactory {

    public static <K, V> CacheExample<K,V> generateCache() {
        return new CacheExample<K,V>();
    }

    public <T> String mensagem(T valor) {
        return valor.toString();
    }

}
