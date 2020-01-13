package com.github.perschola.generics;

/**
 * Created by leon on 12/19/2019.
 */
public class InstanceVariable<SomeType> {
    private SomeType value;

    public InstanceVariable(SomeType value) {
        this.value = value;
    }

    public void set(SomeType val) {
        this.value = val;
    }

    public SomeType getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "InstanceVariable{" +
                "value=" + value +
                '}';
    }
}
