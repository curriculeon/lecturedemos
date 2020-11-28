package com.github.perschola.varargs;

/**
 * Created by leon on 12/19/2019.
 */
public enum Person {
    LEON("LEON", "Hunter"),
    ALI("Ali", "Hyman"),
    SOMEPERSON("firstname", "lastname", 1);

    String firstName;
    String lastName;
    int numberOfEyeballs;

    Person(String firstName, String lastName, int numberOfEyeballs) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfEyeballs = numberOfEyeballs;
    }

    Person(String firstName, String lastName) {
        this(firstName, lastName, 2);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumberOfEyeballs() {
        return numberOfEyeballs;
    }

    public void setNumberOfEyeballs(int numberOfEyeballs) {
        this.numberOfEyeballs = numberOfEyeballs;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", numberOfEyeballs=" + numberOfEyeballs +
                '}';
    }

    public static Person getValueOf(String string) {
        string = string.replaceAll(" ", "_");
        return valueOf(string.toUpperCase());
    }
}
