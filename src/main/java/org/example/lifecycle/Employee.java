package org.example.lifecycle;

import org.apache.log4j.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {
    private static final Logger log = Logger.getLogger(org.example.constructorInjection.Test.class);

    private String name;


    public Employee() {
    }

    public String getName() {
        log.info("getting name");
        return name;
    }

    public void setName(String name) {
        log.info("setting name");
        this.name = name;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    @PostConstruct
    public void init(){
        log.info("initializing");
    }

    @PreDestroy
    public void destroy(){
        log.info("destroying");
    }

}
