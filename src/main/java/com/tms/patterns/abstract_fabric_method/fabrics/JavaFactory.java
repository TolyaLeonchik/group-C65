package com.tms.patterns.abstract_fabric_method.fabrics;

import com.tms.patterns.abstract_fabric_method.model.*;

public class JavaFactory extends Factory{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Language createLanguage() {
        return new JavaLanguage();
    }

    @Override
    public Course createCourse() {
        return new JavaCourse();
    }
}
