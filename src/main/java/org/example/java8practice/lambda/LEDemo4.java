package org.example.java8practice.lambda;

interface IPrintable {

    void print(String msg);
}

public class LEDemo4 {
    //single param, no return, single statement
    public static void main(String[] args) {

        // without lambda expression - using anonymous class
        IPrintable printableIRef = new IPrintable() {
            @Override
            public void print(String msg) {
                System.out.println(msg);
            }
        };
        printableIRef.print("Print message: using anonymous class");

        // with lambda expression - single parameter
        IPrintable lambdaRef = (msg) -> System.out.println(msg);
        lambdaRef.print("Print message: using lambda expression");
    }
}
