package com.ibm.service;

import java.util.List;

import com.ibm.entity.Stock;

public interface StockService {
	
	int addStock (Stock s);
	
	Stock getStock(int sid);
	
	List<Stock> list();
}
