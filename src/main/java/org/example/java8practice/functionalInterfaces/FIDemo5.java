package org.example.java8practice.functionalInterfaces;

//Runnable FI implementation
class RunnableImpl implements Runnable {

    @Override
    public void run() {
        System.out.println(" Runnable example using traditional approach...");
    }
}

public class FIDemo5 {

    public static void main(String[] args) {
        //traditional approach
        Thread thread1 = new Thread(new RunnableImpl());
        thread1.start();

        //without lambda, Runnable implementation using anonymous class
        Runnable runnableFIRef = new Runnable() {
            @Override
            public void run() {
                System.out.println(" Runnable example using anonymous class...");
            }
        };
        Thread thread2 = new Thread(runnableFIRef);
        thread2.start();

        //with lambda expression
        Runnable runnableFIRef2 = () -> System.out.println(" Runnable example with lambda expression...");
        Thread thread3 = new Thread(runnableFIRef2);
        thread3.start();
    }
}
