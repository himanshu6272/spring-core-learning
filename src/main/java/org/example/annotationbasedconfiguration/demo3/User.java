package org.example.annotationbasedconfiguration.demo3;

import org.apache.log4j.Logger;

public class User {
    private static final Logger log = Logger.getLogger(User.class);

    private Client client;

    public User(Client client) {
        this.client = client;
    }

    public void test(){
        client.clientInfo();
        log.info("This is the test method in User class");
    }
}
