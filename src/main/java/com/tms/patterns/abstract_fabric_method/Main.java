package com.tms.patterns.abstract_fabric_method;

import com.tms.patterns.abstract_fabric_method.fabrics.Factory;
import com.tms.patterns.abstract_fabric_method.fabrics.JavaFactory;
import com.tms.patterns.abstract_fabric_method.fabrics.PythonFactory;
import com.tms.patterns.abstract_fabric_method.model.Course;
import com.tms.patterns.abstract_fabric_method.model.Developer;
import com.tms.patterns.abstract_fabric_method.model.Language;

public class Main {
    public static void main(String[] args) {
        Factory factory = new PythonFactory();

        Developer developer = factory.createDeveloper();
        Language language = factory.createLanguage();
        Course course = factory.createCourse();

        System.out.println(developer.introduction);
        System.out.println(language.language);
        System.out.println(course.lessons);
    }
}
