package com.sb.customevents;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class EventHandler implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("----EventHandler--->>");
        System.out.println(applicationEvent.toString());
    }
}
