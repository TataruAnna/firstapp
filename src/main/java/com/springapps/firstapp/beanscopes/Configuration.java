package com.springapps.firstapp.beanscopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    //daca vrem ca bean-ul sa nu fie singleton, specificam scope-ul protorype
    //@Scope("prototype")
    public Count counter(){
        return new Count(0);
    }
}
