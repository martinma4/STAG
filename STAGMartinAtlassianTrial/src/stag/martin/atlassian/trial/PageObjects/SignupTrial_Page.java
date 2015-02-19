package stag.martin.atlassian.trial.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupTrial_Page extends BaseClass{
	public static WebElement priceTrialPage;
	private static WebElement BtnNextTrialPage;
	
	public SignupTrial_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement TxtSignupPrice() throws Exception {
		try {
			priceTrialPage = driver.findElement(By.cssSelector(".price.circular"));
		} catch(Exception e) {
			throw e;
		}
		return priceTrialPage;
	}
	
	public static WebElement BtnSigninTrialPage() throws Exception {
		try {
			BtnNextTrialPage = driver.findElement(By.cssSelector(".large.button.cta"));
		} catch(Exception e) {
			e.printStackTrace();
		}
		return BtnNextTrialPage;
	}
}
