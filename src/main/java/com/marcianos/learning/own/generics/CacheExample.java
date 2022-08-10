package com.marcianos.learning.own.generics;

import java.util.HashMap;
import java.util.Map;
public class CacheExample<K, V> {

    private final Map<K, V> cacheMap;


    public CacheExample() {
        this.cacheMap = new HashMap<>();
    }

    public void mensagem(K e) {
        if (e instanceof RuntimeException) {
            System.out.println("fghjkl");
        } else {
            //bla bla bla
        }
    }

    public void add(K key, V value) {
        this.cacheMap.put(key, value);
    }

    public V get(K key) {
        return this.cacheMap.get(key);
    }

    public void clear() {
        this.cacheMap.clear();
    }
}
