package com.cjc.app.fss.master.service;

import com.cjc.app.fss.master.model.Account;
import com.cjc.app.fss.master.model.Product;
import com.cjc.app.fss.master.model.Supplier;
import com.cjc.app.fss.master.model.Vendor;

public interface HomeService {
	
	public void insertdata(Product p);
	public void insertvendor(Vendor v);
	public void insertaccount(Account ac);
	public void insertsupplier(Supplier s);
}
