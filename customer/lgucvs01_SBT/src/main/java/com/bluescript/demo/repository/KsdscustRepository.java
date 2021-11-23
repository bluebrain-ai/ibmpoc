package com.bluescript.demo.repository;
 
import com.bluescript.demo.model.CaCustomerNum;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository; 

@Repository
public interface KsdscustRepository extends CrudRepository<CaCustomerNum,ID> {
  } }