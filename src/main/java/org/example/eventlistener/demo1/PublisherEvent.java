package org.example.eventlistener.demo1;

import org.springframework.context.ApplicationEvent;

public class PublisherEvent extends ApplicationEvent {

    private String name;
    public PublisherEvent(Object source) {
        super(source);
    }

    public PublisherEvent(Object source, String name) {
        super(source);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
