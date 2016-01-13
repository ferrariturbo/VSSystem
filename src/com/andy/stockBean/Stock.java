package com.andy.stockBean;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "stock")
public class Stock {

	private String id;
	private double open;
	private float preClose;
	private float high;
	private float low;
	private float realTimePrice;
	private String changeValue;
	private String changePercentage;
<<<<<<< HEAD
	private String name;

=======
	private	String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
>>>>>>> origin/master
	private BigDecimal volume;
	private double adj_close;
	private String bdate;
	private double ocDiff;
	private double hlDiff;
<<<<<<< HEAD
=======
	
>>>>>>> origin/master
	@XmlElement
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getOpen() {
		return open;
	}
	public void setOpen(double open) {
		this.open = open;
	}
	
	@XmlElement
	public float getHigh() {
		return high;
	}
	public void setHigh(float high) {
		this.high = high;
	}
	
	@XmlElement
	public float getPreClose() {
		return preClose;
	}
	public void setPreClose(float preClose) {
		this.preClose = preClose;
	}
	
	@XmlElement
	public float getLow() {
		return low;
	}
	public void setLow(float low) {
		this.low = low;
	}
	
	@XmlElement
	public String getChangeValue() {
		return changeValue;
	}
	public void setChangeValue(String changeVlaue) {
		this.changeValue = changeVlaue;
	}
	
	@XmlElement
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@XmlElement
	public String getChangePercentage() {
		return changePercentage;
	}
	public void setChangePercentage(String changePercentage) {
		this.changePercentage = changePercentage;
	}
	
	//@XmlElement
	public BigDecimal getVolume() {
		return volume;
	}
	
	@XmlElement
	public float getRealTimePrice() {
		return realTimePrice;
	}
	public void setRealTimePrice(float realTimePrice) {
		this.realTimePrice = realTimePrice;
	}
	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}
	public double getAdj_close() {
		return adj_close;
	}
	public void setAdj_close(double adj_close) {
		this.adj_close = adj_close;
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	

		
	

}
