package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor() {
        // given
        Long expectedId = 3L;
        String expectedName = "Leon Hunter";

        // when
        Person person = new Person(expectedId, expectedName);
        Long actualId = person.getId();
        String actualName = person.getName();

        // then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testGetName() {
        // given
        Person person = new Person(null,null);
        String expectedName = "Leon";
        person.setName(expectedName);

        // when
        String actualName = person.getName();

        // then
        Assert.assertEquals(expectedName, actualName);
    }

}
