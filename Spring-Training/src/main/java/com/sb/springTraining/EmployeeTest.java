package com.sb.springTraining;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeTest {
    public static void main(String[] args) {

        Resource r=new ClassPathResource("web.xml");
        BeanFactory factory=new XmlBeanFactory(r);

        Employee s=(Employee)factory.getBean("e");
        s.show();

        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("web.xml");
        System.out.println("Spring Context initialized");
        EmployeeService service = (EmployeeService) ctx.getBean("employeeService");
        System.out.println("Bean retrieved from Spring Context");
        System.out.println("Employee Name="+service.getEmployee().getName());
        System.out.println("Employee Id="+service.getEmployee().getId());
        ctx.close();
        System.out.println("Spring Context Closed");

        Employee em=(Employee)factory.getBean("employeeData");
        em.show();
    }
}
