package com.github.curriculeon;

import java.util.Date;

/**
 * Created by Leon Hunter on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
        return null;
    }

    /**
     * @param firstSegment  a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment) {
        return null;
    }

    /**
     * @param firstSegment  a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment) {
        return null;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input) {
        return null;
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input) {
        int numberOfCharacters = input.length();
        int startIndex = numberOfCharacters - 3;
        return input.substring(startIndex);
    }

    /**
     * @param inputValue      the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue) {
        boolean result = inputValue == comparableValue;
        return result;
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue) {
        int numberOfCharacters = inputValue.length();
        if(numberOfCharacters % 2 == 0) {
            int middle = numberOfCharacters / 2;
            return inputValue.charAt(middle-1);
        } else {
            int middle = numberOfCharacters / 2;
            return inputValue.charAt(middle);
        }
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString) {
        return null;
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString) {
        return null;
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse) {
        // "zipcoder" -> [ 'z', 'i', 'c', 'o' ... ]
        String result = "";
        char[] characterArray = stringToReverse.toCharArray();
        int numberOfCharacters = characterArray.length;
        int lastIndex = numberOfCharacters - 1;
        int numberOfTimesLooped = 0;
        while (numberOfCharacters > numberOfTimesLooped) {
            int currentIndex = lastIndex - numberOfTimesLooped;
            char currentCharacter = characterArray[currentIndex];
            result = result + currentCharacter;

            System.out.println(currentCharacter);
            numberOfTimesLooped = numberOfTimesLooped + 1;
        }


        return result;
    }

    public static void whileLoopExample() {
        int endPosition = 10;
        int startPosition = 4;
        int numberOfIterations = endPosition - startPosition; // TODO - Determine the number of times this loop will iterate
        System.out.println("This will iterate " + numberOfIterations + " times");

        int numberOfTimesLooped = 0;
        int currentPosition = startPosition;
        while (currentPosition < endPosition) {
            System.out.println("X is lesser than Y");
            currentPosition = currentPosition + 1;
            numberOfTimesLooped = numberOfTimesLooped + 1;
            System.out.println(numberOfTimesLooped);
        }
    }
}
