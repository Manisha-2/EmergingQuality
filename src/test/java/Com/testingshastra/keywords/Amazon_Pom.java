package com.testingshastra.keywords;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Pom {
	
	@FindBy(xpath="//a[contains(text(),'Amazon Pay')]")
	private WebElement amazon_Pay; 
	public Amazon_Pom()
	{
             PageFactory.initElements(Constant.driver, this);
             
	}
public  void click_On_Amazon_Pay() {

		amazon_Pay.click();
		
	}
	
}
