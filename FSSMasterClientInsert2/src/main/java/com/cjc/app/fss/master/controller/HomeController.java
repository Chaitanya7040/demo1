package com.cjc.app.fss.master.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.fss.master.model.Account;
import com.cjc.app.fss.master.model.Gst;
import com.cjc.app.fss.master.model.Labour;
import com.cjc.app.fss.master.model.Product;
import com.cjc.app.fss.master.model.Supplier;
import com.cjc.app.fss.master.model.Vendor;
import com.cjc.app.fss.master.service.HomeService;
@CrossOrigin("*")
@RestController
public class HomeController {
	
	@Autowired
	HomeService hs;
	
	@RequestMapping("/")
	public String m1() {
		
		return "insert";
	}
	@PostMapping("/adddata")
	public void insertProduct(@RequestBody  Product p) {
		
		hs.insertdata(p);
		
	}
	
	@PostMapping("/addVendor")
	public void insertVendor(@RequestBody  Vendor v) {
	
		hs.insertvendor(v);
		
	}
	@PostMapping("/addAccount")
	public void insertAccount(@RequestBody  Account ac) {
	
		hs.insertaccount(ac);
		
	}
	
//	@PostMapping("/addSupplier/{vendorId}")
//	public void insertSupplier(@RequestBody  Supplier s,@PathVariable ("vendorId") int vendorId) {
//		System.out.println(vendorId);
//		hs.insertsupplier(s,vendorId);
//		
//	}
	
	@PostMapping("/addSupplier")
	public void insertSupplier(@RequestBody  Supplier s) {
	
		hs.insertsupplier(s);
		
	}
	@PostMapping("/addGst")
	public void insertgst(@RequestBody Gst gst) {
		hs.insertgst(gst);
	}
	
	
//	@PostMapping("/addProduct/{gstPercent}/{vendorId}/{supplierId}")
//	public void insertproduct(@RequestBody Product product,@PathVariable("gstPercent")int gstPercent,@PathVariable("vendorId")int vendorId,@PathVariable("supplierId")int supplierId) {
//		
//	hs.insertproduct(product,gstPercent,vendorId,supplierId);
//	}
	
	
	@PostMapping("/addProduct")
	public void insertproduct(@RequestBody Product product) {
		
	hs.insertproduct(product);
	}
	
	@PostMapping("/addLabour/{gstPercent}")
	public void insertlabour(@RequestBody  Labour l,@PathVariable ("gstPercent") int gstPercent) {
		
		hs.insertlabour(l,gstPercent);
		
	}
	
	
	
				//getALL
	
	@GetMapping("/getAllGst")
	public List<Gst> getallgst() {
		
	List<Gst> lgst	=hs.getallgst();
		return lgst;
	}
	
	
	@GetMapping("/getAllAccount")
	public List<Account> getallaccount() {
		
	List<Account> lac	=hs.getallaccount();
		return lac;
	}


	@GetMapping("/getAllLabour")
	public List<Labour> getalllabour() {
		
	List<Labour> llab	=hs.getalllabour();
		return llab;
	}
	
	@GetMapping("/getAllVendor")
	public List<Vendor> getallvendor() {
		
	List<Vendor> lvendor	=hs.getallvendor();
		return lvendor;
	}
	
	@GetMapping("/getAllSupplier")
	public List<Supplier> getallsupplier() {
		
	List<Supplier> lsupplier	=hs.getallsupplier();
		return lsupplier;
	}
	
	@GetMapping("/getAllProduct")
	public List<Product> getallproduct() {
		
	List<Product> lproduct	=hs.getallproduct();
		return lproduct;
	}
	
			
		//		Delete
	
	@DeleteMapping("/deleteGst/{gstId}")
	public void deletegst(@PathVariable("gstId")int gstId) {
		hs.deletegst(gstId);
	}
	
	@DeleteMapping("/deleteLabour/{labourId}")
	public void deletelabour(@PathVariable("labourId")int labourId) {
		hs.deletelabour(labourId);
	}
	@DeleteMapping("/deleteAccount/{accountId}")
	public void deleteaccount(@PathVariable("accountId")int accountId) {
		hs.deleteaccount(accountId);
	}
	
	@DeleteMapping("/deleteProduct/{productId}")
	public void deleteproduct(@PathVariable("productId")int productId) {
		hs.deleteproduct(productId);
	}
	@DeleteMapping("/deleteVendor/{vendorId}")
	public void deletevendor(@PathVariable("vendorId")int vendorId) {
		hs.deletevendor(vendorId);
	}
	
	@DeleteMapping("/deleteSupplier/{supplierId}")
	public void deletesupplier(@PathVariable("supplierId")int supplierId) {
		hs.deletesupplier(supplierId);
	}


	
	//		put
	
	@PutMapping("/updateGst")
	public void updategst(@RequestBody Gst gst) {
		hs.updategst(gst);
		
	}
	@PutMapping("/updateLabour")
	public void updatelabour(@RequestBody Labour labour) {
		hs.updatelabour(labour);
		
	}
	@PutMapping("/updateAccount")
	public void updateaccount(@RequestBody Account account) {
		hs.updateaccount(account);
		
	}
	@PutMapping("/updateVendor")
	public void updatevendor(@RequestBody Vendor vendor) {
		hs.updatevendor(vendor);
		
	}
	@PutMapping("/updateSupplier")
	public void updatesupplier(@RequestBody Supplier supplier) {
		hs.updatesupplier(supplier);
		
	}
	@PutMapping("/updateProduct")
	public void updateproduct(@RequestBody Product product) {
		hs.updateproduct(product);
		
	}
	
	
	//     get
	@GetMapping("/getGst/{gstId}")
	public Optional<Gst> getgst(@PathVariable ("gstId")int gstId) {
		return hs.getgst(gstId);
		
	}
	@GetMapping("/getLabour/{labourId}")
	public Optional<Labour> getlabour(@PathVariable ("labourId")int labourId) {
		return hs.getlabour(labourId);
		
	}
	
	//	getAllById
	
	
	@GetMapping("/getAllVendorBySupplierId/{supplierId}")
	public List<String> getallvendorbysupplierid(@PathVariable("supplierId") int supplierId){
		return hs.getallvendorbysupplierid(supplierId);
		
	}
	@GetMapping("/getAllVendorByProductId/{productId}")
	public List<String> getallvendorbyproductid(@PathVariable("productId") int productId){
		return hs.getallvendorbyproductid(productId);
		
	}
	@GetMapping("/getAllSupplierByProductId/{productId}")
	public List<String> getallsupplierbyproductid(@PathVariable("productId") int productId){
		return hs.getallsupplierbyproductid(productId);
		
	}
	

}


