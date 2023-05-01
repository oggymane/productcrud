package com.gurucul.ibm.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import com.gurucul.ibm.model.Product;
import com.gurucul.ibm.repository.ProductRepository;
import com.gurucul.ibm.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepo;

	@Override
	public Product saveProduct(Product product) {
		Product savedProduct = productRepo.save(product);
		return savedProduct;
	}

	@Override
	public Optional<Product> getProductById(int id) {
		
		return productRepo.findById(id);
	}

}
