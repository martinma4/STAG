package stag.martin.atlassian.trial.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductTrial_Page extends BaseClass{
	public ProductTrial_Page(WebDriver driver) {
		super(driver);
	}

	private static WebElement element;
	
	public static WebElement lnk_Confluence() throws Exception {
		try {
			element = driver.findElement(By.partialLinkText("Create & collaborate"));
		} catch(Exception e) {
			e.printStackTrace();
		}
		return element;
	}
}
