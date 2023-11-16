package com.project.groceryshop.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Staff {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String address;
	private String role;
	private String phoneNumber;
	
	
	public Staff(Long id, String name, String address, String role, String phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.role = role;
		this.phoneNumber = phoneNumber;
	}
	
	
	
	public Staff() {
		super();
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	



	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + ", address=" + address + ", role=" + role + ", phoneNumber="
				+ phoneNumber + "]";
	}




}
