package com.niit.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.CartItem;

@Repository("cartDAO")
public class CartDAOImpl implements CartDAO
{
	@Autowired
	private SessionFactory sf;
	public void setSessionFactory(SessionFactory sf) {
		this.sf = sf;
	}
	@Transactional
	public void add(CartItem cartItem) 
	{
		//Session session = sessionFactory.getCurrentSession();
		//session.saveOrUpdate(item);
		Session session=sf.openSession();
		org.hibernate.Transaction tx=session.beginTransaction();
		session.saveOrUpdate(cartItem);
		tx.commit();
	}

	@Transactional
	public CartItem get(int id) {
		Session session = sf.getCurrentSession();
		return session.get(CartItem.class, id);		
	}

	@Transactional
	public List getAllItems()
	{
        Session session =sf.openSession();
        List blist1 = session.createQuery("from CartItem").list();
        return blist1;
	
	}
	@Transactional
	public void remove(int id)
	{
		Session session = sf.openSession();
		org.hibernate.Transaction tx=session.beginTransaction();
		CartItem chartItem=(CartItem)session.load(CartItem.class, id);
		session.delete(chartItem);	
		tx.commit();
		session.close();
				
	}
	
	@Transactional
	public void removeAll() 
	{
		List<CartItem> cartItems = getAllItems();
		for(CartItem item: cartItems) 
		{
			remove(item.cartItemId);
		}
		
	}
	@Transactional
	public void update(int cartItemId,int quantity) 
	{
		Session session=sf.openSession();
		org.hibernate.Transaction tx=session.beginTransaction();
		CartItem cartItem=(CartItem)session.load(CartItem.class, cartItemId);
	    session.saveOrUpdate(cartItem);
		tx.commit();
	}
	
	
	


}