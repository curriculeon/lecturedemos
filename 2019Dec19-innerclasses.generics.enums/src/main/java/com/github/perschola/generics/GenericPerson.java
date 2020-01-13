package com.github.perschola.generics;

/**
 * Created by leon on 12/19/2019.
 */
public class GenericPerson {
    public InstanceVariable<String> firstName;
    public InstanceVariable<String> lastName;
    public InstanceVariable<Integer> age;

    public GenericPerson() {
    }

    public GenericPerson(String firstName, String lastName, Integer age) {
        this.firstName = new InstanceVariable<>(firstName);
        this.lastName = new InstanceVariable<>(lastName);
        this.age = new InstanceVariable<>(age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName=" + firstName +
                ", lastName=" + lastName +
                ", age=" + age +
                '}';
    }
}
