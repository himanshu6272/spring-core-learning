package org.example.messagesource;

import org.apache.log4j.Logger;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

public class Test {
    private static final Logger log = Logger.getLogger(Test.class);
    public static void main(String[] args) {
        MessageSource source = new ClassPathXmlApplicationContext("messagesourceconfig.xml");
        String message1 = source.getMessage("message", null, "DEFAULT", Locale.ENGLISH);
        String message2 = source.getMessage("argument.required", null, "DEFAULT", Locale.ENGLISH);
        log.info(message1);
        log.info(message2);

    }

}
