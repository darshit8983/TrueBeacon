package com.tb.console.dto;


public class OrdersDto {
	
	private String symbol;
	private String price;
	private String qty;
	private String exchange;
	
	public OrdersDto(String symbol, String price, String qty, String exchange) {
		super();
		this.symbol = symbol;
		this.price = price;
		this.qty = qty;
		this.exchange = exchange;
	}
	
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public String getExchange() {
		return exchange;
	}
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}
	@Override
	public String toString() {
		return "OrdersDto [symbol=" + symbol + ", price=" + price + ", qty=" + qty + ", exchange=" + exchange + "]";
	}
	
}
