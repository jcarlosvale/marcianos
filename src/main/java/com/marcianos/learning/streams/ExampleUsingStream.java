package com.marcianos.learning.streams;

public class ExampleUsingStream {

    public static void main(String[] args) {
        Person.getPersons().forEach(System.out::println);
        Actor.getActors().forEach(System.out::println);
        Actor.getActress().forEach(System.out::println);
    }
}
