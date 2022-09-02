package com.marcianos.learning.streams;

import java.util.List;

public class ExampleUsingStream {

    public static void main(String[] args) {
        //Person.getPersons().forEach(System.out::println);

//        List<Person> listaPessoas = Person.getPersons();
//
//        System.out.println(
//        listaPessoas.stream()
//                .filter(person -> person.getGender().equals("Female"))
//                .count()
//        );


        Actor.getActors().forEach(System.out::println);
        Actor.getActress().forEach(System.out::println);
    }
}
