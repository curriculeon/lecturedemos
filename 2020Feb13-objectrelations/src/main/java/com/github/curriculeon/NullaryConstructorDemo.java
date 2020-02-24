package com.github.curriculeon;

/**
 * Created by leon on 2/13/2020.
 */
public class NullaryConstructorDemo {
    private Integer id;
    private String name;

    public NullaryConstructorDemo() {
        this.id = Integer.MAX_VALUE;
        this.name = Long.toString(System.nanoTime(), 16);
    }
}
