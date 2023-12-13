package com.example.jpaPractice.course.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpaPractice.course.Employee;
import com.example.jpaPractice.course.EmployeeAddress;
import com.example.jpaPractice.course.repository.EmpAddressRepo;
import com.example.jpaPractice.course.repository.EmployeeRepo;
import com.example.jpaPractice.course.repository.NameOnly;
import com.example.jpaPractice.service.EmployeeService;

@RestController
public class JpaWeb {
	@Autowired
	private EmployeeRepo repository;
	
	@Autowired
	private EmpAddressRepo addressRepo;
	
	@Autowired
	EmployeeService service = new EmployeeService(repository,addressRepo);
	
   @PostMapping("/course")
   public void addEmployee(@RequestBody EmployeeService emp)
   {
	   Employee employee = new Employee(emp.getId(),emp.getName(),emp.getSalary(),emp.getDateOfJoining());
       EmployeeAddress address = new EmployeeAddress(emp.getId(),emp.getArea(),emp.getStreet(),emp.getCity());
	   service.getRepository().save(employee);
	   service.getAddRepo().save(address);
   }
   
   @GetMapping("/course")
   public List<Employee> getAll()
   {
	   return repository.findAll();
   }
	
//   @GetMapping("/course/{id}")
//   public Employee getById(@PathVariable int id)
//   {
//	   Optional<Employee> emp = repository.findById(id);
//	   if(emp.isEmpty())
//		   throw new RuntimeException("Not found");
//	   return emp.get();
//   }
   
   
   @GetMapping("/course/{city}")
   public List<NameOnly> findCity(@PathVariable String city)
   {
	  return repository.getByCity(city);
	   
   }
   
   
   @PutMapping("/course/{id}")
   public void update(@RequestBody EmployeeService emp)
   {
	   Optional<Employee> dto = service.getRepository().findById(emp.getId());
	   Optional<EmployeeAddress> addr = service.getAddRepo().findById(emp.getId());
	   if(dto.isEmpty())
	      throw new RuntimeException("Not found");
	   else
	      {
		      Employee e = new Employee(emp.getId(),emp.getName(),emp.getSalary(),emp.getDateOfJoining());
		      EmployeeAddress a = new EmployeeAddress(emp.getId(),emp.getArea(),emp.getStreet(),emp.getCity());
		      service.getRepository().delete(e);
		      service.getAddRepo().delete(a);
	    	  service.getRepository().save(e);
	    	  service.getAddRepo().save(a);
	    	  
	      }
   }
   
   @DeleteMapping("/course/{id}")
   public void removeById(@PathVariable int id)
   {
	   repository.deleteById(id);
	   addressRepo.deleteById(id);
	 
   }
   
   
     
}
