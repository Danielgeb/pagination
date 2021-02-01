package com.cogent.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
