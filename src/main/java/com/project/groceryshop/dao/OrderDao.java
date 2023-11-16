package com.project.groceryshop.dao;

import org.springframework.data.repository.CrudRepository;

import com.project.groceryshop.entities.Order;

public interface OrderDao extends CrudRepository<Order, Long> {

}
