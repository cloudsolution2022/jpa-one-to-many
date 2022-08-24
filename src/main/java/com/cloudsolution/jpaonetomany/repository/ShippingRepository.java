package com.cloudsolution.jpaonetomany.repository;

import com.cloudsolution.jpaonetomany.entity.ShippingAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShippingRepository extends JpaRepository<ShippingAddress,Integer> {
}
