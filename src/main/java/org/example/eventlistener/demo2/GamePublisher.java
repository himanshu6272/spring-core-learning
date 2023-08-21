package org.example.eventlistener.demo2;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class GamePublisher {
    private static final Logger log = Logger.getLogger(GamePublisher.class);
    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    public void launchedGame(String name){
        log.info("Game publisher launched: "+ name);
        applicationEventPublisher.publishEvent(new PublisherEvent(name));

    }
}
