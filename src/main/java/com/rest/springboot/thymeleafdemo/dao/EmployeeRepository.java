package com.rest.springboot.thymeleafdemo.dao;

import com.rest.springboot.thymeleafdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> { // Entity type -> Employee, Primary key -> Integer

    // adding method to sort it by last name
    public List<Employee> findAllByOrderByLastNameAsc();
}
