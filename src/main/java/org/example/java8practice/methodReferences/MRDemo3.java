package org.example.java8practice.methodReferences;

import java.util.function.Function;

// Type 3: Arbitrary Object Class to Instance Method
public class MRDemo3 {
    public static void main(String[] args) {

        // lambda expression
        Function<String, String> stringLEref = (str) -> str.toUpperCase();
        System.out.println(stringLEref.apply("i am uppercase - using lambda expression"));

        // method reference
        Function<String, String> stringMRref = String::toUpperCase;
        System.out.println(stringLEref.apply("i am uppercase - using method reference"));

    }
}
