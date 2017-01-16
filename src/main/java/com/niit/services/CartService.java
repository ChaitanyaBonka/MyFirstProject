package com.niit.services;

import java.util.List;

import com.niit.model.CartItem;
public interface CartService 
{
	public void add(CartItem cartItem);
	public CartItem get(int id);
	public List getAllItems();
	public void remove(int id);
	public void removeAll();
	public void update(int cartItemId,int quantity);
	
}
