package com.project.groceryshop.entities;



import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;



@Entity
public class Order {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double totalAmount;
    private int productsQuantity;
    
    @ManyToOne
    Customer customer;
    
    @OneToMany
    Set<Product> productSet;
    
	public Order() {
		super();
		
	}

	public Order(Long id, double totalAmount, int productsQuantity, Customer customer, Set<Product> productSet) {
		super();
		this.id = id;
		this.totalAmount = totalAmount;
		this.productsQuantity = productsQuantity;
		this.customer = customer;
		this.productSet = productSet;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getProductsQuantity() {
		return productsQuantity;
	}

	public void setProductsQuantity(int productsQuantity) {
		this.productsQuantity = productsQuantity;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Set<Product> getProductSet() {
		return productSet;
	}

	public void setProductSet(Set<Product> productSet) {
		this.productSet = productSet;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", totalAmount=" + totalAmount + ", productsQuantity=" + productsQuantity
				+ ", customer=" + customer + ", productSet=" + productSet + "]";
	}

	
}
