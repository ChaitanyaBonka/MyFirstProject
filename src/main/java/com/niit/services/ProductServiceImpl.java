package com.niit.services;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.ProductDAO;
import com.niit.model.Product;
@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductDAO pdao;

	@Transactional
	public void saveOrUpdate(Product product) {
			pdao.saveOrUpdate(product);
	}

	@Transactional
	public void delete(int id) {
		pdao.delete(id);
	}

	@Transactional
	public List<Product> list() {
		return pdao.list();
	}

	@Transactional
	public Product get(int id) {
		return pdao.get(id);
	}

	@Transactional
	public List getAllProducts() {
		   return pdao.getAllProducts();
		}


	/*@Transactional
	public int deleteProduct(int id) {
			return pdao.delete(id);
	}*/
	
	@Transactional
	public Product getSingleProduct(int id) {
			return pdao.getSingleProduct(id);
		}
	
	@Transactional
	public int updateProduct(Product product) {
			return pdao.updateProduct(product);
		}

}
