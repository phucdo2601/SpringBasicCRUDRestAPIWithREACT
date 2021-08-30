package com.example.backendwithreact.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.backendwithreact.model.Employee;

public interface EmployeeService {

	<S extends Employee> List<S> findAll(Example<S> example, Sort sort);

	<S extends Employee> List<S> findAll(Example<S> example);

	Employee getById(Long id);

	void deleteAll();

	void deleteAll(Iterable<? extends Employee> entities);

	Employee getOne(Long id);

	void deleteAllInBatch();

	void deleteAllById(Iterable<? extends Long> ids);

	void delete(Employee entity);

	void deleteAllByIdInBatch(Iterable<Long> ids);

	void deleteById(Long id);

	long count();

	void deleteAllInBatch(Iterable<Employee> entities);

	<S extends Employee> boolean exists(Example<S> example);

	<S extends Employee> long count(Example<S> example);

	void deleteInBatch(Iterable<Employee> entities);

	<S extends Employee> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends Employee> List<S> saveAllAndFlush(Iterable<S> entities);

	boolean existsById(Long id);

	<S extends Employee> S saveAndFlush(S entity);

	void flush();

	<S extends Employee> List<S> saveAll(Iterable<S> entities);

	Optional<Employee> findById(Long id);

	List<Employee> findAllById(Iterable<Long> ids);

	List<Employee> findAll(Sort sort);

	List<Employee> findAll();

	Page<Employee> findAll(Pageable pageable);

	<S extends Employee> Optional<S> findOne(Example<S> example);

	<S extends Employee> S save(S entity);

}
