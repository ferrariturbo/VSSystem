package com.andy.financewebservice;

import java.io.IOException;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.andy.stockBean.StockOld;
import com.andy.stockBean.Stock;
import com.andy.stockBean.StockInfo;
import com.andy.finance.Crawler;
import com.andy.finance.YahooFinance;

@Path("/finance")
public class StockResource {
	private StockInfo stockInfo;
	
	
	@GET
	@Produces({MediaType.APPLICATION_XML})
	public StockInfo getStockInfo() throws IOException{
		stockInfo =new StockInfo();
		Crawler cl = new Crawler();
		Stock stock = new Stock();
		stock = cl.getStock();
		//System.out.println(stock.getRealTimePrice()+"%%%%%%%%%%%%%");
		stockInfo.setStocks(new ArrayList<Stock>());
	//	String[] sids = {"C", "BAC", "GS", "GOOG", "EDU", "DRYS", "FB"};
		/*for(String sid:sids){
			stockInfo.addStocks(new StockOld(sid));
			System.out.println(sid);
		}
		YahooFinance.marketData(stockInfo.getStocks());
		*/
		stockInfo.addStocks(stock);
		//System.out.println(stockInfo.getStocks().get(0).getRealTimePrice());
		return stockInfo;
	}
	
}
