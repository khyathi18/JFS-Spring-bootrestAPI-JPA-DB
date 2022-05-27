package service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Product;
import repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

public Product getProductByName(String name) {
		
		return productRepository.findByName(name);
	}
	
	public Optional<Product> getProductById(int id) {
		
		return productRepository.findById(id);
	}
	
}
