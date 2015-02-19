package stag.martin.atlassian.trial.Appmodules;

import stag.martin.atlassian.trial.PageObjects.Confirmation_Page;
import stag.martin.atlassian.trial.Utils.Constant;
import stag.martin.atlassian.trial.Utils.ExcelUtils;

public class ConfirmationPage_Action {
	private static String sSiteAddress;
	private static String sSiteAddressDatabase;
	private static boolean bSiteAddress;
	
//	This is to verify the site address is correct and success dialog correct
	public static void Execute(int iTestCaseRow) throws Exception {
//
		try {
			sSiteAddress = Confirmation_Page.SiteAddress().getText();
			sSiteAddressDatabase = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_SiteAddress);
			bSiteAddress = sSiteAddress.equalsIgnoreCase(sSiteAddressDatabase + ".atlassian.net");
			if(bSiteAddress) {
				ExcelUtils.setCellData("Pass", iTestCaseRow, Constant.Col_ResultProduct);
			} else {
				ExcelUtils.setCellData("Fail", iTestCaseRow, Constant.Col_ResultProduct);
			}
		
//			This is to verify the success dialog
			if(Confirmation_Page.DialogSuccess().isDisplayed()) {
				ExcelUtils.setCellData("Pass", iTestCaseRow, Constant.Col_Result);
			} else {
				ExcelUtils.setCellData("Fail", iTestCaseRow, Constant.Col_Result);
			}
		} catch(Exception e) {
			throw e;
		}
	}
}