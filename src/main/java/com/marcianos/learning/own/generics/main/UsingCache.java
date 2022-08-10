package com.marcianos.learning.own.generics.main;

import com.marcianos.learning.classes.Animal;
import com.marcianos.learning.own.generics.CacheExample;
import com.marcianos.learning.own.generics.CacheExampleFactory;

public class UsingCache {

    public static void main(String[] args) {
        var cache = new CacheExample<String, Animal>();
        cache.add("tre", new Animal(4));

        var cache2 = new CacheExample<Float, String>();
        cache2.add(1f, "gfdsa");



//        var cache = CacheExampleFactory.<String, Integer>generateCache();
//        cache.add("", 1);
    }
}
