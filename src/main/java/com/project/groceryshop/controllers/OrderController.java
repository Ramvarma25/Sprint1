package com.project.groceryshop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.groceryshop.dao.OrderDao;
import com.project.groceryshop.entities.Order;

@RestController
public class OrderController {

	@Autowired
	OrderDao orderDao;

	// To add order
	@PostMapping("/createOrder")
	public String createOrder(@RequestBody Order order) {
		return orderDao.save(order).toString();
	}

	// Get order by Id
	@GetMapping("/getOrder/{orderId}")
	public String getOrder(@PathVariable Long orderId) {
		return orderDao.findById(orderId).get().toString();
	}

	// Get all orders
	@GetMapping("/getAllOrder")
	public Iterable<Order> getAllOrder(){
		return orderDao.findAll();
	}

	// Update order by Id
	@PutMapping("/updateOrder/{orderId}")
	public Order updateorder(@PathVariable Long orderId, @RequestBody Order updateOrder) {
		Order orderToUpdate = orderDao.findById(orderId).get();
		orderToUpdate.setTotalAmount(updateOrder.getTotalAmount());
		orderToUpdate.setProductsQuantity(updateOrder.getProductsQuantity());
		return orderDao.save(orderToUpdate);
	}

	// Delete order by Id
	@DeleteMapping("/deleteOrder/{orderId}")
	public void deleteOrder(@PathVariable Long orderId) {
		orderDao.deleteById(orderId);
	}
}
