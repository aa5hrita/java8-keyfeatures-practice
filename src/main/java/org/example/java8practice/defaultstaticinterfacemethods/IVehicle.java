package org.example.java8practice.defaultstaticinterfacemethods;

interface IVehicle {

    static int getHorsePower(int rpm, int torque) {
        return (rpm * torque) / 5252;
    }

    static String getCompany() {
        return "BMW";
    }

    String getBrand();

    String speedUp();

    String slowDown();

    default String turnAlarmOn() {
        return "Turning the vehice alarm on.";
    }

    default String turnAlarmOff() {
        return "Turning the vehicle alarm off.";
    }
}
