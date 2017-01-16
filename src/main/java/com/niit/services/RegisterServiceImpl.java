package com.niit.services;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.RegisterDAO;
import com.niit.model.Register;
@Service
public class RegisterServiceImpl implements RegisterService{

	@Autowired
	RegisterDAO rdao;
	
	
	
	
	@Transactional
	public List<Register> list() {
		return rdao.list();
	}

	@Transactional
	public void save(Register register) {
		 rdao.save(register);
	}
	@Transactional
	public void delete(int id) {
		rdao.delete(id);
	}

	@Transactional
	public Register get(int id) {
		return rdao.get(id);
	}
	
	/*@Transactional
	public boolean isValidRegister(int id, String password) {
		return false;
	}*/
	
	public void update(Register register) {
	
		rdao.update(register);
	}
	
	@Transactional
	public void saveOrUpdate(Register register) {
		
		rdao.saveOrUpdate(register);
	}


}
