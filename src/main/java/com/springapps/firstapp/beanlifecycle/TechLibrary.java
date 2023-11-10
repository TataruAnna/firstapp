package com.springapps.firstapp.beanlifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TechLibrary {
    private List<String> bookTitles;

    public TechLibrary() {
        this.bookTitles = new ArrayList<>();
    }
    @PostConstruct
    public void init(){
        bookTitles.add("Clean code");
        System.out.println("init"+ bookTitles);

    }
    @PreDestroy
    public void destroy(){
        bookTitles.clear();
        System.out.println("destroy" +bookTitles);

    }
}
