package com.rest.springboot.thymeleafdemo.controller;


import com.rest.springboot.thymeleafdemo.entity.Employee;
import com.rest.springboot.thymeleafdemo.service.EmployeeService;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService theEmployeeService) {
        employeeService = theEmployeeService;
    }

    // add mapping for "/list"

    @GetMapping("/list")
    public String listEmployees(Model theModel) {

        // get the employees from db
        List<Employee> theEmployees = employeeService.findAll();

        // add to the spring model
        theModel.addAttribute("employees", theEmployees);

        return "employees/list-employees";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel){
        // create model attribute and bind the form data
        theModel.addAttribute("employees", new Employee());

        return "employees/employee-form";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("employeeId") int theId, Model theModel){

        // get the employees from the service
        Employee theEmployee = employeeService.findById(theId);

        // set employee in the model to prepopulate the form
        theModel.addAttribute("employees", theEmployee);

        // send over to our form
        return "employees/employee-form";
    }

    @GetMapping("/showFormForDelete")
    public String delete(@RequestParam("employeeId") int theId) {

        // delete the employee
        employeeService.deleteByID(theId);

        // redirect to /employees/list
        return "redirect:/employees/list";

    }

    @PostMapping("save")
    public String saveEmployee(@ModelAttribute("employees") Employee theEmployee){

        // save the employees
        employeeService.save(theEmployee);

        // use a redirect to prevent duplicate submissions
        return "redirect:/employees/list";
    }
}