package stag.martin.atlassian.trial.Appmodules;

import stag.martin.atlassian.trial.PageObjects.SignupTrial_Page;

public class SignupTrial_Action {
	public static void Execute(int iTestCaseRow) throws Exception{
		try {
			SignupTrial_Page.BtnSigninTrialPage().click();
			} catch(Exception e){
			throw e;
		}
	}
}