package com.testingshastra.regressiontestcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import  com.testingshastra.keywords.Keyword;

public class Forgot_Password {
	@BeforeTest
	public void tc_01() {

		Keyword.openBrowser("Chrome");
		Keyword.implicit_Wait(5, "SECONDS");

		Keyword.logger_add("Browser Opened");
		Keyword.openURL("https://www.amazon.in/");
	}

	@Test
	private void amazon_SignIn_Page() {
		Keyword.clickOnElement("XPATH", "//*[@id=\"nav-link-accountList\"]/div/span");
		Keyword.enterText("XPATH", "//*[@id='ap_email']", "manishaNkale23@gmail.com");
		Keyword.clickOnElement("XPATH", "//*[@id=\"continue\"]/span");
		Keyword.enterText("XPATH", "//*[@id=\"ap_password\"]", "12345");
		Keyword.clickOnElement("XPATH", "//*[@id=\"auth-signin-button\"]/span");
		Keyword.implicit_Wait(3, "SECONDS");
		Keyword.clickOnElement("XPATH", "//*[@id='auth-fpp-link-bottom']");
		Keyword.clickOnElement("XPATH", "//*[@id=\"a-autoid-0\"]/span");
		

	}

}
