package com.springapps.firstapp.conversationapp;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public Person person1() {
        return new Person("John");
    }


    @Bean
    public Person person2() {
        return new Person("Mary");
    }

    @Bean Conversation conversation (Person person1, Person person2){
        return new Conversation(person1, person2);
    }
}
