package com.github.curriculeon.models;

import com.github.curriculeon.models.dndcharacter.DndCharacterInterface;

import java.util.List;

/**
 * Created by leon on 2/24/2020.
 */
public class User {
    private String username;
    private String email;
    private String password;
    private List<DndCharacterInterface> characterList;

    public User(String username, String email, String password, List<DndCharacterInterface> characterList) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.characterList = characterList;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<DndCharacterInterface> getCharacterList() {
        return characterList;
    }

    public void setCharacterList(List<DndCharacterInterface> characterList) {
        this.characterList = characterList;
    }
}
