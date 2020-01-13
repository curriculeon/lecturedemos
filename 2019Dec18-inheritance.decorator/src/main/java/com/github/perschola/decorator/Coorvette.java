package com.github.perschola.decorator;

/**
 * Created by leon on 12/18/2019.
 */
public class Coorvette extends Vehicle {
    public Coorvette() {
        super(new CoorvetteImpl());
    }
}
