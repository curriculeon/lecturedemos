package com.github.curriculeon;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        getUserNameAndUserAgeWithConsole();
    }

    public static void getUserNameAndUserAgeWithConsole() {
        IOConsole ioConsole = new IOConsole();
        String description = "My name is [ %s ]. My age is [ %s ].";

        String userName = ioConsole.getStringInput("Enter your name");
        Integer userAge = ioConsole.getIntegerInput("Enter your age");
        System.out.printf(description, userName, userAge);
    }

    public static void getUserNameAndUserAgeWithScanner() {
        Scanner scanner = new Scanner(System.in); // create scanner to get input
        String description = "My name is [ %s ]. My age is [ %s ].";
        String promptUserForName = "Enter your name";
        String promptUserForAge = "Enter your age";



        System.out.println(promptUserForName); // prompt user for name
        String userInputName = scanner.nextLine(); // use scanner to get input

        System.out.println(promptUserForAge); // prompt user for age
        String userInputAge = scanner.nextLine(); // use scanner to get input



        String formattedString = String.format(description, userInputName, userInputAge);
        System.out.println(formattedString);
    }

    public static void getUserNameWithScanner() {
        String userNameDescription = "My name is %s.";
        String promptUserForName = "Enter your name";
        System.out.println(promptUserForName);
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String formattedString = String.format(userNameDescription, userInput);
        System.out.println(formattedString);
    }
}
