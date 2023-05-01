package com.gurucul.ibm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gurucul.ibm.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
