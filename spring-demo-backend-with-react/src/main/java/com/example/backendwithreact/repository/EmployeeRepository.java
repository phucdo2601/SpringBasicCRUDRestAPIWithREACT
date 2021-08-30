package com.example.backendwithreact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backendwithreact.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
