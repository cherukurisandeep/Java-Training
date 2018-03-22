package com.sb.springTraining;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class EmployeeService implements InitializingBean,DisposableBean {
    private Employee employee;

    public Employee getEmployee(){
        return employee;
    }

    public void setEmployee(Employee employee){
        this.employee = employee;

    }

    public EmployeeService(){
        System.out.println("EmployeeService no-args constructor called  !!");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("EmployeeService closed ");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Employee with dummy values method called");
        if(employee.getName() != null){
            employee.setName("Cherukuri");
            employee.setId(21);
        }else {
            System.out.println("Error 1st Bean");
        }
    }
}
