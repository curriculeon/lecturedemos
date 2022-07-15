package com.github.curriculeon;

public class MyObject implements Runnable {
    public void run() {
        // TODO
    }


    public static void whileLoopExample() {
        int endPosition = 10;
        int startPosition = 4;
        int numberOfIterations = endPosition - startPosition;
        System.out.println("This will iterate " + numberOfIterations + " times");

        int numberOfTimesLooped = 0;
        int currentPosition = startPosition;
        while(currentPosition < endPosition) {
            System.out.println("X is lesser than Y");
            currentPosition = currentPosition + 1;
            numberOfTimesLooped = numberOfTimesLooped + 1;
            System.out.println(numberOfTimesLooped);
        }
    }
}
