package stag.martin.atlassian.trial.PageObjects;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//This method to collect the most expensive one by comparing all products' prices
public class ConfluenceProduct_Page extends BaseClass{
	public static String strPriceProdPage;
	private static WebElement BtnTrialTopPrice;
	private static List<WebElement> elements;
	private static ArrayList<String> priceStrList;
	private static ArrayList<Integer> priceList;
	public static int priceTopProdPage;
	
	public ConfluenceProduct_Page(WebDriver driver){
		super(driver);
	}
	
	public static WebElement BtnMostExpesiveProd() throws Exception {
		try {  
			elements = driver.findElement(By.id("ondemand")).findElements(By.className("priceBox"));
			
			priceStrList = new ArrayList<String>();
			priceList = new ArrayList<Integer>();
//			get text from the elements

			int i = 0;
			for (WebElement element : elements) {
				priceStrList.add(element.getText());
				i++;
			}
			
//			Retrieve number from all strings
			for(i=0; i<priceStrList.size(); i++) {
				int pos = priceStrList.get(i).indexOf("/");
				String str = priceStrList.get(i).substring(0, pos);
				pos = priceStrList.get(i).indexOf("$");
				str = str.substring(pos + 1, str.length()); 
				priceList.add(Integer.parseInt(str));
			}
			
//			Compare the price and get the most expensive
			for(i = 0; i<priceList.size() - 1; i++) {
				priceTopProdPage = priceList.get(0);
				if (priceList.get(i + 1) > priceList.get(i)) {
					priceTopProdPage = priceList.get(i + 1); 
				}
			}
			
//			get the product bundle class containing the product of top price
//			get the product bundle elements by looking for partial class name
			elements = driver.findElement(By.id("ondemand")).findElements(By.className("pricingBox "));
			for(WebElement element:elements) {
				String str = element.getText();
				str = StringUtils.substringBetween(str, "$", "/mo");
				strPriceProdPage = "$" + str + "/mo";
				int price = Integer.parseInt(str);
				if(price == priceTopProdPage){
					BtnTrialTopPrice = element.findElement(By.className("buttonTxt"));
					break;
				} 
			}
		} 
		catch(Exception e){
			e.printStackTrace();
		}
		return BtnTrialTopPrice;
	}
}