package com.niit.services;

import java.util.List;

import com.niit.model.Supplier;

public interface SupplierService {

public List<Supplier> list();
	
	public Supplier get(int id);
	
	public List getAllSuppliers();
	
	public Supplier getSingleSupplier(int id);
	
	public void update(Supplier supplier);
	
	public void saveOrUpdate(Supplier supplier);
	
	public void delete(int id);
}
