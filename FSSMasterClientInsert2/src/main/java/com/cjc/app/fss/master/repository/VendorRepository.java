package com.cjc.app.fss.master.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.fss.master.model.Vendor;

@Repository
public interface VendorRepository extends CrudRepository<Vendor, Integer>{
	
	
	Vendor findByVendorName(String vendorName);
	Vendor findByVendorId(int vendorId);
//	List<Vendor> findAllBySpplrId(int supplierId);
}
