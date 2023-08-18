package org.example.setterinjection;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */

public class App 
{
    private static final Logger logger = Logger.getLogger(App.class);


    public static void main( String[] args )
    {
        logger.info( "Hello World!" );
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Employee employee1 = (Employee) applicationContext.getBean("emp1");
        Employee employee2 = (Employee) applicationContext.getBean("emp2");
        logger.info(employee1);
        logger.info(employee2);
    }
}
