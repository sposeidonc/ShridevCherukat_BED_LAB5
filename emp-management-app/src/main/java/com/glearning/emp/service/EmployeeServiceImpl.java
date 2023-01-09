package com.glearning.emp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.glearning.emp.dao.EmployeeJpaRepository;
import com.glearning.emp.model.Employee;

//Service implementation with definitions to the methods in the service interface
@Service
public class EmployeeServiceImpl implements EmployeeService {

	private final EmployeeJpaRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeJpaRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	// Method to fetch all employee details in database
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = this.employeeRepository.findAll();
		return employees;
	}

	// Method to save an employee detail in database
	@Override
	public Employee saveEmployee(Employee employee) {
		return this.employeeRepository.save(employee);
	}

	// Method to fetch employee details by id in database
	@Override
	public Employee getEmployeeById(Long id) {

		return this.employeeRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("invalid employee id passed"));
	}

	// Method to update an employee detail in database
	@Override
	public Employee updateEmployee(Employee employee) {
		return this.employeeRepository.save(employee);
	}

	// Method to delete an employee detail in database
	@Override
	public void deleteEmployeeById(Long id) {
		this.employeeRepository.deleteById(id);

	}

}
