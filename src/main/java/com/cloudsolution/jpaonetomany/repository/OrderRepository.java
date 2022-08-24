package com.cloudsolution.jpaonetomany.repository;

import com.cloudsolution.jpaonetomany.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
