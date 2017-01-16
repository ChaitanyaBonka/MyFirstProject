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

import com.niit.dao.SupplierDAO;
import com.niit.model.Supplier;
@Service
public class SupplierServiceImpl implements SupplierService{
	
	public List<Supplier> list1() {
		return null;
	}

	@Autowired
	SupplierDAO sdao;

	@Transactional
	public void saveOrUpdate(Supplier supplier) {
		sdao.saveOrUpdate(supplier);
	}

	@Transactional
	public void delete(int id) {
		sdao.delete(id);
	}

	@Transactional
	public List<Supplier> listSupplier() {
		return sdao.list();
	}

	@Transactional
	public Supplier get(int id) {
		return sdao.get(id);
	}

	@Transactional
	public List getAllSuppliers() {
		return sdao.getAllSuppliers();
	}

	@Transactional
	public Supplier getSingleSupplier(int id) {
		return sdao.getSingleSupplier(id);
	}

	@Transactional
	public List<Supplier> list() {
		return sdao.list();
	}

	@Transactional
	public void update(Supplier supplier) {
		sdao.update(supplier);
	}

}
