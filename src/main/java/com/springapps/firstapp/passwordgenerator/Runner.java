package com.springapps.firstapp.passwordgenerator;

import com.springapps.firstapp.beanscopes.Count;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Runner implements CommandLineRunner {


    private PasswordGenerator passwordGenerator;

    @Autowired
    public Runner(PasswordGenerator passwordGenerator) {
        this.passwordGenerator = passwordGenerator;
    }

    @Override
    public void run(String... args) throws Exception {
        //System.out.println(passwordGenerator.generatePass(8));
        System.out.println(passwordGenerator.encode(passwordGenerator.generatePass(8)));
    }


    public static void main(String[] args) {
        SpringApplication.run(Runner.class, args);
    }
}
