package org.example.eventlistener.demo1;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class Ashish implements ApplicationListener<PublisherEvent> {
    private static final Logger log = Logger.getLogger(Ashish.class);
    public void playGame(String name){
        log.info("Ashish Started playing: "+ name);
    }

    public void onApplicationEvent(PublisherEvent event) {
        playGame(event.getName());
    }
}
