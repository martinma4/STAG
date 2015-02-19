package stag.martin.atlassian.trial.Appmodules;

import stag.martin.atlassian.trial.PageObjects.SignupForm_Page;
import stag.martin.atlassian.trial.Utils.Constant;
import stag.martin.atlassian.trial.Utils.ExcelUtils;

//Wait time must be added to this class
public class SignupForm_Action {
	public static void Execute(int iTestCaseRow) throws Exception {
		String SiteAddress = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_SiteAddress);
		SignupForm_Page.SiteAddress().sendKeys(SiteAddress);
		String Email = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Email);
		SignupForm_Page.Email().sendKeys(Email);
		String UserName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_AdminUserName);
		SignupForm_Page.UserName().sendKeys(UserName);
		String Password = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Password);
		SignupForm_Page.Password().sendKeys(Password);
		String FirstName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_FirstName);
		SignupForm_Page.FirstName().sendKeys(FirstName);
		String LastName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_LastName);
		SignupForm_Page.LastName().sendKeys(LastName);
		String Company = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_CompanyName);
		SignupForm_Page.CompanyName().sendKeys(Company);
		
//		Click Yes for used Product DropDown list
		SignupForm_Page.SelectUsed().click();
		SignupForm_Page.OptionYes().click();
		
		String Country = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Country);
		SignupForm_Page.Country().sendKeys(Country);
		String Address = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_AddressLine);
		SignupForm_Page.AddressLine1().sendKeys(Address);
		String City = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_City);
		SignupForm_Page.City().sendKeys(City);
		String State = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_State);
		SignupForm_Page.State().sendKeys(State);
		SignupForm_Page.ChkBoxAgree().click();
		SignupForm_Page.BtnStartTrial().click();
	}
}