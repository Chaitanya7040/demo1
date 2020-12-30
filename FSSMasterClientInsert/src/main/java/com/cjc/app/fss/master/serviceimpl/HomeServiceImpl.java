package com.cjc.app.fss.master.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.fss.master.model.Account;
import com.cjc.app.fss.master.model.Product;
import com.cjc.app.fss.master.model.Supplier;
import com.cjc.app.fss.master.model.Vendor;
import com.cjc.app.fss.master.repository.ProductRepository;
import com.cjc.app.fss.master.repository.VendorRepository;
import com.cjc.app.fss.master.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{
	@Autowired
	ProductRepository pr;
	
	@Autowired
	VendorRepository vr;
	
	
	@Override
	public void insertdata(Product p) {
		System.out.println(p);
		pr.save(p);
		
		
	}


	@Override
	public void insertvendor(Vendor v) {
		// TODO Auto-generated method stub
		vr.save(v);
	}


	@Override
	public void insertaccount(Account ac) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void insertsupplier(Supplier s) {
		// TODO Auto-generated method stub
		
	}


	


}
