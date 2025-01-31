package com.rest.springboot.cruddemo.dao;

import com.rest.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> { // Entity type -> Employee, Primary key -> Integer

}
