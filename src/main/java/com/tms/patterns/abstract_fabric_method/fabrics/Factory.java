package com.tms.patterns.abstract_fabric_method.fabrics;

import com.tms.patterns.abstract_fabric_method.model.Course;
import com.tms.patterns.abstract_fabric_method.model.Developer;
import com.tms.patterns.abstract_fabric_method.model.Language;

public abstract class Factory {
    public abstract Developer createDeveloper();
    public abstract Language createLanguage();
    public abstract Course createCourse();
}
