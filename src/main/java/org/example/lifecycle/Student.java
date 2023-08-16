package org.example.lifecycle;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean {

    private static final Logger log = Logger.getLogger(org.example.constructorInjection.Test.class);

    private String name;


    public Student() {
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


    public void afterPropertiesSet() throws Exception {
        log.info("initializing");
    }
    public void destroy() throws Exception {
        log.info("destroying");
    }



//    public void init(){
//        log.info("initializing");
//    }
//    public void destroy(){
//        log.info("destroying");
//    }

}
