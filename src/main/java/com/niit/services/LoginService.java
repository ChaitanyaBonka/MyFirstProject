package com.niit.services;

import java.util.List;

import com.niit.model.Login;

public interface LoginService {

	public List<Login> list();
	public Login get(int id);
	public void save(Login logindetails);
	public void update(Login logindetails);
	public void delete(int id);
	public void saveOrUpdate(Login logindetails);
}
