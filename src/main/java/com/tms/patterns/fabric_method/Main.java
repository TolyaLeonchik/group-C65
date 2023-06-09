package com.tms.patterns.fabric_method;

import com.tms.patterns.fabric_method.factories.DeveloperFactory;
import com.tms.patterns.fabric_method.factories.JavaDeveloperFactory;
import com.tms.patterns.fabric_method.factories.PythonDeveloperFactory;

public class Main {
    public static void main(String[] args) {
        DeveloperFactory factory = new PythonDeveloperFactory(); //при подстановке определенной фабрики - разный резульата
        Developer developer = factory.createDeveloper();

        System.out.println(developer.programLanguage);
        System.out.println(developer.skillList);
    }
}
