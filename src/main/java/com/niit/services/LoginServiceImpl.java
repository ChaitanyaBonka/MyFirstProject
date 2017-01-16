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

import com.niit.dao.LoginDAO;
import com.niit.model.Login;

@Service

public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginDAO dao;
	
	
	@Transactional
	public List<Login> list()
	{
		return dao.list();
	}


	@Transactional
	public void saveOrUpdate(Login logindetails) 
	{
		 dao.saveOrUpdate(logindetails);
	}


	@Transactional
	public void save(Login logindetails)
	{
			dao.save(logindetails);
	}
	
	@Transactional
	public void delete(int id) 
	{
		dao.delete(id);
	}
	
	@Transactional
	public Login get(int id) 
	{
		return dao.get(id);
		
	}

/*	@Transactional
	public boolean isValidLogin(int id, String password)
	{
		return false;
	}
*/

	


	@Transactional
	public void update(Login logindetails) 
	{
		dao.update(logindetails);
	}
}
