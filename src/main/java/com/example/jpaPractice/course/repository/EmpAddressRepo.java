package com.example.jpaPractice.course.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.jpaPractice.course.Employee;
import com.example.jpaPractice.course.EmployeeAddress;
import com.example.jpaPractice.service.EmployeeService;

public interface EmpAddressRepo extends JpaRepository<EmployeeAddress, Integer> {

	@Query("select addr from EmployeeAddress addr where city=:city")
	List<EmployeeAddress> findBy(String city);
}
