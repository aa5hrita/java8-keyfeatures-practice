package org.example.java8practice.functionalInterfaces;

import org.example.java8practice.functionalInterfaces.utility.Person;

import java.util.function.BiFunction;

// BiFunction<T,U,R>
// <T> – the type of the first argument to the function
// <U> – the type of the second argument to the function
// <R> – the type of the result of the function
public class FIDemo6 {

    public static void main(String[] args) {

        BiFunction<Person, Person, Integer> biFunction = (p1, p2) -> p1.getSalary() + p2.getSalary();

        int totalSalary = biFunction.apply(new Person("sham", 10, 10000), new Person("ram", 10, 20000));

        System.out.println("Total Salary: " + totalSalary);

    }
    
}
