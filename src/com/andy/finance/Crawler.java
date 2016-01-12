package com.andy.finance;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.andy.stockBean.Stock;


public class Crawler {
	public Stock getStock(){
		

		String url = "http://www.etnet.com.hk/www/tc/stocks/realtime/quote.php?code=0939";
		long start = System.currentTimeMillis();
		Stock stock = new Stock();
		
		float realTimePrice = 0;
		float high=0;
		float low=0;
		float volume=0;
		String changeValue;
		String changePercent;
		Document doc = null;
		try{
			doc = Jsoup.connect(url).get();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			System.out.println("Time is: "+(System.currentTimeMillis()-start)+"ms");
		}
		//String html = "<span class=\"a99.b\">123</>";
		//Document doc2 =Jsoup.parse(html);
		//Element div = doc.select("StkDetailMainBox").first();
		//realTimePrice =Float.parseFloat( doc.select("span[class$=\"Price up2\"]").text());
	//	low = Float.parseFloat(doc.select("span[class$=\"Price up2\"]").text());
		
		
		Elements test = doc.getElementById("StkDetailMainBox").getElementsByTag("span");
		stock.setRealTimePrice (Float.parseFloat(doc.getElementById("StkDetailMainBox").getElementsByTag("span").get(0).text().substring(0, 5)));
		stock.setChangeVlaue(doc.getElementById("StkDetailMainBox").getElementsByTag("span").get(1).text().substring(0, 6));
		stock.setChangePercentage(doc.getElementById("StkDetailMainBox").getElementsByTag("span").get(1).text().substring(8, 15));
		stock.setHigh(Float.parseFloat(doc.getElementById("StkDetailMainBox").getElementsByTag("span").get(4).text()));
		String lowTemp = doc.getElementById("StkDetailMainBox").getElementsByTag("span").get(11).text();
		if(lowTemp==null||"".equals(lowTemp)){
			stock.setLow(Float.parseFloat(doc.getElementById("StkDetailMainBox").getElementsByTag("span").get(12).text()));
		}
		else stock.setLow(Float.parseFloat(lowTemp));
		//for(Element d : elem){a
		//}
		System.out.println("Change Value is:" +stock.getChangeVlaue()); 
		System.out.println("Change Percentage is:" +stock.getChangePercentage()); 
		System.out.println("Low is:" +stock.getLow()); 
		System.out.println("High is:" +stock.getHigh()); 
		System.out.println("Real time price is:" +stock.getRealTimePrice()); 
		
		//System.out.println(test);

		
		return stock;
	
	}
	
/*	static public void main(String[] args){
		String url = "http://www.etnet.com.hk/www/tc/stocks/realtime/quote.php?code=0939";
		long start = System.currentTimeMillis();
		Stock stock = new Stock();
		
		float realTimePrice = 0;
		float high=0;
		float low=0;
		float volume=0;
		String changeValue;
		String changePercent;
		Document doc = null;
		try{
			doc = Jsoup.connect(url).get();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			System.out.println("Time is: "+(System.currentTimeMillis()-start)+"ms");
		}
		//String html = "<span class=\"a99.b\">123</>";
		//Document doc2 =Jsoup.parse(html);
		//Element div = doc.select("StkDetailMainBox").first();
		//realTimePrice =Float.parseFloat( doc.select("span[class$=\"Price up2\"]").text());
	//	low = Float.parseFloat(doc.select("span[class$=\"Price up2\"]").text());
		
		
		Elements test = doc.getElementById("StkDetailMainBox").getElementsByTag("span");
		stock.setRealTimePrice (Float.parseFloat(doc.getElementById("StkDetailMainBox").getElementsByTag("span").get(0).text().substring(0, 5)));
		stock.setChangeVlaue(doc.getElementById("StkDetailMainBox").getElementsByTag("span").get(1).text().substring(0, 6));
		stock.setChangePercentage(doc.getElementById("StkDetailMainBox").getElementsByTag("span").get(1).text().substring(8, 15));
		stock.setHigh(Float.parseFloat(doc.getElementById("StkDetailMainBox").getElementsByTag("span").get(4).text()));
		String lowTemp = doc.getElementById("StkDetailMainBox").getElementsByTag("span").get(11).text();
		if(lowTemp==null||"".equals(lowTemp)){
			stock.setLow(Float.parseFloat(doc.getElementById("StkDetailMainBox").getElementsByTag("span").get(12).text()));
		}
		else stock.setLow(Float.parseFloat(lowTemp));
		//for(Element d : elem){a
		//}
		System.out.println("Change Value is:" +stock.getChangeVlaue()); 
		System.out.println("Change Percentage is:" +stock.getChangePercentage()); 
		System.out.println("Low is:" +stock.getLow()); 
		System.out.println("High is:" +stock.getHigh()); 
		System.out.println("Real time price is:" +stock.getRealTimePrice()); 
		
		//System.out.println(test);
		
	
			/*	Long l1 = System.currentTimeMillis();
				
				String string = "http://www.etnet.com.hk/www/tc/stocks/realtime/quote.php?code=0939";
				//String str3 = "";
				//String str[] = new String[750];
				String str2 = "";
				
				try {
					URL readSource = new URL(string);
					 Thread.sleep(5000);
					BufferedReader input = new BufferedReader(new InputStreamReader(readSource.openStream()));
					 Thread.sleep(3000);
					
					while((str2 = input.readLine()) !=null){
							System.out.println(str2);
					}
					
					//System.out.println("1====================>"+str3);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			
		
		
	}*/
}
