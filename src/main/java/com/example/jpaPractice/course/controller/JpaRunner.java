package com.example.jpaPractice.course.controller;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.jpaPractice.course.Employee;
import com.example.jpaPractice.course.repository.EmployeeRepo;

//@Component
public class JpaRunner implements CommandLineRunner{

	//@Autowired
	private EmployeeRepo repository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		repository.save(new Employee(1,"Mercia",new BigDecimal(324242.23),LocalDate.of(2023, 12, 10)));
//		repository.save(new Employee(2,"Shania",new BigDecimal(324454),LocalDate.of(2021, 12, 10)));
//		repository.save(new Employee(3,"Issac",new BigDecimal(4254524),LocalDate.of(2013, 12, 10)));
//		repository.save(new Employee(4,"Merline",new BigDecimal(3234533),LocalDate.of(2020, 12, 10)));
		System.out.println(repository.findAll());
		System.out.println(repository.findById(1));
		
	}

}
