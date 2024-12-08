package org.example.java8practice.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class LEDemo7 {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("abc", 27));
        persons.add(new Person("mno", 26));
        persons.add(new Person("pqr", 28));
        persons.add(new Person("xyz", 27));

        // Without lambda expression - sort persons by age - using anonymous class
        Comparator<Person> ageComparator = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getAge() - p2.getAge();
            }
        };
        Collections.sort(persons, ageComparator);
        System.out.println(" Sort persons by age in ascending order: ");
        for (Person person : persons) {
            System.out.println(" Person age : " + person.getAge());
        }

        persons.add(new Person("axt", 17));
        //  With lambda expression - sort persons by age
        Collections.sort(persons, (Person p1, Person p2) -> {
            return p1.getAge() - p2.getAge();
        });

        // Use forEach method added in java 8
        System.out.println(" Sort persons by age in ascending order: ");
        persons.forEach((person) -> System.out.println(" Person age : " + person.getAge()));
    }

}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}