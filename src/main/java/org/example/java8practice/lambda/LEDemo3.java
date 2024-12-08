package org.example.java8practice.lambda;

interface IAddable {
    int add(int a, int b);
}

public class LEDemo3 {
    //multiple parameters, no return keyword, single statement
    public static void main(String[] args) {

        // without lambda expression - using anonymous class
        IAddable addableIRef = new IAddable() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        };
        System.out.println(addableIRef.add(10, 80));


        // with multiple parameters in lambda expression & return keyword
        IAddable lambdaRef2 = (a, b) -> {
            return (a + b);
        };
        System.out.println(lambdaRef2.add(10, 20));

        // with multiple parameters in lambda expression without return keyword
        IAddable lambdaRef = (n1, n2) -> (n1 + n2);
        System.out.println(lambdaRef.add(30, 40));


    }
}
