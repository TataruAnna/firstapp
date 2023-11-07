package com.springapps.firstapp.beanscopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoScopes implements CommandLineRunner {

    private Count counter1;
    private Count counter2;

    @Autowired
    public DemoScopes(Count counter1, Count counter2) {
        this.counter1 = counter1;
        this.counter2 = counter2;
    }

    @Override
    public void run(String... args) throws Exception {
       counter1.increment();
       counter2.increment();
        System.out.println(counter1.getCounter());
        System.out.println(counter2.getCounter());
    }


    public static void main(String[] args) {
        SpringApplication.run(DemoScopes.class, args);
    }
}
