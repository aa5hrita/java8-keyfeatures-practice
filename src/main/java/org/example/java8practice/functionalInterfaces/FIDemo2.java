package org.example.java8practice.functionalInterfaces;

import org.example.java8practice.functionalInterfaces.utility.PersonDTO;
import org.example.java8practice.functionalInterfaces.utility.PersonEntity;

import java.util.function.Function;

// A Function is a functional interface whose sole purpose is to return any result by working on a single input argument.
// It represents a function that accepts one argument and returns a result.
public class FIDemo2 {
    public static void main(String[] args) {

        // convert centigrade to fahrenheit
        Function<Integer, Double> centigradeToFahrenheitInt = x -> (double) ((x * 9 / 5) + 32);
        System.out.println("Centigrade to Fahrenheit: " + centigradeToFahrenheitInt.apply(100));

        // String to an integer
        Function<String, Integer> stringLength = x -> x.length();
        System.out.println("String Length: " + stringLength.apply("Hello"));

        // get DTO object from Entity (Person)
        Function<PersonEntity, PersonDTO> personEntityPersonDTOFunction = (personEntity -> new PersonDTO(personEntity.getName(), personEntity.getAge()));
        PersonDTO personDTO = personEntityPersonDTOFunction.apply(new PersonEntity("John", 23));

        System.out.println("Name: " + personDTO.getName() + " Age: " + personDTO.getAge());
    }
}

