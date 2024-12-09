package org.example.java8practice.functionalInterfaces;

import org.example.java8practice.functionalInterfaces.utility.Person;

import java.time.LocalDateTime;
import java.util.function.Supplier;

//class SupplierImpl implements Supplier<LocalDateTime> {
//
//    @Override
//    public LocalDateTime get() {
//        return LocalDateTime.now();
//    }
//}

public class FIDemo4 {
    public static void main(String[] args) {

//        SupplierImpl supplierFunction = new SupplierImpl();
//        System.out.println("Current Time: " + supplierFunction.get());

        Supplier<LocalDateTime> lambdaSupplierFIfunction = () -> LocalDateTime.now();
        System.out.println("Current Time: " + lambdaSupplierFIfunction.get());

        Supplier<Person> lambdaSupplierFIfunction2 = () -> {
            return new Person("Ramesh", 30);
        };
        Person personObj = lambdaSupplierFIfunction2.get();
        System.out.println("Person Detail: " + personObj.getName() + ", " + personObj.getAge());
    }
}
