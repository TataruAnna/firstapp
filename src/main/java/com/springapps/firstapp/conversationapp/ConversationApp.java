package com.springapps.firstapp.conversationapp;

import com.springapps.firstapp.beans.DemoBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConversationApp implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ConversationApp.class, args);
    }

    Conversation conversation;

    @Autowired
    public ConversationApp(Conversation conversation) {
        this.conversation = conversation;
    }

    @Override
    public void run(String... args) throws Exception {
        conversation.startConversation();
    }
}
