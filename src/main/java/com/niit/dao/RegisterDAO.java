package com.niit.dao;

import java.util.List;
import com.niit.model.Register;
public interface RegisterDAO {

	public List<Register> list();
	public Register get(int id);
	public void saveOrUpdate(Register register);
	public void save(Register register);
	public void update(Register register);
	public void delete(int id);
	
}
