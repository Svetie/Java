package com.newton.productsAndCategories.services;

import java.util.List;

import org.springframework.stereotype.Service;
import com.newton.productsAndCategories.models.Category;
import com.newton.productsAndCategories.models.Product;
import com.newton.productsAndCategories.repositories.CategoryRepository;
import com.newton.productsAndCategories.repositories.ProductRepository;

@Service
public class AppService {
	private final CategoryRepository categoryRepo;
	private final ProductRepository productRepo;
	
	public AppService(CategoryRepository categoryRepo, ProductRepository productRepo) {
		this.categoryRepo = categoryRepo;
		this.productRepo = productRepo;
	}
	
	public Product createProduct(Product product) {
		return this.productRepo.save(product);
	}
	
	public Category createCategory(Category category) {
		return this.categoryRepo.save(category);
	}
	
	public Product getProduct(Long id) {
		return this.productRepo.findById(id).orElse(null);
	}
	
	public Category getCategory(Long id) {
		return this.categoryRepo.findById(id).orElse(null);
	}
	
	public List<Product> getAllProducts(){
		return this.productRepo.findAll();
	}
	
	public List<Category> getAllCategories(){
		return this.categoryRepo.findAll();
	}
	
	public void updateProduct(Product product) {
		this.productRepo.save(product);
	}
	
	public void updateCategory(Category category) {
		this.categoryRepo.save(category);
	}
}
