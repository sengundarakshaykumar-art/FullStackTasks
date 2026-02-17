package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.repository.EmployeeRepository;
import com.example.model.Employee;

@Component
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    public void addEmployee(int id, String name, double salary) {
        repo.addEmployee(new Employee(id, name, salary));
    }

    public void showEmployees() {
        repo.getEmployees().forEach(System.out::println);
    }
}
