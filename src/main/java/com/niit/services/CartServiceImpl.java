package com.niit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.CartDAO;
import com.niit.model.CartItem;

@Service
public class CartServiceImpl implements CartService
{
	@Autowired
	CartDAO cdao;
	@Transactional
	public void add(CartItem cartItem) 
	{
		cdao.add(cartItem);
	}

	@Transactional
	public CartItem get(int id) {
				return cdao.get(id);
	}

	@Transactional
	public List getAllItems()
	{
        return cdao.getAllItems();
	
	}
	@Transactional
	public void remove(int id)
	{
		cdao.remove(id);
				
	}
	@Transactional
	public void removeAll() 
	{
		cdao.removeAll();
	}
	@Transactional
	public void update(int cartItemId,int quantity) 
	{
		cdao.update(cartItemId, quantity);
	}
	
	
	


}