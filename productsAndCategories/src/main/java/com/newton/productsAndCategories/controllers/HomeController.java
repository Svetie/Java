package com.newton.productsAndCategories.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.newton.productsAndCategories.models.Category;
import com.newton.productsAndCategories.models.Product;
import com.newton.productsAndCategories.services.AppService;

@Controller
public class HomeController {
	
	private final AppService appService;
	
	public HomeController(AppService appService) {
		this.appService = appService;
	}
	
	@RequestMapping("/products/new")
	public String newProduct(@ModelAttribute("product") Product product) {
		
		return "newProduct.jsp";
	}
	
	@PostMapping("/products/create")
	public String createAProduct(@Valid @ModelAttribute("product") Product product,
			BindingResult result, RedirectAttributes redirectAttributes) {
		if(result.hasErrors()) {
			redirectAttributes.addFlashAttribute("error", "Failed saving a product");
			return "newProduct.jsp";
		} else {
			this.appService.createProduct(product);
			redirectAttributes.addFlashAttribute("success", "Product saved!");
			return "redirect:/products/new";
		}
	}
	
	@RequestMapping("/categories/new")
	public String newCategory(@ModelAttribute("category") Category category) {
		
		return "newCategory.jsp";
	}
	
	@PostMapping("/categories/create") 
	public String createCategory(@Valid @ModelAttribute("category") Category category,
			BindingResult result, RedirectAttributes redirectAttributes) {
		if(result.hasErrors()) {
			redirectAttributes.addFlashAttribute("error", "Failed saving a category");
			return "newCategory.jsp";
		} else {
			this.appService.createCategory(category);
			redirectAttributes.addFlashAttribute("success", "Category saved!");
			return "redirect:/categories/new";
		}
	}
	
	@GetMapping("/products/{id}")
	public String showAProduct(@PathVariable("id") Long productId, Model model) {
		// product
		Product product = this.appService.getProduct(productId);
		model.addAttribute("product", product);
		
		// list of categories
		List<Category> allCategories = this.appService.getAllCategories();
		model.addAttribute("allCategories", allCategories);
		return "showProduct.jsp";
	}
	
	@PostMapping("/addCategory/{id}")
	public String addACategoryToProduct(@PathVariable("id") Long productId,
			@RequestParam("categoryId") Long categoryId) {
		Category category = this.appService.getCategory(categoryId);
		Product product = this.appService.getProduct(productId);
		
		List<Category> allCategories = product.getCategories();
		
		allCategories.add(category);
		
		this.appService.updateProduct(product);
		
		return "redirect:/products/" + productId;
	}
	
	
	@GetMapping("/categories/{id}")
	public String showACategory(@PathVariable("id") Long categoryId, Model model) {
		Category category = this.appService.getCategory(categoryId);
		model.addAttribute("category", category);
		
		List<Product> allProducts = this.appService.getAllProducts();
		model.addAttribute("allProducts", allProducts);
		return "showCategory.jsp";
	}
	
	@PostMapping("/addProduct/{id}")
	public String addProductToCategory(@PathVariable("id") Long categoryId,
			@RequestParam("productId") Long productId) {
		Category category = this.appService.getCategory(categoryId);
		Product product = this.appService.getProduct(productId);
		
		List<Product> allProducts = category.getProducts();
		allProducts.add(product);
		
		this.appService.updateCategory(category);
		return "redirect:/categories/" + categoryId;
	}

}
