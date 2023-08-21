package org.example.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
    private static final Logger log = Logger.getLogger(MyAspect.class);
    @Before("execution(* org.example.aop.UserLogin.loginUser())")
    public void sendEmailBefore(){
        log.info("login otp sent to the email");
    }

    @After("execution(* org.example.aop.UserLogin.loginUser())")
    public void userDetailUpdated(){
        log.info("User details updated successfully");
    }
}
