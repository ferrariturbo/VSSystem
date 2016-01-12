package com.andy.stockBean;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "stock")
public class StockOld {
	private String sid;
	private double price;
	private double change;
	public StockOld(){}
	public StockOld(String sid){
		this.sid=sid;
	}
	@XmlElement
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	@XmlElement
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@XmlElement
	public double getChange() {
		return change;
	}
	public void setChange(double change) {
		this.change = change;
	}
	
	
}
