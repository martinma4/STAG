package stag.martin.atlassian.trial.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Confirmation_Page extends BaseClass{
	public Confirmation_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement elementSucess;
	public static WebElement elementSiteAddress;
	
	public static WebElement DialogSuccess() throws Exception {
		try {
			elementSucess = driver.findElement(By.cssSelector(".dialog.success.large"));
			return elementSucess;
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static WebElement SiteAddress() throws Exception {
		try {
			elementSiteAddress = driver.findElement(By.xpath("html/body/div[2]/div/section[1]/div[1]/p/strong"));
		} catch(Exception e) {
			throw e;
		}
		return elementSiteAddress;
	}
}