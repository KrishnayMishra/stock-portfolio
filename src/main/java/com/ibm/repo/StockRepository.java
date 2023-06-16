package com.ibm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.entity.Stock;

public interface StockRepository extends JpaRepository <Stock,Integer> {

}