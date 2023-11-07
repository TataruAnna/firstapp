package com.springapps.firstapp.passwordgenerator;

import org.springframework.stereotype.Component;


public class PasswordAlphabet {

    private String characters;

    public PasswordAlphabet(String characters) {
        this.characters = characters;
    }

    public String getCharacters() {
        return characters;
    }

    public void setCharacters(String characters) {
        this.characters = characters;
    }
}
