package com.github.perschola;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class MyObject implements Runnable {
    public void run() {
        Console.println("Welcome to my casino");
        Console.println("From here, you can select any of the following options");
        Console.println(Arrays.toString(GameMenuDecision.values()));
        String userInput = Console.getStringInput("Make Selection");
        GameMenuDecision decision = GameMenuDecision.valueOf(userInput);
        decision.playGame();
    }
}
