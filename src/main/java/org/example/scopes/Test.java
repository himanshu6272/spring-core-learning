package org.example.scopes;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    private static final Logger log = Logger.getLogger(Test.class);
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("scopesconfig.xml");
        Student student1 = context.getBean("student1", Student.class);
        log.info(student1.hashCode());
        Student student2 = context.getBean("student1", Student.class);
        log.info(student2.hashCode());
        Student student3 = context.getBean("student2", Student.class);
        log.info(student3.hashCode());
        Student student4 = context.getBean("student2", Student.class);
        log.info(student4.hashCode());

    }
}
