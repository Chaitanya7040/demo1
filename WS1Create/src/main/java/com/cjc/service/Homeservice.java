package com.cjc.service;


import java.util.Optional;

import com.cjc.model.Employee;

public interface Homeservice 
{
	public void savedata(Employee e);

	public Iterable<Employee> loginGetData();

	public void updatedata(Employee e);

	public void deletedata(int id);
}
