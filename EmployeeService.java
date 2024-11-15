package com.project.Visible_Campus_EmployeeDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    public Employee creEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

}
