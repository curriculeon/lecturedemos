package com.github.curriculeon;

/**
 * Created by leon on 2/6/2020.
 */
public class PersonFactory {
    public static Person createPerson(Integer age, String firstName, String lastName, Address address) {
        return new PersonBuilder()
                .setLastName(lastName)
                .setFirstName(firstName)
                .setAge(age)
                .setAddress(address)
                .createPerson();
    }

    public static Person createPerson(Integer age) {
        return createPerson(age, null, null, null);
    }
}
