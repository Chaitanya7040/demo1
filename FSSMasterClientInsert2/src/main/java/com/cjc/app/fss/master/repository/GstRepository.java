package com.cjc.app.fss.master.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.fss.master.model.Gst;
@Repository
public interface GstRepository extends CrudRepository<Gst, Integer>{

	Gst findByGstPercent(int gstPercent);
	

	
	

}
