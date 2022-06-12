package com.org.gateway.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@GetMapping("/categories")
	public String getCategories() {
		return "Public Categories";
	}

}
