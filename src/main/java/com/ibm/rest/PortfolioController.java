package com.ibm.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.Portfolio;
import com.ibm.service.PortfolioService;

@RestController
public class PortfolioController {
	@Autowired
	private PortfolioService service;
	@PostMapping(value="/portfolio",consumes="application/json")
	public String addPortfolio(@RequestBody Portfolio p)
	{
		int pid=service.addPortfolio(p);
		return "Portfolio added with Id:"+pid;
	}
	@GetMapping(value="/portfolio/{pid}",produces="application/json")
	public Portfolio getPortfolio(@PathVariable int pid) {
		return service.getPortfolio(pid);
	}
	
	

}