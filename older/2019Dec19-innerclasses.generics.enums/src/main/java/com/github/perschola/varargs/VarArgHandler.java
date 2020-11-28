package com.github.perschola.varargs;

/**
 * Created by leon on 12/19/2019.
 */
public class VarArgHandler {
    public void printIntegersOnSeparateLines(int... intArray) {
        printSomeTypeOnSeparateLines(intArray);
    }


    public void printStringsOnSeparateLines(String... stringArray) {
        printSomeTypeOnSeparateLines(stringArray);
    }

    public <SomeType> void printSomeTypeOnSeparateLines(SomeType... someTypes) {
        for (int currentIndex = 0; currentIndex < someTypes.length; currentIndex++) {
            SomeType currentElement = someTypes[currentIndex];
            System.out.println(currentElement);
        }
    }
}
