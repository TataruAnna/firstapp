package com.springapps.firstapp.beans;

import com.springapps.firstapp.DIclassic.C;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public String address1() {
        return "str. Republicii, 102";
    }

    @Bean
    public String address2(){
        return "str. Republicii, 103";
    }

    @Bean
    public Customer customer (@Qualifier("address2")  String address){
        return new Customer("John", address);
    }


    @Bean Customer temporary (@Autowired Customer customer){
        System.out.println(customer);
        return customer;
    }

}
