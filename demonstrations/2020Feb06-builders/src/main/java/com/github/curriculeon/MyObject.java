package com.github.curriculeon;

public class MyObject implements Runnable {
    public void run() {
        System.out.println(PersonFactory.createPerson(0));
    }
}
