package com.github.curriculeon;

public class MainApplication {
    public static void main(String[] args) {
        String userDescription = "%s is %s years old. %s is their last name. %s is their dog's name.";
        String userDescriptionFormatted = String.format(userDescription, "Leon", 27, "Hunter", "Milo");
        System.out.println(userDescriptionFormatted);
        System.out.printf(userDescription, "Leon", 27, "Hunter", "Milo");
        String expectedDescription = "[Leon] is [27] years old. [Hunter] is their last name. [Milo] is their dog's name.";
    }
}
