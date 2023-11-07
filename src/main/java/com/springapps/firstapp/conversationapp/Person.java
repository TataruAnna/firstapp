package com.springapps.firstapp.conversationapp;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String sayHello(){
        return "my name is "+this.name;
    }
}
