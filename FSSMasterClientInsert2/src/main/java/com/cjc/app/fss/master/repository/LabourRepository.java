package com.cjc.app.fss.master.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.fss.master.model.Labour;

@Repository
public interface LabourRepository extends CrudRepository<Labour, Integer> {

}
