package org.example.eventlistener.demo2;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Vinay {
    private static final Logger log = Logger.getLogger(Vinay.class);
    public void playGame(String name){
        log.info("Vinay Started playing: "+ name);
    }

    @EventListener
    public void onApplicationEvent(PublisherEvent event) {
        playGame(event.getName());
    }
}
