package com.cloudsolution.jpaonetomany.repository;

import com.cloudsolution.jpaonetomany.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
