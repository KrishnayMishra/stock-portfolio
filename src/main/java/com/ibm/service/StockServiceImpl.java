package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Stock;
import com.ibm.repo.StockRepository;

@Service
public class StockServiceImpl implements StockService {
	@Autowired
	private StockRepository repo;

	@Override
	public int addStock(Stock s) {
		repo.save(s);
		// TODO Auto-generated method stub
		return s.getSid();
	}

	@Override
	public Stock getStock(int Sid) {
		// TODO Auto-generated method stub
		return repo.findById(Sid).get();
	}

	@Override
	public List<Stock> list() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}