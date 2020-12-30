package com.cjc.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Employee;
import com.cjc.service.Homeservice;

@CrossOrigin("*")
@RestController
public class HomeController 
{
	@Autowired
	Homeservice ser;
	 
	 @RequestMapping(value = "/reg",method = RequestMethod.POST)
	 public Employee saveData(@RequestBody Employee e)
	 {
		 System.out.println("save info to db");
		 ser.savedata(e);
		return e;		 
	 }
	 
	 @RequestMapping(value = "/getdata",method = RequestMethod.GET)
	 public Iterable<Employee> getData()
	 {
		 System.out.println("get info from db");
		 Iterable<Employee> e=ser.loginGetData();
		return e;		 
	 }
	
	 @RequestMapping(value = "/update/{id}",method = RequestMethod.PUT)
	 public Employee updateData(@RequestBody Employee e)
	 {
		 System.out.println("update record of db");
		ser.updatedata(e);
		return e;
	 }
	 
	 @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
	 public String deleteData(@PathVariable("id")int id)
	 {
		 System.out.println("delete record from db");
		ser.deletedata(id);
		return "data deleted successfully";
		 
	 }
	 
	 
}
