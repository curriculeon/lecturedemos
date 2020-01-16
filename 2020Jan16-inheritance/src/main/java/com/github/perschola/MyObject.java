package com.github.perschola;

public class MyObject implements Runnable {
    public void run() {
        // TODO
        fourArgConstructor();
    }

    public void zeroArgConstructor() {
        Student student = new Student();
        System.out.println(student);
    }

    public void twoArgConstructor() {
        Student student = new Student("leon", "hunter");
        System.out.println(student);
    }

    public void fourArgConstructor() {
        Student student = new Student(9, 100, "leon", "Hunter");
        System.out.println(student);
    }


    public void idempotentString() {
        String s = "Hello world";
        s = s.replaceAll("Hello", "");
        System.out.println(s);
    }
}
