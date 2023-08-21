package org.example.aop;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    private static final Logger log = Logger.getLogger(UserLogin.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aopconfig.xml");
        UserLogin user = context.getBean("user", UserLogin.class);
        user.loginUser();
    }
}
