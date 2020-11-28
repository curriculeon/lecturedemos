package com.github.curriculeon;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MyObject implements Runnable {
    public void run() {
//        testUseStrinConsumerMethod();
    }

    public void supplyFunctionalInterface() {
        Supplier<Function<String, Integer>> functionSupplier = () -> {
            return (String s) -> s.length();
        };
    }

    public void testUseStrinConsumerMethod() {
        useStringConsumerMethod(System.out::println, "987987321");
        useStringConsumerMethod(System.out::print, "987987321");
        Consumer<String> consumer = (String someStringToConsume) -> {
            int length = someStringToConsume.length();
            System.out.println("Iterating over string [ "+ someStringToConsume + "]");
            for (int i = 0; i < length; i++) {
                System.out.println("Hey I'm iterating!");
                System.out.println("I'm on iteration number [ " + i + "]");


            }
        };
        useStringConsumerMethod(consumer, "987987321");
    }

    public void useStringConsumerMethod(Consumer<String> consumerMethod, String value) {
        consumerMethod.accept(value);
    }
}
