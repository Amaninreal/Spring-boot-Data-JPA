package com.rest.springboot.cruddemo.dao;

import com.rest.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

//@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> { // Entity type -> Employee, Primary key -> Integer

}
