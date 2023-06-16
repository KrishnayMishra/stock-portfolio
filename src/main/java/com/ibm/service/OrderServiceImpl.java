package com.ibm.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Order;
import com.ibm.entity.Portfolio;
import com.ibm.entity.Stock;
import com.ibm.pojo.Input;
import com.ibm.repo.OrderRepository;
import com.ibm.repo.PortfolioRepository;
import com.ibm.repo.StockRepository;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private StockRepository stockRepo;
	@Autowired
	private PortfolioRepository portRepo;
	@Autowired
	private OrderRepository orderRepo;

	@Override
	public boolean buyStock(Input input) {
		Stock s = stockRepo.findById(input.getSid()).get();
		Portfolio p = portRepo.findById(input.getPid()).get();
		Order order = new Order();
		order.setQuantity(input.getQty());
		order.setTxnDate(LocalDate.now());
		order.setShare(s);
		order.setPortfolio(p);
		p.setInvestment((input.getQty() * s.getQuote())+p.getInvestment());
		orderRepo.save(order);

		return true;
		// TODO Auto-generated method stub

	}

	@Override
	public boolean sellStock(Input input) {
		Stock s = stockRepo.findById(input.getSid()).get();
		Portfolio p = portRepo.findById(input.getPid()).get();
		Order order = new Order();
		order.setQuantity(input.getQty());
		order.setTxnType("Sell");
		order.setTxnDate(LocalDate.now());
		order.setShare(s);
		order.setPortfolio(p);
	

		p.setInvestment((input.getQty() * s.getQuote())-p.getInvestment());
		orderRepo.save(order);
		return true;
		// TODO Auto-generated method stub
		
	}

}