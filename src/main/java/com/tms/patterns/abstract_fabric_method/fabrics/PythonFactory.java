package com.tms.patterns.abstract_fabric_method.fabrics;

import com.tms.patterns.abstract_fabric_method.model.*;

public class PythonFactory extends Factory{
    @Override
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }

    @Override
    public Language createLanguage() {
        return new PythonLanguage();
    }

    @Override
    public Course createCourse() {
        return new PythonCourse();
    }
}
