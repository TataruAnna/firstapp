package com.springapps.firstapp.conversationapp;

import org.springframework.beans.factory.annotation.Autowired;

public class Conversation {

    private Person one;
    private Person two;

    @Autowired
    public Conversation(Person one, Person two) {
        this.one = one;
        this.two = two;
    }

    public void startConversation(){
        System.out.println(one.sayHello());
        System.out.println(two.sayHello());
    }
}
