package com.project.Visible_Campus_EmployeeDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService = new EmployeeService();

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.creEmployee(employee);
    }
}
