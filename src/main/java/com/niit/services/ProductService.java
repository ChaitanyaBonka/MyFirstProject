package com.niit.services;

import java.util.List;

import com.niit.model.Product;

public interface ProductService {

	public List<Product> list();
	
	public Product get(int id);
	
	public void saveOrUpdate(Product product);
	
	public void delete(int id);
	
	public List getAllProducts();
	
	public Product getSingleProduct(int id);
	
	public int updateProduct(Product product);
}
