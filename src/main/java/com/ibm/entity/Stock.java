package com.ibm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stock {
	@Id
	private int sid;
	@Column(length = 20)
	private String company;
	private double quote;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getQuote() {
		return quote;
	}

	public void setQuote(double quote) {
		this.quote = quote;
	}

}