package com.github.perschola;

import java.util.Scanner;

/**
 * Created by leon on 2/4/2020.
 */
public class Console {
    public static void println(Object prompt) {
        System.out.println(prompt);
    }

    public static String getStringInput(String prompt) {
        println(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
