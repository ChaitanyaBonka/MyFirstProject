package com.niit.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Login;
@Repository("loginDAO")
public class LoginDAOImpl implements LoginDAO
{

	@Autowired
	private SessionFactory sessionFactory;
	public LoginDAOImpl(SessionFactory sessionFactory){
		try {
			this.sessionFactory = sessionFactory;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	@Transactional
	public List<Login> list()
	{
		@SuppressWarnings("unchecked")
		List<Login> list = (List<Login>) sessionFactory.getCurrentSession().createCriteria(Login.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return list;
	}


	@Transactional
	public void saveOrUpdate(Login logindetails) 
	{
		
		//sessionFactory.getCurrentSession().saveOrUpdate(logindetails);
		Session s1=sessionFactory.openSession();
		Transaction t1=s1.beginTransaction();
		s1.saveOrUpdate(logindetails);
		t1.commit();
	}


	@Transactional
	public void save(Login logindetails)
	{
		sessionFactory.getCurrentSession().save(logindetails);			
	}
	
	@Transactional
	public void delete(int id) 
	{
		Login logindetails= new Login();
//		register.setId(id);
		sessionFactory.getCurrentSession().delete(logindetails);
	}
	
	@Transactional
	public Login get(int id) 
	{
		String hql = "from Login where id="+ "'" + id+"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Login> list = (List<Login>) query.list();
		if(list != null && !list.isEmpty() ){
			return list.get(0);
		}
		return null;
		
	}

	@Transactional
	public boolean isValidLogin(int id, String password) {
		String hql = "from Login where id='"+id+"' and " + "password='"+password+"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Login> list = (List<Login>) query.list();
		if(list != null && !list.isEmpty() ){
			return true;
		}
		return false;
	}


	


	@Transactional
	public void update(Login logindetails) 
	{
	
		sessionFactory.getCurrentSession().update(logindetails);
	}

}
