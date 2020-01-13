package com.github.perschola;

import com.github.perschola.generics.GenericPerson;
import com.github.perschola.varargs.Person;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What instructor would you like details about?");
        String userInput = scanner.nextLine();
        Person person = Person.getValueOf(userInput);
        System.out.println(person);
        System.out.println("--------------------------");
        System.out.println("Printing all person details");
        Person[] personArray = Person.values();
        for (int i = 0; i < personArray.length; i++) {
            Person person1 = personArray[i];
            System.out.println(person1);
        }
    }

    public static void demoConstructor() {
        GenericPerson person = new GenericPerson("Leon", "Hunter", null);
        String personDetails = person.toString();
        System.out.println(personDetails);
    }

    public static void demoSetValue() {
        GenericPerson person = new GenericPerson();
        person.firstName.set("Leon");
        person.lastName.set("Hunter");
        person.age.set(99);
    }
}
