package com.bluescript.demo.repository;

import com.bluescript.demo.entity.ksdsCustEntity;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface KsdscustRepository extends CrudRepository<ksdsCustEntity, Long> {

    void save(long caCustomerNum);
}