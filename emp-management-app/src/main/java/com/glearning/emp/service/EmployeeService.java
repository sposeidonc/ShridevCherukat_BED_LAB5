package com.glearning.emp.service;

import java.util.List;

import com.glearning.emp.model.Employee;

// Service interface with service methods initialized
public interface EmployeeService {

	List<Employee> getAllEmployees();

	Employee saveEmployee(Employee employee);

	Employee getEmployeeById(Long id);

	Employee updateEmployee(Employee employee);

	void deleteEmployeeById(Long id);

}
