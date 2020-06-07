package Com.TestingShatra.Keywords;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Com.TestingShatra.Keywords.Keyword;

public class Sign_In_Page {

	public static void amazon_SignIn_Page(String uname, String pass) {
		Keyword.clickOnElement("XPATH", "//*[@id=\"nav-link-accountList\"]/div/span");
		Keyword.enterText("XPATH", "//*[@id=\"ap_email\"]", uname);
		Keyword.clickOnElement("XPATH", "//*[@id=\"continue\"]/span");
		Keyword.enterText("XPATH", "//*[@id=\"ap_password\"]", pass);
		Keyword.clickOnElement("XPATH", "//*[@id=\"auth-signin-button\"]/span");

	}
}
