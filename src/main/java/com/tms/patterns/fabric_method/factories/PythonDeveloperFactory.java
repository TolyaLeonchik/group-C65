package com.tms.patterns.fabric_method.factories;

import com.tms.patterns.fabric_method.Developer;
import com.tms.patterns.fabric_method.PythonDeveloper;

public class PythonDeveloperFactory extends DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }
}
