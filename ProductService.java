package com.training.weekmvc.service;

import java.util.List;

import com.training.weekmvc.model.Cart;
import com.training.weekmvc.model.Product;

public interface ProductService {
public Product getProduct();
	
	public List<Product> getAllProducts();
	
	public boolean addProduct(Product product);
	
	public boolean deleteProduct(int prodId);
	public boolean updateProduct(Product product);
	
	public List<Cart> getAllCart();

}