package com.andy.finance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import com.andy.stockBean.Stock;
import com.andy.stockBean.StockOld;

public class YahooFinance {
	private static void getPrice(StockOld stock) throws IOException{
		String yahoo_quote = "http://finance.yahoo.com/d/quotes.csv?s=" + stock.getSid() + "&f=snc1l1&e=.c";
		double price = 0.0;
		double change = 0.0;
	
		try{
			URL url =new URL(yahoo_quote);
			URLConnection urlconn = url.openConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(urlconn.getInputStream()));
			String content = br.readLine();
			content = content.replace((char)34, (char)32);
			String[] tokens = content.split(",");
			price = Double.parseDouble(tokens[tokens.length-1].trim());
			change = Double.parseDouble(tokens[tokens.length-2].trim());
			
		}catch(Exception e){
			e.printStackTrace();
		}
		stock.setPrice(price);
		stock.setChange(change);
		
		
	}
	
	public static void marketData(List<StockOld> stocks) throws IOException {
		for (StockOld stock:stocks) {
			getPrice(stock);
		}
	}
}
