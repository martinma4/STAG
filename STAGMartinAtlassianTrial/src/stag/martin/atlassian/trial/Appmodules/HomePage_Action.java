package stag.martin.atlassian.trial.Appmodules;

import stag.martin.atlassian.trial.PageObjects.Home_Page;

public class HomePage_Action {
	public static void Execute() throws Exception {
		Home_Page.lnk_Try().click();
	}
}
