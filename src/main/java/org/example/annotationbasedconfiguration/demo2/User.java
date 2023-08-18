package org.example.annotationbasedconfiguration.demo2;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class User {
    private static final Logger log = Logger.getLogger(User.class);
    public void test(){
        log.info("This is the test method in User class");
    }
}
