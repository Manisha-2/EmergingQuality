package com.testingshastra.keywords;


import 	com.testingshastra.keywords.Keyword;

public class Sign_Up_Page {
	public static void Sign_Up(String name,String mobile_no,String pass) {
		Keyword.enterText("XPATH", "//input[@name=\"customerName\"]", name);
		Keyword.enterText("XPATH", "//input[@id='ap_phone_number']", mobile_no);
		Keyword.enterText("XPATH", "//input[@type='password']", pass);
		Keyword.clickOnElement("XPATH", "//input[@id='continue']");
	} 
}
