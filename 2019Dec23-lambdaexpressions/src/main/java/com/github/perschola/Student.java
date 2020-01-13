package com.github.perschola;

/**
 * Created by leon on 12/23/2019.
 */
public interface Student {
    Double getGrade();

    default String myToString() {
        return "My grade is " + getGrade();
    }
}
