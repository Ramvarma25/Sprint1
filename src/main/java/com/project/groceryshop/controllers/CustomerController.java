package com.project.groceryshop.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.project.groceryshop.entities.Customer;
import com.project.groceryshop.services.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	// To add customers
	@PostMapping("/createCustomer")
	public String createCustomer(@RequestBody Customer customer) {
		return customerService.createCustomer(customer);
	}

	// Get customer by Id
	@GetMapping("/getCustomer/{customerId}")
	public String getCustomer(@PathVariable Long customerId) {
		return customerService.getCustomer(customerId);
	}

	// Get all Customers
	@GetMapping("/getAllCustomer")
	public Iterable<Customer> getAllCustomer(){
		return customerService.getAllCustomer();
	}

	// Update Customer by Id
	@PutMapping("/updateCustomer/{customerId}")
	public Customer updateCustomer(@PathVariable Long customerId, @RequestBody Customer updateCustomer) {
		return customerService.updateCustomer(customerId, updateCustomer);
	}

	// Delete Customer by Id
	@DeleteMapping("/deleteCustomer/{customerId}")
	public void deleteCustomer(@PathVariable Long customerId) {
		customerService.deleteCustomer(customerId);
	}

}
