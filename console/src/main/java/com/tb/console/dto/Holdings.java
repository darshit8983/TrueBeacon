package com.tb.console.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * {
      "tradingsymbol": "GOLDBEES",
      "exchange": "BSE",
      "isin": "INF204KB17I5",
      "quantity": 2,
      "authorised_date": "2021-06-08 00:00:00",
      "average_price": 40.67,
      "last_price": 42.47,
      "close_price": 42.28,
      "pnl": 3.5999999999999943,
      "day_change": 0.18999999999999773,
      "day_change_percentage": 0.44938505203405327
    }
 */

public class Holdings {
	
	private String tradingSymbol;
	private String exchange;
	private String isin;
	private double qty;
	private Date authorisedDate;
	private double avgPrice;
	private double lastPrice;
	private double closePrice;
	private double pnl;
	private double dayChange;
	private double dayChangePercent;
	
	
	
	public Holdings(String tradingSymbol, String exchange, String isin, double qty, Date authorisedDate, double avgPrice,
			double lastPrice, double closePrice, double pnl, double dayChange, double dayChangePercent) {
		super();
		this.tradingSymbol = tradingSymbol;
		this.exchange = exchange;
		this.isin = isin;
		this.qty = qty;
		this.authorisedDate = authorisedDate;
		this.avgPrice = avgPrice;
		this.lastPrice = lastPrice;
		this.closePrice = closePrice;
		this.pnl = pnl;
		this.dayChange = dayChange;
		this.dayChangePercent = dayChangePercent;
	}
	
	public String getTradingSymbol() {
		return tradingSymbol;
	}
	public void setTradingSymbol(String tradingSymbol) {
		this.tradingSymbol = tradingSymbol;
	}
	public String getExchange() {
		return exchange;
	}
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}
	public double getQty() {
		return qty;
	}
	public void setQty(double qty) {
		this.qty = qty;
	}
	public Date getAuthorisedDate() {
		return authorisedDate;
	}
	public void setAuthorisedDate(Date authorisedDate) {
		this.authorisedDate = authorisedDate;
	}
	public double getAvgPrice() {
		return avgPrice;
	}
	public void setAvgPrice(double avgPrice) {
		this.avgPrice = avgPrice;
	}
	public double getLastPrice() {
		return lastPrice;
	}
	public void setLastPrice(double lastPrice) {
		this.lastPrice = lastPrice;
	}
	public double getClosePrice() {
		return closePrice;
	}
	public void setClosePrice(double closePrice) {
		this.closePrice = closePrice;
	}
	public double getPnl() {
		return pnl;
	}
	public void setPnl(double pnl) {
		this.pnl = pnl;
	}
	public double getDayChange() {
		return dayChange;
	}
	public void setDayChange(double dayChange) {
		this.dayChange = dayChange;
	}
	public double getDayChangePercent() {
		return dayChangePercent;
	}
	public void setDayChangePercent(double dayChangePercent) {
		this.dayChangePercent = dayChangePercent;
	}
	
	public String getIsin() {
		return isin;
	}

	public void setIsin(String isin) {
		this.isin = isin;
	}

	@Override
	public String toString() {
		return "Holdings [tradingSymbol=" + tradingSymbol + ", exchange=" + exchange + ", isin=" + isin + ", qty=" + qty
				+ ", authorisedDate=" + authorisedDate + ", avgPrice=" + avgPrice + ", lastPrice=" + lastPrice
				+ ", closePrice=" + closePrice + ", pnl=" + pnl + ", dayChange=" + dayChange + ", dayChangePercent="
				+ dayChangePercent + "]";
	}

	@SuppressWarnings("deprecation")
	public static List<Holdings> dummyHoldings() {
		List<Holdings> h = new ArrayList<>();
		h.add(new Holdings("GOLDBEES", "BSE", "INF204KB17I5", 2.0, 
				new Date(2021,6, 8), 40.67, 42.47, 42.28,
				3.5999999999999943, 0.18999999999999773, 0.44938505203405327));
		h.add(new Holdings("IDEA", "NSE", "INE669E01016", 5.0, 
				new Date(2021,6, 8), 8.466, 10, 10.1,
				7.6700000000000035, -0.09999999999999964, -0.9900990099009866));
		return h;
	}

	
}
