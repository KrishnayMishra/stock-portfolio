package com.ibm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.entity.Portfolio;

public interface PortfolioRepository extends JpaRepository<Portfolio,Integer> {

}