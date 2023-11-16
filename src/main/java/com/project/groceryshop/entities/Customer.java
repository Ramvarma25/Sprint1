package com.project.groceryshop.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String userName;
	private String phoneNumber;
	private String password;
	
	@OneToMany
	private List<Order> Order;



	public Customer(Long id, String userName, String phoneNumber, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.password = password;
	}



	public Customer() {
		super();

	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "Customer [id=" + id + ", userName=" + userName + ", phoneNumber=" + phoneNumber + ", password="
				+ password + "]";
	}
}


