package com.gurucul.ibm.service;

import java.util.Optional;

import com.gurucul.ibm.model.Product;

public interface ProductService {

	public Product saveProduct(Product product);
	public Optional<Product> getProductById(int id);

}
