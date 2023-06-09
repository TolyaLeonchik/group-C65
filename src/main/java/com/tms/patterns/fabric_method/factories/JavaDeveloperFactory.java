package com.tms.patterns.fabric_method.factories;

import com.tms.patterns.fabric_method.Developer;
import com.tms.patterns.fabric_method.JavaDeveloper;

public class JavaDeveloperFactory extends DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
