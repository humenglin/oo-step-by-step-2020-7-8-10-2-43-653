package com.thoughtworks.basic;

import java.util.List;

public class Klass {
    private String classNumber;
    private Teacher teacher;
    private List<Student> students;

    public Klass(String classNumber) {
        this.classNumber = classNumber;
    }

    public String getClassNumber() {
        return classNumber;
    }
}
