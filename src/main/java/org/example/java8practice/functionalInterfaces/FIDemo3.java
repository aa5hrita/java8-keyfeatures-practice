package org.example.java8practice.functionalInterfaces;


import org.example.java8practice.functionalInterfaces.utility.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

//class ConsumerFI implements Consumer<String> {
//
//    @Override
//    public void accept(String inputStr) { //single parameter
//        System.out.println(inputStr); // no result
//    }
//}

public class FIDemo3 {
    public static void main(String[] args) {

        // Consumer<String> consumerFIfunction = new ConsumerFI();
        // consumerFIfunction.accept("Hello!");

        Consumer<String> lambdaFIconsumerFunction = (input) -> System.out.println(input);
        lambdaFIconsumerFunction.accept("Hello World!");

        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("abc", 27));
        persons.add(new Person("mno", 26));
        persons.add(new Person("pqr", 28));
        persons.add(new Person("xyz", 27));

        Consumer<Person> greetPeopleConsumerFunction = (person -> System.out.println("Greetings --- " + "Name: " + person.getName() + " Age: " + person.getAge()));
        for (Person person : persons) greetPeopleConsumerFunction.accept(person);

        System.out.println("Using foreach--------------- ");
        // The lambda passed to the List.forEach() method implements the Consumer functional interface
        persons.forEach((person -> System.out.println("Greetings --- " + "Name: " + person.getName() + " Age: " + person.getAge())));
    }
}

