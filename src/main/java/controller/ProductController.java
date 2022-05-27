package controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import entity.Product;
import service.ProductService;

@RestController    //RestAPI
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/ProductByName/{name}")
	public Product findProductByName(@PathVariable String name)
	{
		return productService.getProductByName(name);
	}
	
	@GetMapping("/ProductById/{id}")
	public Optional<Product> findProductById(@PathVariable int id)
	{
		return productService.getProductById(id);
	}
	
	
}
