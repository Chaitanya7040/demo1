package com.cjc.app.fss.master.serviceimpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.fss.master.model.Account;
import com.cjc.app.fss.master.model.Gst;
import com.cjc.app.fss.master.model.Labour;
import com.cjc.app.fss.master.model.Product;
import com.cjc.app.fss.master.model.Supplier;
import com.cjc.app.fss.master.model.Vendor;
import com.cjc.app.fss.master.repository.AccountRepository;
import com.cjc.app.fss.master.repository.GstRepository;
import com.cjc.app.fss.master.repository.LabourRepository;
import com.cjc.app.fss.master.repository.ProductRepository;
import com.cjc.app.fss.master.repository.SupplierRepository;
import com.cjc.app.fss.master.repository.VendorRepository;
import com.cjc.app.fss.master.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{
	@Autowired
	ProductRepository pr;
	
	@Autowired
	VendorRepository vr;
	
	@Autowired
	SupplierRepository sr;
	
	@Autowired
	LabourRepository lr;
	
	@Autowired
	AccountRepository ar;
	
	@Autowired
	GstRepository gr;
	
	
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
		ar.save(ac);
	}


	@Override
	public void insertlabour(Labour l, int gstPercent) {
		// TODO Auto-generated method stub
		Gst gst=gr.findByGstPercent(gstPercent);
		l.setGst(gst);
		lr.save(l);
		
	}
	


//	@Override
//	public void insertsupplier(Supplier s,int vendorId) {
//		// TODO Auto-generated method stub
//	
//			Vendor vendor=vr.findByVendorId(vendorId);
//
//			s.getVendor().add(vendor);
//
//		sr.save(s);
//	}
	@Override
	public void insertsupplier(Supplier s) {
		// TODO Auto-generated method stub
	
//			Vendor vendor=vr.findByVendorId(vendorId);
//
//			s.getVendor().add(vendor);

		sr.save(s);
	}


	@Override
	public void insertgst(Gst gst) {
		// TODO Auto-generated method stub
		gr.save(gst);
		
		}


//	@Override
//	public void insertproduct(Product product, int gstPercent, int vendorId, int supplierId) {
//		// TODO Auto-generated method stub
//		System.out.println("***********************************************************************************");
//		System.out.println(gstPercent+vendorId+supplierId);
//		System.out.println("%%%%"+supplierId);
//		System.out.println(product.getProductName());
//		
//		Gst gst=gr.findByGstPercent(gstPercent);
//		product.setGst(gst);
//		
//		
//		
//		
//		
////		Vendor vendor=vr.findByVendorId(vendorId);
////		product.getVendor().add(vendor);
//		
//		Vendor vendor=vr.findByVendorId(vendorId);
//		System.out.println(vendor);
//		System.out.println("******************************************************");
//		System.out.println(vendor.getVendorName());
//		product.getVendor().add(vendor);
//		
//		
//		Supplier supplier=sr.findBySupplierId(supplierId);
//		System.out.println(supplier);
//		System.out.println(supplier.getSupplierName());
//		product.getSupplier().add(supplier);
//		
//		
//		pr.save(product);
//		
//		
//		
//	}
	
	
	
	@Override
	public void insertproduct(Product product) {
		// TODO Auto-generated method stub
		pr.save(product);
		
	}



	@Override
	public List<Gst> getallgst() {
		// TODO Auto-generated method stub
		List<Gst>lgst =(List<Gst>) gr.findAll();
		
		return lgst;
	}


	@Override
	public List<Account> getallaccount() {
		// TODO Auto-generated method stub
		List<Account> lac=(List<Account>) ar.findAll();
		return lac;
	}


	


	@Override
	public List<Labour> getalllabour() {
		// TODO Auto-generated method stub
		List<Labour>llab=(List<Labour>) lr.findAll();
		return llab;
	}


	@Override
	public List<Vendor> getallvendor() {
		// TODO Auto-generated method stub
		List<Vendor>lvendor=(List<Vendor>) vr.findAll();
		return lvendor;
	}


	@Override
	public List<Supplier> getallsupplier() {
		// TODO Auto-generated method stub
		List<Supplier>lsupplier=(List<Supplier>) sr.findAll();
		return lsupplier;
	}


	@Override
	public List<Product> getallproduct() {
		// TODO Auto-generated method stub
		List<Product> lproduct=(List<Product>) pr.findAll();
		return lproduct;
	}


	@Override
	public void deletegst(int gstId) {
		// TODO Auto-generated method stub
		gr.deleteById(gstId);
	}


	@Override
	public void deletelabour(int labourId) {
		// TODO Auto-generated method stub
		lr.deleteById(labourId);
	}


	@Override
	public void deleteaccount(int accountId) {
		// TODO Auto-generated method stub
		ar.deleteById(accountId);
	}


	@Override
	public void deleteproduct(int productId) {
		// TODO Auto-generated method stub
		pr.deleteById(productId);
	}


	@Override
	public void deletevendor(int vendorId) {
		// TODO Auto-generated method stub
		vr.deleteById(vendorId);
	}


	@Override
	public void deletesupplier(int supplierId) {
		// TODO Auto-generated method stub
		sr.deleteById(supplierId);
	}

	
	
	//  update

	@Override
	public void updategst(Gst gst) {
		// TODO Auto-generated method stub
		gr.save(gst);
	}


	@Override
	public void updatelabour(Labour labour) {
		// TODO Auto-generated method stub
		lr.save(labour);
		
	}


	


	@Override
	public void updateaccount(Account account) {
		// TODO Auto-generated method stub
		ar.save(account);
		
	}


	@Override
	public void updatevendor(Vendor vendor) {
		// TODO Auto-generated method stub
		vr.save(vendor);
	}


	@Override
	public void updatesupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		sr.save(supplier);
	}


	@Override
	public void updateproduct(Product product) {
		// TODO Auto-generated method stub
		pr.save(product);
	}
	
	
	
	// get

	@Override
	public Optional<Gst> getgst(int gstId) {
		// TODO Auto-generated method stub
		Optional<Gst> gst=gr.findById(gstId);
		return gst;
	}

			
	@Override
	public Optional<Labour> getlabour(int labourId) {
		// TODO Auto-generated method stub
		Optional<Labour>l=lr.findById(labourId);
		return l;
	}

//	 getallById
	
	
	@Override
	public List<String> getallvendorbysupplierid(int supplierId) {
		// TODO Auto-generated method stub
		Supplier ls=sr.findBySupplierId(supplierId);
		List<String> venlist=new ArrayList<String>();
		for (Vendor ven : ls.getVendor()) {
			venlist.add(ven.getVendorName());
		}
		return venlist;
	}


	@Override
	public List<String> getallvendorbyproductid(int productId) {
		// TODO Auto-generated method stub
		Product p=pr.findByProductId(productId);
		List<String> vlist=new ArrayList<String>();
		for(Vendor ven : p.getVendor()) {
			vlist.add(ven.getVendorName());
		}
		
		return vlist;
	}


	@Override
	public List<String> getallsupplierbyproductid(int productId) {
		// TODO Auto-generated method stub
		Product p=pr.findByProductId(productId);
		List<String> slist=new ArrayList<String>();
		for(Supplier sup : p.getSupplier()) {
			slist.add(sup.getSupplierName());
		}
		return slist;
	}


	

	

	


}
