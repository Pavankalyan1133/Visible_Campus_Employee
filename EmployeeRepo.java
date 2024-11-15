package com.project.Visible_Campus_EmployeeDetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
