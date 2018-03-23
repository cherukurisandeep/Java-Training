package com.sb.bean.inheritance;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClass {
    public static void main(String[] args) {
        Resource r=new ClassPathResource("web.xml");
        BeanFactory factory=new XmlBeanFactory(r);

        Vehicles veh = (Vehicles)factory.getBean("veh");
        veh.getBikes();
        veh.getCars();

        Brands brd = (Brands)factory.getBean("brands");
        brd.getCars();
        brd.getBikes();
        brd.getAutos();


    }
}
