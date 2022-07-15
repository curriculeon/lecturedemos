package com.github.perschola;

/**
 * Created by leon on 12/17/2019.
 */
public class Student extends Person {
    private Character grade;

    @Override
    public void communicate() {
        System.out.println("Hey I'm a student!");
    }
}
