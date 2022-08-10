package com.marcianos.learning.classes;

public class Animal implements Comparable<Animal>{
    int legs;

    public Animal(int legs) {
    }

    @Override
    public int compareTo(Animal a) {
        return this.legs - a.legs;
    }

//    @Override
//    public int compareTo(Object o) {
//        if (o instanceof Animal) {
//            Animal a = (Animal) o;
//            return this.x - a.x;
//        }
//        throw new RuntimeException();
//    }
}
