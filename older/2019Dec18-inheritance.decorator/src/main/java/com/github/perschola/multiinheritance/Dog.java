package com.github.perschola.multiinheritance;

/**
 * Created by leon on 12/18/2019.
 */
public class Dog extends Mammal {
    public String speak() {
        return "I am a dog";
    }

    public String speakAsMammal() {
        return super.speak();
    }
}
