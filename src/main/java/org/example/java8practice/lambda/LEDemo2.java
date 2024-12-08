package org.example.java8practice.lambda;

interface ISayable {
    String say();
}

public class LEDemo2 {
    // No Param & With Return & Single statement
    public static void main(String[] args) {

        // without lambda expression, ISayable implementation using anonymous class (that implements FI)
        ISayable sayableIRef = new ISayable() {
            @Override
            public String say() {
                return "Return something: implementation using anonymous class";
            }
        };
        System.out.println(sayableIRef.say());

        // with lambda expression
        ISayable lambdaRef = () -> ("Return something: implementation using lambda expression");
        System.out.println(lambdaRef.say());

        // with lambda expression - with return keyword
        ISayable lambdaRef2 = () -> {
            System.out.println("Multiple Statements - return keyword required!");
            return "Return something: implementation using lambda expression - with return keyword";
        };
        System.out.println(lambdaRef2.say());
    }
}
