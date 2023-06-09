package com.tms.patterns.Singleton;

public class Main {
    public static void main(String[] args) {
        //Belaz belaz = new Belaz();
        Belaz belaz = Belaz.createBelaz(100, 5); //Singleton - создался один первый объект, второй не изменился
        System.out.println(belaz.cost);

        Belaz belaz2 = Belaz.createBelaz(200, 60);
        System.out.println(belaz2.cost);
    }
}
