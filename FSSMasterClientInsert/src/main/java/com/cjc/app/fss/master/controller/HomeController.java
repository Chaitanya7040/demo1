package com.cjc.app.fss.master.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.fss.master.model.Account;
import com.cjc.app.fss.master.model.Product;
import com.cjc.app.fss.master.model.Supplier;
import com.cjc.app.fss.master.model.Vendor;
import com.cjc.app.fss.master.service.HomeService;

@RestController
public class HomeController {
	
	@Autowired
	HomeService hs;
	
	@RequestMapping("/")
	public String m1() {
		
		return "insert";
	}
	@PostMapping("/insertdata")
	public void insertProduct(@RequestBody  Product p) {
		
		hs.insertdata(p);
		
	}
	
	@PostMapping("/insertVendor")
	public void insertVendor(@RequestBody  Vendor v) {
	
		hs.insertvendor(v);
		
	}
	@PostMapping("/insertAccount")
	public void insertAccount(@RequestBody  Account ac) {
	
		hs.insertaccount(ac);
		
	}
	
	@PostMapping("/insertSupplier")
	public void insertSupplier(@RequestBody  Supplier s) {
		
		hs.insertsupplier(s);
		
	}

}
