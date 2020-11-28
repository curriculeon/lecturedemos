package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by leon on 2/10/2020.
 */
public class Person {
    private Long id;
    private String firstName;
    private String lastName;
    private String nickName;

    private Person(Long id, String firstName, String lastName, String nickName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
    }
    public  Person(String firstName, String lastName, String nickName) {
        this(null, firstName, lastName, nickName);
    }
}
