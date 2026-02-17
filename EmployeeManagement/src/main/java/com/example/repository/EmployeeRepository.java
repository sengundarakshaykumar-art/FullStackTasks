package com.example.repository;

import java.util.*;
import org.springframework.stereotype.Component;
import com.example.model.Employee;

@Component
public class EmployeeRepository {

    private List<Employee> list = new ArrayList<>();

    public void addEmployee(Employee e) {
        list.add(e);
    }

    public List<Employee> getEmployees() {
        return list;
    }
}
