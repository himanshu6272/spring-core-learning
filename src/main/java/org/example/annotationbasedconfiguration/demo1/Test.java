package org.example.annotationbasedconfiguration.demo1;

import org.apache.log4j.Logger;
import org.example.setterinjection.App;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    private static final Logger log = Logger.getLogger(Test.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("abcdemo1.xml");
        Student student = context.getBean("student1", Student.class);
        log.info(student);
    }
}
