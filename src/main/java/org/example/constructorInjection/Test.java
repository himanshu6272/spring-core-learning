package org.example.constructorInjection;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    private static final Logger log = Logger.getLogger(Test.class);
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constInjConfig.xml");
        Student student1 = (Student) context.getBean("student1");
        log.info(student1);
    }
}
