package com.cjc.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Employee;

@Repository
public interface Homerepository extends CrudRepository<Employee, Integer>
{
	public void deleteById(int id);
}
