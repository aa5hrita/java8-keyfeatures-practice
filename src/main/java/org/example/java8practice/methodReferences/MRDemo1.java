package org.example.java8practice.methodReferences;

import java.util.function.BiFunction;

@FunctionalInterface
interface IPrintable {
    public void printSomething(String str);
}

// Type 1 : ContainingClass::staticMethodName
public class MRDemo1 {
    public static void main(String[] args) {

        //ex1: lambda expression
        IPrintable printableFIRef = str -> MRDemo1.printMsg(str);
        printableFIRef.printSomething("using lambda expression");
        //ex1: method reference
        IPrintable printableMRRef = MRDemo1::printMsg;
        printableMRRef.printSomething("using method reference");

        //ex2: lambda expression
        BiFunction<Integer, Integer, Integer> adderLE1 = (num1, num2) -> Arithmetic.add(num1, num2);
        BiFunction<Float, Float, Float> adderLE2 = (fnum1, fnum2) -> Arithmetic.add(fnum1, fnum2);
        System.out.println("MR EX2: Sum: " + adderLE1.apply(10, 20) + " - using lambda expression");
        System.out.println("MR EX2: Sum: " + adderLE2.apply(22.5f, 22.5f) + " - using lambda expression");
        //ex2: method reference
        BiFunction<Integer, Integer, Integer> adderMR1 = Arithmetic::add;
        BiFunction<Float, Float, Float> adderMR2 = Arithmetic::add;
        System.out.println("MR EX2: Sum: " + adderMR1.apply(10, 20) + " - using method reference");
        System.out.println("MR EX2: Sum: " + adderMR2.apply(22.5f, 22.5f) + " - using method reference");

        //ex3: lambda expression
        Thread thread = new Thread(() -> System.out.println("Thread using lambda is run by: " + Thread.currentThread().getName()));
        thread.start();
        //ex3: method reference
        Thread thread2 = new Thread(MRDemo1::threadStatus);
        thread2.start();


    }


    public static void printMsg(String msg) {
        System.out.println("MR EX1: Message: " + msg);
    }

    public static void threadStatus() {
        System.out.println("Thread using MR is run by: " + Thread.currentThread().getName());
    }
}

class Arithmetic {
    public static int add(int a, int b) {
        return a + b;
    }

    public static float add(float a, float b) {
        return a + b;
    }
}