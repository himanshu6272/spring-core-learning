package org.example.annotationbasedconfiguration.demo3;

//import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
//    private static final Logger log = Logger.getLogger(User.class);

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
        User user = context.getBean("userBean", User.class);
        user.test();
    }
}
