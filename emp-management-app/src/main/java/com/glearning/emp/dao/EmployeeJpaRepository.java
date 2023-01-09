package com.glearning.emp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.glearning.emp.model.Employee;

// Repository class extending JpaRepository to enable CRUD operations
@Repository
public interface EmployeeJpaRepository extends JpaRepository<Employee, Long>{

}
