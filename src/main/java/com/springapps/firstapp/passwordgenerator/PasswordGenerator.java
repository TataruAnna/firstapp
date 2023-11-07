package com.springapps.firstapp.passwordgenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class PasswordGenerator {

    private PasswordAlphabet passwordAlphabet;

    private PasswordEncoder passwordEncoder;

    @Autowired
    public PasswordGenerator(@Qualifier("characters") PasswordAlphabet passwordAlphabet, PasswordEncoder passwordEncoder) {
        this.passwordAlphabet = passwordAlphabet;
        this.passwordEncoder=passwordEncoder;
    }

    public String generatePass(int length){
        Random random = new Random();
        String password = "";
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(passwordAlphabet.getCharacters().length());
            password += passwordAlphabet.getCharacters().charAt(index);
        }
        return password;
    }

    public String encode (String password){
       return passwordEncoder.encode(password);
    }
}
