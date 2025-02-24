package com.rest.springboot.thymeleafdemo.service;

import com.rest.springboot.thymeleafdemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteByID(int theID);
}
