package org.example.java8practice.methodReferences;

interface IGreeting {
    void greeting();
}

// Type 2 : Instance to Instance Method
public class MRDemo2 {
    public static void main(String[] args) {

        // the instance
        MRDemo2 mrDemo2Instance = new MRDemo2();

        // lambda expression
        IGreeting refLE = () -> mrDemo2Instance.greet();
        refLE.greeting();

        // method reference
        IGreeting refMR = mrDemo2Instance::greet;
        refMR.greeting();
    }

    // instance method
    public void greet() {
        System.out.println("Good Morning! This is a non-static method. ");
    }

}
