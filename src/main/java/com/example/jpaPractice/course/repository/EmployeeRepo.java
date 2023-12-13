package com.example.jpaPractice.course.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.jpaPractice.course.Employee;


public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

//	@Query("select u from Employee u where u.salary >:salary AND u.dateOfJoining =:dateOfJoining")
//	List<Employee> findUsers(BigDecimal salary,LocalDate dateOfJoining);
//	
	@Query("select e.name as name, a.city as city from Employee e , EmployeeAddress a where  e.id = a.id AND a.city = :city")
    List<NameOnly> getByCity(String city);
	
	
	}
