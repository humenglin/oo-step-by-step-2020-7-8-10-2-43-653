package com.thoughtworks.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void should_return_Tom_and_21_when_introduce_given_Tom_and_21() {
        Person person = new Person("Tom", 21);
        String expected = "My name is Tom. I am 21 years old.";

        String actual = person.introduce();

        assertEquals(expected, actual);
    }

    @Test
    public void should_return_Amy_and_18_when_introduce_given_Amy_and_18() {
        Person person = new Person("Amy", 18);
        String expected = "My name is Amy. I am 18 years old.";

        String actual = person.introduce();

        assertEquals(expected, actual);
    }
}
