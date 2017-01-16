package com.niit.dao;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Register;

@Repository("registerDAO")
public class RegisterDAOImpl implements RegisterDAO
{
	@Autowired
	private SessionFactory sessionFactory;
	public RegisterDAOImpl(SessionFactory sessionFactory){
		try {
			this.sessionFactory = sessionFactory;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	@Transactional
	public List<Register> list() {
		@SuppressWarnings("unchecked")
		List<Register> list = (List<Register>) sessionFactory.getCurrentSession().createCriteria(Register.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return list;
	}

	@Transactional
	public void save(Register register) {
		sessionFactory.getCurrentSession().save(register);
	}
	@Transactional
	public void delete(int id) {
		Register register= new Register();
//		register.setId(id);
		sessionFactory.getCurrentSession().delete(register);
	}

	@Transactional
	public Register get(int id) {
		String hql = "from Register where id="+ "'" + id+"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Register> list = (List<Register>) query.list();
		if(list != null && !list.isEmpty() ){
			return list.get(0);
		}
		return null;
	}
	
	@Transactional
	public boolean isValidRegister(int id, String password) {
		String hql = "from Register where id='"+id+"' and " + "password='"+password+"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Register> list = (List<Register>) query.list();
		if(list != null && !list.isEmpty() ){
			return true;
		}
		return false;
	}
	
	public void update(Register register) {
		sessionFactory.getCurrentSession().update(register);
		
	}
	
	@Transactional
	public void saveOrUpdate(Register register) {
		//sessionFactory.getCurrentSession().saveOrUpdate(register);
		Session s1=sessionFactory.openSession();
		Transaction t1=s1.beginTransaction();
		s1.saveOrUpdate(register);
		t1.commit();
		
	}



}
