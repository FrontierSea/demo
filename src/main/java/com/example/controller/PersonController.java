package com.example.controller;

import com.example.model.Person;
import com.example.model.PersonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({Person.class})
public class PersonController {

    @Autowired
    private Person person;

    @Autowired
    private PersonConfig config;

    @RequestMapping("/config")
    public String configPerson(){
        return person.getName()+">>>"+person.getAge();
    }

    @RequestMapping("/configPerson")
    public String config(){
        return config.getName()+">>>"+config.getAge();
    }
}
