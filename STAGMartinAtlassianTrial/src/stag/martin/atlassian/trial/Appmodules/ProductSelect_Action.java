package stag.martin.atlassian.trial.Appmodules;

import stag.martin.atlassian.trial.PageObjects.ProductTrial_Page;
import stag.martin.atlassian.trial.Utils.Utils;

public class ProductSelect_Action {
	public static void execute() throws Exception {
		ProductTrial_Page.lnk_Confluence().click();
	}
}
