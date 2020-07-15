package com.thoughtworks.basic;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String introduce() {
        return "My name is " + this.name + ". I am " + this.age + " years old.";
    }
}
