package com.thoughtworks.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeacherTest {

    @Test
    public void should_Matt_and_30_and_teacher_given_introduce_given_a_teacher() {
        Teacher teacher = new Teacher("Matt", 30, "Teacher");
        String expected = "My name is Matt. I am 30 years old. I am a Teacher.";

        String actual = teacher.introduce();

        assertEquals(expected, actual);
    }
}
