package com.marcianos.learning.own.generics.main;

import com.marcianos.learning.own.generics.CacheExampleFactory;

public class UsingCache {

    public static void main(String[] args) {
        var cache = CacheExampleFactory.<String, Integer>generateCache();
        cache.add("", 1);
    }
}
