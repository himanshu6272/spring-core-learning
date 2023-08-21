package org.example.eventlistener.demo2;

import org.springframework.context.ApplicationEvent;

public class PublisherEvent{

    private String name;
    public PublisherEvent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
