package com.thoughtworks.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {

    @Test
    public void should_Tom_and_21_and_2_class_given_introduce_given_a_student() {
        Student student = new Student("Tom", 21, new Klass("2"));
        String expected = "My name is Tom. I am 21 years old. I am a Student of Class 2.";

        String actual = student.introduce();

        assertEquals(expected, actual);
    }

    @Test
    public void should_return_Jack_given_changeName_given_student_is_Tom() {
        Student student = new Student("Tom", 21, new Klass("2"));
        student.changeName("Jack");

        assertEquals("Jack", student.getName());
    }
}
