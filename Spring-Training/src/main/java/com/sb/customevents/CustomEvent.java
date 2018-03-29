package com.sb.customevents;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {

    public CustomEvent(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return "Raise Custom Event";
    }
}
