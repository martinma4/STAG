package stag.martin.atlassian.trial.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page extends BaseClass{
	public static WebElement element =null;

	public Home_Page(WebDriver driver){
		super(driver);
	}
	
	public static WebElement lnk_Try() throws Exception {
		try{
			element = driver.findElement(By.xpath(".//*[@id='mainNav']/ul/li[3]/a"));
			} catch (Exception e){
				throw e;
			}
		return element;
	} 
}