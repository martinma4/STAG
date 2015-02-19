package stag.martin.atlassian.trial.Appmodules;

import stag.martin.atlassian.trial.PageObjects.ConfluenceProduct_Page;
import stag.martin.atlassian.trial.PageObjects.SignupTrial_Page;
import stag.martin.atlassian.trial.Utils.Constant;
import stag.martin.atlassian.trial.Utils.ExcelUtils;

public class PriceVerification_Action {

	private static String PriceSignupTrial;
	private static String PriceCategory;
	private static boolean booleanprice;
//	This method to verify the price of selected product in different page
	public static void Execute(int iTestCaseRow) throws Exception{
		try {
			PriceSignupTrial = SignupTrial_Page.TxtSignupPrice().getText();
			PriceCategory = ConfluenceProduct_Page.strPriceProdPage;
			booleanprice = PriceSignupTrial.equalsIgnoreCase(PriceCategory);
			if(booleanprice){
				ExcelUtils.setCellData("Pass", iTestCaseRow, Constant.Col_ResultPrice);
			} else {
				ExcelUtils.setCellData("Fail", iTestCaseRow, Constant.Col_ResultPrice);
			}
			} catch(Exception e)
			{
			throw e;
		}
	}
}


