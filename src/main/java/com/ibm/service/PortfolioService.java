package com.ibm.service;

import java.util.List;

import com.ibm.entity.Portfolio;

public interface PortfolioService {
	
	int addPortfolio(Portfolio p);
	
	Portfolio getPortfolio(int pid);
	
	List<Portfolio> list();
	
	

}
