package com.github.perschola;


/**
 * Created by leon on 12/23/2019.
 */
public class Worker implements Person, Student {
    @Override
    public String getFirstName() {
        return null;
    }

    @Override
    public String getLastName() {
        return null;
    }

    @Override
    public String myToString() {
        return Student.super.myToString();
    }

    @Override
    public Double getGrade() {
        return null;
    }
}
