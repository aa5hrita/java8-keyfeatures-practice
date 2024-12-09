package org.example.java8practice.defaultstaticinterfacemethods;

public class DSMethodsDemo {
    public static void main(String[] args) {

        IVehicle car = new Car("BMW");
        System.out.println(car.getBrand());
        System.out.println(car.speedUp());
        System.out.println(car.slowDown());
        System.out.println(car.turnAlarmOn()); //default
        System.out.println(car.turnAlarmOff()); //default
        System.out.println(IVehicle.getHorsePower(2500, 480)); //static
        System.out.println(IVehicle.getCompany()); //static
    }
}
