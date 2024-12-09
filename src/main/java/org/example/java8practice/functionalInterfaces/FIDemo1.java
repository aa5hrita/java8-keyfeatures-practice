package org.example.java8practice.functionalInterfaces;

// Points
// It can have any number of default, static methods but can contain only one abstract method.
// It can contain any number of Object class method declarations.
// It is a new feature in Java, which helps to achieve functional programming approach.
// The Java API has many one-method interfaces such as Runnable, Callable, Comparator, ActionListener and others.
// They can be implemented and instantiated using anonymous class syntax.

// Rules
// A functional interface can extends another interface only when it does not have any abstract method.

@FunctionalInterface
interface ISayable {

    void say(String msg); //abstract method

    int hashCode(); //Object class method

    String toString(); //Object class method

    boolean equals(Object obj); //Object class method

}

public class FIDemo1 {
    public static void main(String[] args) {

        ISayable lambdaFIref = (message) -> {
            System.out.println("The message is: " + message);
        };
        lambdaFIref.say("wubba lubba dub dub");
    }
}
