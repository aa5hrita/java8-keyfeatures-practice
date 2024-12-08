package org.example.java8practice.lambda;

interface IAverage {
    double avg(int[] array);
}

public class LEDemo6 {
    //With Multiple Statements, Return statement, parameter
    public static void main(String[] args) {

        int[] array = {1, 4, 6, 8, 9};

        // without lambda expression, IAverage implementation using anonymous class
        IAverage averageIRef = new IAverage() {
            @Override
            public double avg(int[] myArray) {
                double sum = 0;
                int arraySize = myArray.length;

                System.out.println("arraySize : " + arraySize);
                for (int i = 0; i < arraySize; i++) {
                    sum = sum + myArray[i];
                }
                System.out.println("sum : " + sum);

                return (sum / arraySize);
            }
        };
        System.out.println(averageIRef.avg(array));

        // with multiple statements in lambda expression
        IAverage lambdaRef = (myArray) -> {
            double sum = 0;
            int arraySize = myArray.length;

            System.out.println("arraySize : " + arraySize);
            for (int i = 0; i < arraySize; i++) {
                sum = sum + myArray[i];
            }
            System.out.println("sum : " + sum);

            return (sum / arraySize);
        };
        System.out.println(lambdaRef.avg(array));
    }

}
