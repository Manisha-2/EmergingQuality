package com.testingshastra.keywords;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Amazon_Pom {
	
	@FindBy(xpath="//a[contains(text(),'Amazon Pay')]")
	private WebElement amazon_Pay; 
	
public  void click_On_Amazon_Pay() {

		amazon_Pay.click();
		
	}
	
}
