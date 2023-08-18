package org.example.beandefinitioninheritence.demo1;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    private static final Logger log = Logger.getLogger(Test.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("inheritencedemo1.xml");
        Child child = context.getBean("child", Child.class);
        log.info(child);
    }
}
