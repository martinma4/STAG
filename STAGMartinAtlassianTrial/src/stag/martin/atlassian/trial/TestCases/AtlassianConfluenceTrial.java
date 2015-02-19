package stag.martin.atlassian.trial.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import stag.martin.atlassian.trial.Appmodules.ConfirmationPage_Action;
import stag.martin.atlassian.trial.Appmodules.ConfluenceCategory_Action;
import stag.martin.atlassian.trial.Appmodules.HomePage_Action;
import stag.martin.atlassian.trial.Appmodules.PriceVerification_Action;
import stag.martin.atlassian.trial.Appmodules.ProductSelect_Action;
import stag.martin.atlassian.trial.Appmodules.SignupForm_Action;
import stag.martin.atlassian.trial.Appmodules.SignupTrial_Action;
import stag.martin.atlassian.trial.PageObjects.BaseClass;
import stag.martin.atlassian.trial.Utils.Constant;
import stag.martin.atlassian.trial.Utils.ExcelUtils;
import stag.martin.atlassian.trial.Utils.Utils;

public class AtlassianConfluenceTrial {
	private WebDriver driver;
	private String sTestCaseName;
	private int iTestCaseRow;
	
	@BeforeMethod
	public void beforeMethod() throws Exception {
		//Get the full class name as test case name
		sTestCaseName = this.toString();
		sTestCaseName = Utils.getTestCaseName(sTestCaseName);
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
		iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName, Constant.Col_TestCaseName);
		driver = new FirefoxDriver();
		driver.get("https://www.atlassian.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		new BaseClass(driver);
	}
	

  @Test
  public void main() throws Exception{
	  try{
		  HomePage_Action.Execute();
		  ProductSelect_Action.execute();
		  ConfluenceCategory_Action.Execute();
		  PriceVerification_Action.Execute(iTestCaseRow);
		  SignupTrial_Action.Execute(iTestCaseRow);
		  SignupForm_Action.Execute(iTestCaseRow);
		  ConfirmationPage_Action.Execute(iTestCaseRow);		  
	  } catch (Exception e) {
		  throw e;
	  }
  }
  

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
	  ExcelUtils.deleteFirstRow();
  }
}
