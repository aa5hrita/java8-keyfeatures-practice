package org.example.java8practice.methodReferences;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;

// Type 4: Class to Constructor
public class MRDemo4 {
    public static void main(String[] args) {
        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("apple");
        fruitsList.add("banana");
        fruitsList.add("kiwi");
        fruitsList.add("orange");
        fruitsList.add("mango");
        fruitsList.add("pineapple");
        fruitsList.add("watermelon");
        fruitsList.add("apple");

        // lambda expression
        System.out.println(fruitsList);
        Function<List<String>, HashSet<String>> ref1 = (list) -> new HashSet<>(list);
        HashSet<String> set1 = ref1.apply(fruitsList);
        System.out.println(set1);

        //method reference
        System.out.println(fruitsList);
        Function<List<String>, HashSet<String>> ref2 = HashSet::new;
        HashSet<String> set2 = ref2.apply(fruitsList);
        System.out.println(set2);


    }
}
