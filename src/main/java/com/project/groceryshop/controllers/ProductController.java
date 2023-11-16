package com.project.groceryshop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.project.groceryshop.entities.Product;
import com.project.groceryshop.services.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;


	// To add Product
	@PostMapping("/createProduct")
	public String createProduct(@RequestBody Product product) {
		return productService.createProduct(product);
	}

	// Get Product by Id
	@GetMapping("/getProduct/{productId}")
	public String getProduct(@PathVariable Long productId) {
		return productService.getProduct(productId);
	}

	// Get all Product
	@GetMapping("/getAllProduct")
	public Iterable<Product> getAllProduct(){
		return productService.getAllProduct();
	}

	// Update Product by Id
	@PutMapping("/updateProduct/{productId}")
	public Product updateProduct(@PathVariable Long productId, @RequestBody Product updateProduct) {
		return productService.updateProduct(productId, updateProduct);
	}

	// Delete Product by Id
	@DeleteMapping("/deleteProduct/{productId}")
	public void deleteProduct(@PathVariable Long productId) {
		productService.deleteProduct(productId);
	}
}
