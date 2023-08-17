package org.example.autowiring.xml;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    private static final Logger log = Logger.getLogger(Test.class);
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowirexmlconfig.xml");
        Person person = context.getBean("person1", Person.class);
        log.info(person);

    }
}
