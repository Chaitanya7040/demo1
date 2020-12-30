package com.cjc.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Employee;
import com.cjc.repository.Homerepository;
import com.cjc.service.Homeservice;
@Service
public class Homeserviceimpl implements Homeservice
{
	@Autowired
	Homerepository hr;
	@Override
	public void savedata(Employee e) {
		// TODO Auto-generated method stub
		hr.save(e);
	}
	@Override
	public Iterable<Employee> loginGetData() {
		// TODO Auto-generated method stub
		Iterable<Employee> e=hr.findAll();
		return e;
	}
	@Override
	public void updatedata(Employee e) {
		// TODO Auto-generated method stub
		
		hr.save(e);
	}
	@Override
	public void deletedata(int id) {
		// TODO Auto-generated method stub
		hr.deleteById(id);
	}
}
