package com.niit.jacobwatchco.dao;

import java.util.List;

import com.niit.jacobwatchco.model.Product;

public interface ProductDao {

		
		public boolean addProduct(Product product);
		public boolean updateProduct(Product product);
		public boolean deleteProduct(int productId);
		public Product getProductById(int productId);
		public List<Product> getAllProduct();
		

	}