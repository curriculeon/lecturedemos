package com.github.perschola;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyObject implements Runnable {
    @Override
    public void run() {
        demonstrateForEach();
    }

    public <ParamType, ReturnType> ReturnType test(Function<ParamType, ReturnType> function, ParamType valueToPassIn) {
        return function.apply(valueToPassIn);
    }

    public void demonstrateIntStream() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        IntStream
                .range(0, 100)
                .forEach(System.out::println);
    }

    public void demonstrateArrayToStream1() {
        // converting from array to stream; first implementation
        String[] someArray = "the quick brown fox jumps".split(" ");
        List<String> list = Arrays.asList(someArray);
        Stream<String> stream = list.stream();
    }


    public void demonstrateArrayToStream2() {
        // converting from array to stream; first implementation
        String[] someArray = "the quick brown fox jumps".split(" ");
        Stream<String> stream = Stream.of(someArray);
    }


    public void demonstrateArrayToStream3() {
        // converting from array to stream; first implementation
        String[] someArray = "the quick brown fox jumps".split(" ");
        Stream<String> stream = Arrays.stream(someArray);
    }

    public void demonstrateForEach() {
        String[] stringArray = "The quick brown fox jumps over the lazy Leon".split(" ");
        List<String> list = Arrays.asList(stringArray);
        list.forEach(element -> {
            Integer elementLength = element.length();
            String outputMessage = new StringBuilder()
                    .append("\n\nMy element length is ").append(elementLength)
                    .append("\nMy element value is ").append(element)
                    .toString();

            System.out.println(outputMessage);
        });
    }

    public Boolean checkForName(Predicate<String> dynamicSubProcedure, List<List<String>> listOfListOfNames, String name) {
        for (List<String> list : listOfListOfNames) {
            if (dynamicSubProcedure.test(name)) {
                return true;
            }
        }
        return false;
    }

    public void demonstrateNameComparatorAsLambdaExpression() {
        NamePrinter namePrinter = (String name) -> {
            int lengthOfName = name.length();
            PrintStream outputStream = System.out;
            outputStream.println(lengthOfName);
        };

        namePrinter.printLengthOfName("Leon Hunter");
    }

    public void demonstrateNameComparatorAsSingleLineLambdaExpression() {
        NamePrinter namePrinter = name -> System.out.println(name.length());
        namePrinter.printLengthOfName("Leon Hunter");
    }

    public void demonstrateNameComparatorAsMethodReference() {
        NamePrinter namePrinter = this::myMethod;
        namePrinter.printLengthOfName("Leon Hunter");
    }

    public void myMethod(String name) {
        int lengthOfName = name.length();
        PrintStream outputStream = System.out;
        outputStream.println(lengthOfName);
    }

    ;

    public void demonstrateNameComparatorAsAnonymousInnerClass() {
        NamePrinter namePrinter = new NamePrinter() {
            @Override
            public void printLengthOfName(String name) {
                int lengthOfName = name.length();
                PrintStream outputStream = System.out;
                outputStream.println(lengthOfName);
            }
        };

        namePrinter.printLengthOfName("Leon Hunter");
    }


    public void demoStringBuilder() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.insert(0, 5);
        stringBuilder.delete(0, 0);


        String result = new StringBuilder()
                .append("The")
                .append("Quick")
                .append("Brown")
                .append("The")
                .append("Quick")
                .append("Brown")
                .toString();
    }

    public void demoStringJoiner() {
        StringJoiner sj1 = new StringJoiner(",", "[", "]");
        StringJoiner sj2 = new StringJoiner(":", "[", "]");

        sj1.add("leon").add("hunter");
        sj2.add("Ali").add("hyman");

        StringJoiner sj3 = sj2.merge(sj1);
        System.out.println(sj3.toString());
    }

}
