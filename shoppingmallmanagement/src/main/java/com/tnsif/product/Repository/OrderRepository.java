package com.tnsif.product.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.product.Entity.Order;

public interface OrderRepository extends  JpaRepository<Order,Long> {
	
	
}
