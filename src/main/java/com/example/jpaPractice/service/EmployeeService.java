package com.example.jpaPractice.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.jpaPractice.course.Employee;
import com.example.jpaPractice.course.EmployeeAddress;
import com.example.jpaPractice.course.repository.EmpAddressRepo;
import com.example.jpaPractice.course.repository.EmployeeRepo;

@Service
public class EmployeeService {
	int id;
	String name;
	BigDecimal salary;
	LocalDate dateOfJoining;
	String area;
	String street;
	String city;
	
	@Autowired
	EmployeeRepo repository;
	
	@Autowired
	EmpAddressRepo addRepo;
	
	public EmployeeService(int id, String name, BigDecimal salary, LocalDate dateOfJoining, String area, String street,
			String city) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
		this.area = area;
		this.street = street;
		this.city = city;
	}
    
	

	public EmployeeService(EmployeeRepo repository, EmpAddressRepo addRepo) {
		super();
		this.repository = repository;
		this.addRepo = addRepo;
	}



	public EmployeeService() {
		super();
	}



	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public BigDecimal getSalary() {
		return salary;
	}



	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}



	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}



	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}



	public String getArea() {
		return area;
	}



	public void setArea(String area) {
		this.area = area;
	}



	public String getStreet() {
		return street;
	}



	public void setStreet(String street) {
		this.street = street;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public EmployeeRepo getRepository() {
		return repository;
	}



	public void setRepository(EmployeeRepo repository) {
		this.repository = repository;
	}



	public EmpAddressRepo getAddRepo() {
		return addRepo;
	}



	public void setAddRepo(EmpAddressRepo addRepo) {
		this.addRepo = addRepo;
	}

	
}
