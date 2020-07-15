package com.thoughtworks.basic;

public class Student extends Person {
    private Klass klass;

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a Student of Class " + this.klass.getClassNumber() + ".";
    }
}
