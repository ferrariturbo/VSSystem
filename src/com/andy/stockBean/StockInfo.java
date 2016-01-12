package com.andy.stockBean;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class StockInfo {
	private List<Stock> stocks;
	
	@XmlElement(name = "stocks")
	public List<Stock> getStocks() {
		return stocks;
	}

	public void setStocks(ArrayList<Stock> arrayList) {
		this.stocks = arrayList;
	}
	
	public void addStocks(Stock stock){
		stocks.add(stock);
	}
	
	public void removeStocks(Stock stock){
		stocks.remove(stock);
	}
}
