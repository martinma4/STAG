package testObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import stag.martin.atlassian.trial.PageObjects.BaseClass;
import stag.martin.atlassian.trial.PageObjects.ConfluenceProduct_Page;
import stag.martin.atlassian.trial.PageObjects.Home_Page;
import stag.martin.atlassian.trial.PageObjects.SignupForm_Page;
import stag.martin.atlassian.trial.PageObjects.SignupTrial_Page;

public class TestObject {
	public static void main(String args[]) throws Exception{
		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.atlassian.com");
		driver.get("https://www.atlassian.com/ondemand/signup/form");
		new BaseClass(driver);
		SignupTrial_Page.BtnSigninTrialPage().click();
		System.out.println(SignupForm_Page.SelectUsed().getTagName());
		SignupForm_Page.SelectUsed().click();
		SignupForm_Page.OptionYes().click();
//		System.out.print(SignupTrial_Page.TxtSignupPrice().getText());
//		SignupTrial_Page.BtnSigninTrialPage().click();

//		SignupFormPage.SiteAddress().sendKeys("sitemartin");
//		SignupFormPage.Email().sendKeys("fafa@fa.com");
//		SignupFormPage.UserName().sendKeys("user");
//		SignupFormPage.Password().sendKeys("faferew232");
//		SignupFormPage.FirstName().sendKeys("Martin");
		
//		SignupFormPage.LastName().sendKeys("fwerwe");
//		SignupFormPage.CompanyName().sendKeys("Martarian");
//		WebElement element1 = driver.findElement(By.className("select2-choice"));
//		WebElement element1 =driver.findElement(By.id("select2-chosen-1"));
//		System.out.println(element1.getTagName());
//		System.out.println(element1.getClass());
//		WebElement element11 = driver.findElement(By.className("select2-choice"));
//		element11.click();
//		element11 = driver.findElement(By.id("usedProduct"));
//		System.out.print(element11.getClass());
//		Select oSelection = new Select(driver.findElement(By.id("usedProduct")));
//		oSelection.selectByIndex(1);
//		driver.findElement(By.xpath("html/body/div[9]/ul/li[2]")).click();
//		driver.findElement(By.cssSelector("#select2-result-label-46"));
		
//		oSelection.selectByVisibleText("Yes");
//		SignupForm_Page.Country().sendKeys("Australia");
//		SignupForm_Page.AddressLine1().sendKeys("6 Hello St Dundas");
//		SignupForm_Page.City().sendKeys("Good Town");
//		SignupForm_Page.State().sendKeys("NSW");
//		SignupForm_Page.ChkBoxAgree().click();
//		SignupForm_Page.BtnStartTrial().click();
//		System.out.println(SignupTrialPage.SigninTrialPage().getText());
//		SignupTrialPage.SigninTrialPage().click();
//		ConfluenceProduct_Page.MostExpesiveProd().click();
//		driver.close();
//		List<WebElement> elements = driver.findElement(By.id("ondemand")).findElements(By.className("pricingBox "));
//		for(WebElement element:elements) {
//			String str = element.getText();
//			str = StringUtils.substringBetween(str, "$", "/mo");
//			int price = Integer.parseInt(str);
//			if(price == 30) 
//			{
//				System.out.println(element.findElement(By.className("")));
//				break;
//			}
////			{
////				System.out.println(element.findElement(By.className("button buttonSm")).getTagName());} 
//////				break;
//		}
//		Home_Page.lnk_Try().click();

		//		System.out.println(driver.findElement(By.id("ondemand")));
//		List<WebElement> elements =driver.findElement(By.id("ondemand")).findElements(By.className("pricingBox "));
		
		//		for(WebElement element: elements) {
//			"fw'efew".split("'", arg1)
//			
////			System.out.println("Class: ***" + element.getClass());
////			System.out.println("CSS: ****" + element.getCssValue("border"));
////			System.out.println("CSS: ****" + element.getCssValue("color"));
////			print("Text :******" + element.getText());
////			System.out.println("Location: ****" + element.getLocation());
////			System.out.println("Size: ****" + element.getSize());
////			System.out.println("TagName: ***" + element.getTagName());
////			System.out.println("Class: ****" + element.getAttribute("class"));
////			System.out.println("Label: ****" + element.getAttribute("label"));
////			System.out.println("Name: ****" + element.getAttribute("name"));
////			System.out.println("Id: ****" + element.getAttribute("id"));
////			System.out.println("/b" + "*****************************************---------");
//			
//		}
		
//		System.out.println(elements.size());
//		See below: Without this line eclipse goes into NullPointerException because not driver in the runtime
//		Don't understand why the "driver" persists in the runtime only if BaseClass instance is create.
//		Without creating BaseClass instance the "driver" suddenly lost after call static method "lnk_Try"
//		String xpath = ConfluenceProduct_Page.MostExpesiveProd().getAttribute("xPath");
//		System.out.println(xpath);
	}
	public static void print(String content) {
		System.out.println(content);
	}
}


//package testObjects;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;//import stag.martin.atlassian.trial.pageObjects.Home_Page;
//import stag.martin.atlassian.trial.pageObjects.ProductTrial_Page;
//
//public class TestObject {
//	public static void main(String args[]) throws Exception{
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.atlassian.com");
//		
//		Home_Page.lnk_Try(driver).click();
//		ProductTrial_Page.lnk_Confluence(driver).click();
//	}
//}