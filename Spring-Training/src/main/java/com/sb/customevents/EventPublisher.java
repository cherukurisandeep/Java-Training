package com.sb.customevents;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class EventPublisher implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher publisher;
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher=publisher;
        System.out.println("---Set Publisher>>>");
        System.out.println(this.publisher);
        System.out.println("---->>>");
    }

    public void publish(){
        CustomEvent ce = new CustomEvent(this);
        publisher.publishEvent(ce);

    }
}
