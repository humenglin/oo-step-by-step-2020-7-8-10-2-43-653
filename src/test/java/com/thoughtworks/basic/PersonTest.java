package com.thoughtworks.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void should_return_string_when_introduce() {
        Person person = new Person();
        String expected = "My name is Tom. I am 21 years old.";

        String actual = person.introduce();

        assertEquals(expected, actual);
    }
}
