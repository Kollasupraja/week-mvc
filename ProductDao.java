package com.training.weekmvc.dao;

import java.util.List;

import com.training.weekmvc.model.Cart;
import com.training.weekmvc.model.Product;

public interface ProductDao {
	Product getProductById(int id);
	List<Product> getProducts();
	boolean createProduct(Product product);
		
		boolean deleteProduct(int prodId);
		boolean updateProduct(Product product);
		List<Cart> getCart();
}