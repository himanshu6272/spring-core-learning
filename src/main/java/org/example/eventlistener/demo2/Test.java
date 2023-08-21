package org.example.eventlistener.demo2;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    private static final Logger log = Logger.getLogger(Test.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("eventlistenerconfigdemo2.xml");
        GamePublisher gamePublisher = context.getBean("gamePublisher", GamePublisher.class);
        gamePublisher.launchedGame("Subway Surfer");
    }
}
