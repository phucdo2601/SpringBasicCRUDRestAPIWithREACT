package com.example.backendwithreact.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.backendwithreact.model.Employee;
import com.example.backendwithreact.repository.EmployeeRepository;
import com.example.backendwithreact.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public <S extends Employee> S save(S entity) {
		return employeeRepository.save(entity);
	}

	@Override
	public <S extends Employee> Optional<S> findOne(Example<S> example) {
		return employeeRepository.findOne(example);
	}

	@Override
	public Page<Employee> findAll(Pageable pageable) {
		return employeeRepository.findAll(pageable);
	}

	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	@Override
	public List<Employee> findAll(Sort sort) {
		return employeeRepository.findAll(sort);
	}

	@Override
	public List<Employee> findAllById(Iterable<Long> ids) {
		return employeeRepository.findAllById(ids);
	}

	@Override
	public Optional<Employee> findById(Long id) {
		return employeeRepository.findById(id);
	}

	@Override
	public <S extends Employee> List<S> saveAll(Iterable<S> entities) {
		return employeeRepository.saveAll(entities);
	}

	@Override
	public void flush() {
		employeeRepository.flush();
	}

	@Override
	public <S extends Employee> S saveAndFlush(S entity) {
		return employeeRepository.saveAndFlush(entity);
	}

	@Override
	public boolean existsById(Long id) {
		return employeeRepository.existsById(id);
	}

	@Override
	public <S extends Employee> List<S> saveAllAndFlush(Iterable<S> entities) {
		return employeeRepository.saveAllAndFlush(entities);
	}

	@Override
	public <S extends Employee> Page<S> findAll(Example<S> example, Pageable pageable) {
		return employeeRepository.findAll(example, pageable);
	}

	@Override
	public void deleteInBatch(Iterable<Employee> entities) {
		employeeRepository.deleteInBatch(entities);
	}

	@Override
	public <S extends Employee> long count(Example<S> example) {
		return employeeRepository.count(example);
	}

	@Override
	public <S extends Employee> boolean exists(Example<S> example) {
		return employeeRepository.exists(example);
	}

	@Override
	public void deleteAllInBatch(Iterable<Employee> entities) {
		employeeRepository.deleteAllInBatch(entities);
	}

	@Override
	public long count() {
		return employeeRepository.count();
	}

	@Override
	public void deleteById(Long id) {
		employeeRepository.deleteById(id);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		employeeRepository.deleteAllByIdInBatch(ids);
	}

	@Override
	public void delete(Employee entity) {
		employeeRepository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		employeeRepository.deleteAllById(ids);
	}

	@Override
	public void deleteAllInBatch() {
		employeeRepository.deleteAllInBatch();
	}

	@Override
	public Employee getOne(Long id) {
		return employeeRepository.getOne(id);
	}

	@Override
	public void deleteAll(Iterable<? extends Employee> entities) {
		employeeRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		employeeRepository.deleteAll();
	}

	@Override
	public Employee getById(Long id) {
		return employeeRepository.getById(id);
	}

	@Override
	public <S extends Employee> List<S> findAll(Example<S> example) {
		return employeeRepository.findAll(example);
	}

	@Override
	public <S extends Employee> List<S> findAll(Example<S> example, Sort sort) {
		return employeeRepository.findAll(example, sort);
	}
	
	
}
