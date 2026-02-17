package com.example.EmployeeManagement;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.service.EmployeeService;

public class App {

    public static void main(String[] args) {

        BeanFactory factory =
            new ClassPathXmlApplicationContext("applicationContext.xml");

        EmployeeService service =
            factory.getBean(EmployeeService.class);

        service.addEmployee(1, "Akshay", 50000);
        service.addEmployee(2, "Ravi", 60000);

        service.showEmployees();
    }
}
