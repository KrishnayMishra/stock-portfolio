package com.ibm.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.pojo.Input;
import com.ibm.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	private OrderService service;
	
	@PostMapping(value="/order",consumes="application/json")
	public String buyStock(@RequestBody Input in) {
		service.buyStock(in);
		return "Order placed successfully";
	}

}