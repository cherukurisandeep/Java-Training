package com.sb.customevents;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String args[]){

        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("web.xml");

        EventPublisher ep =  (EventPublisher) ctx.getBean("publishEvent");

        ep.publish();



    }
}
