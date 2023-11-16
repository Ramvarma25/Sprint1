package com.project.groceryshop.services;

import com.project.groceryshop.dao.ProductDao;
import com.project.groceryshop.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	private ProductDao productDao;

	public String createProduct(Product product) {
		return productDao.save(product).toString();
	}

	public String getProduct(Long productId) {
		return productDao.findById(productId).orElse(null).toString();
	}

	public Iterable<Product> getAllProduct() {
		return productDao.findAll();
	}

	public Product updateProduct(Long productId, Product updateProduct) {
		Product productToUpdate = productDao.findById(productId).orElse(null);

		if (productToUpdate != null) {
			productToUpdate.setName(updateProduct.getName());
			productToUpdate.setPrice(updateProduct.getPrice());
			productToUpdate.setStockQuantity(updateProduct.getStockQuantity());
			productToUpdate.setDescription(updateProduct.getDescription());
			return productDao.save(productToUpdate);
		} else {
			return null; 
		}
	}

	public void deleteProduct(Long productId) {
		productDao.deleteById(productId);
	}
}
