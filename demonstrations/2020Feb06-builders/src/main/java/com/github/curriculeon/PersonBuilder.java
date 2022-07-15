package com.github.curriculeon;

public class PersonBuilder {
    private Long id;
    private Integer age;
    private String firstName;
    private String lastName;
    private Address address;

    public PersonBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public PersonBuilder setAge(Integer age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder setAddress(Address address) {
        this.address = address;
        return this;
    }

    public Person createPerson() {
        return new Person(id, age, firstName, lastName, address);
    }
}