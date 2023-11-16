package com.project.groceryshop.dao;

import org.springframework.data.repository.CrudRepository;

import com.project.groceryshop.entities.Customer;

public interface CustomerDao extends CrudRepository<Customer, Long> {
	
	
}
