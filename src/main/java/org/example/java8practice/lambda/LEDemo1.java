package org.example.java8practice.lambda;

interface IDrawable{
    void draw();
}
public class LEDemo1 {
    // No Param & No Return & Single statement
    public static void main(String[] args) {

        //without lambda, IDrawable implementation using anonymous class (that implements FI)
        IDrawable ref = new IDrawable() {
            @Override
            public void draw() {
                System.out.println("Drawing a Line --- ");
            }
        };
        ref.draw();

        //with lambda
        IDrawable lambdaRef = () -> System.out.println("Drawing a Circle - O ");
        lambdaRef.draw();

    }
}
