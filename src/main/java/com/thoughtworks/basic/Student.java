package com.thoughtworks.basic;

public class Student extends Person {
    private String classNumber;

    public Student(String name, int age, String classNumber) {
        super(name, age);
        this.classNumber = classNumber;
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a Student of Class " + this.classNumber + ".";
    }
}
