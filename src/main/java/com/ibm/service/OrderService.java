package com.ibm.service;

import com.ibm.pojo.Input;

public interface OrderService {
	
	boolean buyStock(Input input);
	 
	boolean sellStock(Input input);
	

}
