package com.github.perschola;

/**
 * Created by leon on 1/16/2020.
 */
public class Student {
    int id;
    int age;
    final String firstName;
    final String lastName;


    public Student() {
        this("place", "holder");
        System.out.println("Calling 0-arg constructor");
    }

    public Student(String firstName, String lastName) {
        this(0,0, firstName, lastName);
        System.out.println("Calling 2-arg constructor");
    }

    public Student(int id, int age, String firstName, String lastName) {
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Calling 4-arg constructor");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
