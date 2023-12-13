package com.example.jpaPractice.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.transaction.Transactional;

@Entity
public class EmployeeAddress {

	@Id
	private int id;
	
	@Column(name="area")
	private String area;
	
	@Column(name="street")
	private String street;
	
	@Column(name="city")
	private String city;
	
	@Override
	public String toString() {
		return "EmployeeAddress [area=" + area + ", street=" + street + ", city=" + city + "]";
	}
	
	public EmployeeAddress() {
		super();
	}

	public EmployeeAddress(int id,String area, String street, String city) {
		super();
		this.id = id;
		this.area = area;
		this.street = street;
		this.city = city;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	
	
}
