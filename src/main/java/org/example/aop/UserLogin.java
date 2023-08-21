package org.example.aop;

import org.apache.log4j.Logger;

public class UserLogin {
    private static final Logger log = Logger.getLogger(UserLogin.class);

    public void loginUser(){
        log.info("User logged in Successfully");
    }

}
