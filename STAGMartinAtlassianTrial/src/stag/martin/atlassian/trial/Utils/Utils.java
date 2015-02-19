package stag.martin.atlassian.trial.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
	public static String getTestCaseName(String sTestCase) throws Exception {
		String value = sTestCase;
		try {
			int posi = value.indexOf("@");
			String subValue = value.substring(0, posi);
			posi = subValue.lastIndexOf(".");
			subValue = subValue.substring(posi + 1);
			return subValue;
		}
		catch(Exception e) {
			throw e;
		}
	}
	
	public static void WaitForElement(WebElement element) {
		WebDriver driver = null;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
}
