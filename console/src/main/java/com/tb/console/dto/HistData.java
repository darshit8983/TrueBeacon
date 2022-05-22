package com.tb.console.dto;

import java.util.Date;


public class HistData {
	
	private String instName;
	private double price;
	private Date date;
	
	public HistData(String instName, double price, Date date) {
		super();
		this.instName = instName;
		this.price = price;
		this.date = date;
	}
	public String getInstName() {
		return instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "HistData [instName=" + instName + ", price=" + price + ", date=" + date + "]";
	}
}
