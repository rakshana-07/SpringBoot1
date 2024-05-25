package com.tnsif.product.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.product.Entity.Order;
import com.tnsif.product.Repository.OrderRepository;





@RestController
public class OrderController {
		
	@Autowired
   OrderRepository repo;
	
@PostMapping("/order")
	public Order addOrder(@RequestBody Order o)
	{
	 
	return repo.save(o);
		
	}
@GetMapping("/order")
    public List<Order> getOrders()
    { 
    	return repo.findAll();
    }
@GetMapping("/order/{id}")
    public Order getOrderId(@PathVariable  Long id)
    {
    	return repo.findById(id).get();
    	}
@DeleteMapping("/order/{id}")
public void deleteOrder(@PathVariable  Long id)
{
	repo.deleteById(id);
}
@PutMapping("/order/{id}")
public Order updateOrder(@PathVariable  Long id,@RequestBody Order o)
{
    o.setId(id);
    return repo.save(o);
}
    
}