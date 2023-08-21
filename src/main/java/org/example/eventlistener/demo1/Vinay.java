package org.example.eventlistener.demo1;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class Vinay implements ApplicationListener<PublisherEvent> {
    private static final Logger log = Logger.getLogger(Vinay.class);
    public void playGame(String name){
        log.info("Vinay Started playing: "+ name);
    }

    public void onApplicationEvent(PublisherEvent event) {
        playGame(event.getName());
    }
}
