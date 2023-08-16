package org.example.referencetype;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    private static final Logger logger = Logger.getLogger(Test.class);
    public static void main(String[] args) {
        ApplicationContext context = new  ClassPathXmlApplicationContext("config2.xml");
        B a = (B) context.getBean("bref");
        logger.info(a);
    }
}
