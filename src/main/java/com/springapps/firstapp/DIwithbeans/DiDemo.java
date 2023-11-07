package com.springapps.firstapp.DIwithbeans;

import com.springapps.firstapp.conversationapp.ConversationApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiDemo implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(DiDemo.class, args);
    }

    private C c;

    @Autowired
    public DiDemo(C c) {
        this.c = c;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(c.generateNumber());
    }
}
