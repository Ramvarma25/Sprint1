package com.project.groceryshop.dao;

import org.springframework.data.repository.CrudRepository;

import com.project.groceryshop.entities.Product;

public interface ProductDao  extends CrudRepository<Product, Long>{
	
}
