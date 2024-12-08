package org.example.java8practice.lambda;

public class LEDemo5 {
    //Runnable FI implementation
    public static void main(String[] args) {

        //without lambda, Runnable implementation using anonymous class
        Runnable runnableFIRef = new Runnable() {
            @Override
            public void run() {
                System.out.println(" Runnable example using anonymous class.");
            }
        };
        Thread thread = new Thread(runnableFIRef);
        thread.start();

        //with lambda expression
        Runnable runnableFIRef2 = () -> System.out.println(" Runnable example with lambda expression.");
        runnableFIRef2.run();

    }
}
