package com.github.perschola;

public class MainApplication {
    public static void main(String[] args) {
        Person person1 = new Student();
        Person person2 = new Teacher();

        doSomething(person1);
        doSomething(person2);
    }

    public static void doSomething(Person person) {
        // does a bunch of shit
    }
}
