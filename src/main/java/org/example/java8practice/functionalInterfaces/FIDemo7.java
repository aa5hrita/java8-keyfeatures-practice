package org.example.java8practice.functionalInterfaces;

import org.example.java8practice.functionalInterfaces.utility.Person;

import java.util.function.BiConsumer;

// BiConsumer<T, U>
// <T> – the type of the first argument to the operation
// <U> – the type of the second argument to the operation
public class FIDemo7 {
    public static void main(String[] args) {

        BiConsumer<Person, Person> biConsumer = (p1, p2) -> {
            System.out.println(" Print first person: " + p1.getName());
            System.out.println(" Print second person: " + p2.getName());
        };

        biConsumer.accept(new Person("sham", 10), new Person("ram", 10));
    }
}
