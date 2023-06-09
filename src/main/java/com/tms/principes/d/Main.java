package com.tms.principes.d;

public class Main {
    public static void main(String[] args) {
        Car car = new Tesla(); // момент с принципом D - наследовались от большего абстр класса Car, а не Tesla tesla = new Tesla();

        System.out.println(car.model);
        System.out.println(car.fuel);
        car.start();
        car.stop();
    }
}
