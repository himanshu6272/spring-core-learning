package org.example.eventlistener.demo2;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Ashish{
    private static final Logger log = Logger.getLogger(Ashish.class);
    public void playGame(String name){
        log.info("Ashish Started playing: "+ name);
    }

    @EventListener
    public void onApplicationEvent(PublisherEvent event) {
        playGame(event.getName());
    }
}
