package org.example.eventlistener.demo1;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    private static final Logger log = Logger.getLogger(Test.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("eventlistenerconfigdemo1.xml");
        GamePublisher gamePublisher = context.getBean("gamePublisher", GamePublisher.class);
        gamePublisher.launchedGame("Temple Run");
    }
}
