package com.ibm.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.Stock;
import com.ibm.service.StockService;

@RestController
public class StockController {
	@Autowired
	private StockService service;
	
	@PostMapping(value="/stock",consumes="application/json")
	public String addStock(@RequestBody Stock stock) {
		int sid=service.addStock(stock);
		return "Stock added with Id:"+sid;
	}
	@GetMapping(value="/stock/{sid}",produces="application/json")
	public Stock getStock(@PathVariable int sid) {
	return service.getStock(sid);
	}

}