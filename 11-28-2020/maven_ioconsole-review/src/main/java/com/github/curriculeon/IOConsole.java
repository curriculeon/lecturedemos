package com.github.curriculeon;

import java.util.Scanner;

public class IOConsole {

    public void println(String output) {
        System.out.println(output);
    }

    public String getStringInput(String prompt) {
        println(prompt);
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public Double getDoubleInput(String prompt) {
        String userInputAsString = getStringInput(prompt);
        Double userInputAsDouble = Double.parseDouble(userInputAsString);
        return userInputAsDouble;
    }

    public Integer getIntegerInput(String prompt) {
        return getDoubleInput(prompt).intValue();
    }
}
