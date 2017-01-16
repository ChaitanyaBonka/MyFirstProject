package com.niit.dao;

import java.util.List;
import com.niit.model.Login;
public interface LoginDAO {

	public List<Login> list();
	public Login get(int id);
	public void save(Login logindetails);
	public void update(Login logindetails);
	public void delete(int id);
	public void saveOrUpdate(Login logindetails);
	
}
