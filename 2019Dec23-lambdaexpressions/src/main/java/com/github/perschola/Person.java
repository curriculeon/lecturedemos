package com.github.perschola;

/**
 * Created by leon on 12/23/2019.
 */
public interface Person {
    String getFirstName();
    String getLastName();

    default String myToString() {
        return "Person{" +
                "fname='" + getFirstName() + '\'' +
                ", lname='" + getLastName() + '\'' +
                '}';
    }
}
