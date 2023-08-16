package org.example.lifecycle;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    private static final Logger log = Logger.getLogger(org.example.constructorInjection.Test.class);

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("configLifecycle.xml");
//        Student student1 = (Student) context.getBean("student2");
//        log.info(student1);
//        context.registerShutdownHook();
        Employee employee = (Employee) context.getBean("employee1");
        log.info(employee);
        context.registerShutdownHook();
    }
}
