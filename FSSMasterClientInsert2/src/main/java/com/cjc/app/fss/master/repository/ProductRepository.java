package com.cjc.app.fss.master.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.fss.master.model.Product;


@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{
	Product findAllByproductName(String pname);

	Product findByProductId(int productId);


}
