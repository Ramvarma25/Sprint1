package com.project.groceryshop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.groceryshop.dao.CustomerDao;
import com.project.groceryshop.entities.Customer;

@Service
public class CustomerService {

	@Autowired
	private CustomerDao customerDao;

	public String createCustomer(Customer customer) {
		return customerDao.save(customer).toString();
	}

	public String getCustomer(Long customerId) {
		return customerDao.findById(customerId).orElse(null).toString();
	}

	public Iterable<Customer> getAllCustomer() {
		return customerDao.findAll();
	}

	public Customer updateCustomer(Long customerId, Customer updateCustomer) {
		Customer customerToUpdate = customerDao.findById(customerId).orElse(null);

		if (customerToUpdate != null) {
			customerToUpdate.setUserName(updateCustomer.getUserName());
			customerToUpdate.setPassword(updateCustomer.getPassword());
			customerToUpdate.setPhoneNumber(updateCustomer.getPhoneNumber());
			return customerDao.save(customerToUpdate);
		} else {
			return null;
		}
	}

	public void deleteCustomer(Long customerId) {
		customerDao.deleteById(customerId);
	}
}
