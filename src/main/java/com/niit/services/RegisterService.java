package com.niit.services;

import java.util.List;

import com.niit.model.Register;

public interface RegisterService {

	public List<Register> list();
	public Register get(int id);
	public void saveOrUpdate(Register register);
	public void save(Register register);
	public void update(Register register);
	public void delete(int id);
}
