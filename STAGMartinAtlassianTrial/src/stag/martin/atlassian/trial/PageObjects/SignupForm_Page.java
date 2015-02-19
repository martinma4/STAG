package stag.martin.atlassian.trial.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupForm_Page extends BaseClass{
	public static WebElement element;
	
	public SignupForm_Page(WebDriver driver) {
		super(driver);
	}
	
	public static WebElement SiteAddress() throws Exception {
		try{
			element = driver.findElement(By.xpath("html/body/div[2]/div/section[1]/div/form/div[2]/div[1]/div[1]/div/input"));
		} catch(Exception e) {
			e.printStackTrace();
		}
		return element;
	}
	
	public static WebElement Email() throws Exception {
		try {
			element = driver.findElement(By.id("email"));
		} catch(Exception e){
			e.printStackTrace();
		}
		return element;
	}
	
	public static WebElement UserName() throws Exception {
		try {
			element = driver.findElement(By.id("aod-username"));
		} catch(Exception e){
		
		}
	return element;
	}
	
	public static WebElement Password() throws Exception {
		 try {
			element = driver.findElement(By.id("aod-password"));
		} catch(Exception e){
			
		}
		return element;
		}

	public static WebElement FirstName() throws Exception {
		 try {
			element = driver.findElement(By.xpath("html/body/div[2]/div/section[1]/div/form/div[2]/div[1]/section[3]/div[1]/div[1]/input"));
		} catch(Exception e){
			e.printStackTrace();
		}
		return element;
		}

	public static WebElement LastName() throws Exception {
		 try {
			element = driver.findElement(By.id("lastName"));
		} catch(Exception e){
			e.printStackTrace();
		}
		return element;
		}
	
	public static WebElement CompanyName() throws Exception {
		 try {
			element = driver.findElement(By.id("company"));
		} catch(Exception e){
			e.printStackTrace();
		}
		return element;
		}
	
	public static WebElement SelectUsed() throws Exception {
		 try {
			element = driver.findElement(By.cssSelector(".select2-choice"));
		} catch(Exception e){
			e.printStackTrace();			
		}
		return element;
		}
	
	public static WebElement OptionYes() throws Exception {
		try {
			element = driver.findElement(By.xpath("html/body/div[9]/ul/li[2]"));
		} catch(Exception e){
			e.printStackTrace();
		}
		return element;
	}
	
	public static WebElement Country() throws Exception {
		 try {
			element = driver.findElement(By.cssSelector(".ng-pristine.ng-valid.ng-scope"));
		} catch(Exception e){
			e.printStackTrace();
		}
		return element;
		}

	public static WebElement AddressLine1() throws Exception {
		 try {
			element = driver.findElement(By.xpath("html/body/div[2]/div/section[1]/div/form/div[2]/div[2]/div[1]/div[2]/input[1]"));
		} catch(Exception e){
			e.printStackTrace();
		}
		return element;
		}

	public static WebElement City() throws Exception {
		 try {
			element = driver.findElement(By.xpath("html/body/div[2]/div/section[1]/div/form/div[2]/div[2]/div[1]/div[3]/input"));
		} catch(Exception e){
			e.printStackTrace();
		}
		return element;
		}

	public static WebElement State() throws Exception {
		try {
			element = driver.findElement(By.cssSelector(".ng-pristine.ng-valid.ng-valid-hamlet.ng-valid-state"));
		} catch(Exception e) {
			
		}
		return element;
	}
	
	public static WebElement ChkBoxAgree() throws Exception {
		 try {
			element = driver.findElement(By.id("eula"));
		} catch(Exception e){
			e.printStackTrace();
		}
		return element;
		}

	public static WebElement BtnStartTrial() throws Exception {
		 try {
			element = driver.findElement(By.cssSelector(".large.button.cta"));
		} catch(Exception e){
			e.printStackTrace();
		}
		return element;
		}
	
}
