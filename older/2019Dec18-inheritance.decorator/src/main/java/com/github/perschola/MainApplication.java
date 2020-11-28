package com.github.perschola;

import com.github.perschola.multiinheritance.GermanShepherd;

public class MainApplication {
    public static void main(String[] args) {
        GermanShepherd animal = new GermanShepherd();
        System.out.println(animal.speak());
    }
}
