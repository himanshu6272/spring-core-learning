package org.example.annotationbasedconfiguration.demo3;

import org.apache.log4j.Logger;

public class Client {
    private static final Logger log = Logger.getLogger(User.class);
    public void clientInfo(){
        log.info("I am the client of User");
        log.info("My name is Ashish Rajput");
    }
}
