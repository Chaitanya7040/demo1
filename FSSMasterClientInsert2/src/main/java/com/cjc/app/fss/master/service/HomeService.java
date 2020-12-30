package com.cjc.app.fss.master.service;

import java.util.List;
import java.util.Optional;

import com.cjc.app.fss.master.model.Account;
import com.cjc.app.fss.master.model.Gst;
import com.cjc.app.fss.master.model.Labour;
import com.cjc.app.fss.master.model.Product;
import com.cjc.app.fss.master.model.Supplier;
import com.cjc.app.fss.master.model.Vendor;

public interface HomeService {
	
	public void insertdata(Product p);
	public void insertvendor(Vendor v);
	public void insertaccount(Account ac);
	
	//public void insertsupplier(Supplier s,int vendorId);
	public void insertsupplier(Supplier s);
	
	public void insertgst(Gst gst);
	
//	public void insertproduct(Product product, int gstPercent, int vendorId, int supplierId);
	public void insertproduct(Product product);
	
	public List<Gst> getallgst();
	public List<Account> getallaccount();
	public void insertlabour(Labour l, int gstPercent);
	public List<Labour> getalllabour();
	public List<Vendor> getallvendor();
	public List<Supplier> getallsupplier();
	public List<Product> getallproduct();
	public void deletegst(int gstId);
	public void deletelabour(int labourId);
	public void deleteaccount(int accountId);
	public void deleteproduct(int productId);
	public void deletevendor(int vendorId);
	public void deletesupplier(int supplierId);
	public void updategst(Gst gst);
	public void updatelabour(Labour labour);
	public Optional<Gst> getgst(int gstId);
	public Optional<Labour> getlabour(int labourId);
	public void updateaccount(Account account);
	public void updatevendor(Vendor vendor);
	public void updatesupplier(Supplier supplier);
	public void updateproduct(Product product);
	public List<String> getallvendorbysupplierid(int supplierId);
	public List<String> getallvendorbyproductid(int productId);
	public List<String> getallsupplierbyproductid(int productId);

}
