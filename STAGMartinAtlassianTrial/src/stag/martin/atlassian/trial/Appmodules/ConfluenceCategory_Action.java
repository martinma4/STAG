package stag.martin.atlassian.trial.Appmodules;

import stag.martin.atlassian.trial.PageObjects.ConfluenceProduct_Page;

public class ConfluenceCategory_Action {
	public static String ProductPrice;
	
	public static void Execute() throws Exception {
		ProductPrice = ConfluenceProduct_Page.strPriceProdPage;
		ConfluenceProduct_Page.BtnMostExpesiveProd().click();
	}
}
