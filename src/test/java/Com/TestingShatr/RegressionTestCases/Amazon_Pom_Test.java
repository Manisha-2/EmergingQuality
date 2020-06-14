package Com.TestingShatr.RegressionTestCases;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testingshastra.keywords.Amazon_Pom;
import com.testingshastra.keywords.Constant;
import com.testingshastra.keywords.Keyword;

public class Amazon_Pom_Test {
	static Amazon_Pom ap=new Amazon_Pom();
	@BeforeTest
	public void tc_01() {
		Keyword.openBrowser("Chrome");
	}
	@Test
	public void tc_02() {
		Keyword.openURL("https://www.amazon.in/");
		String Actual=Constant.driver.getCurrentUrl();
		String Expected="https://www.amazon.in/";
		System.out.println(Actual);
		Assert.assertEquals(Actual,Expected);
	}
	
	@Test
public static void tc_03() throws InterruptedException {
	ap=PageFactory.initElements(Constant.driver, Amazon_Pom.class);
	
	ap.click_On_Amazon_Pay();
	Keyword.windowHandle1(0);
	Thread.sleep(1000);
	String actual=Constant.driver.getTitle();
	
	System.out.println(actual);
	String expected="Amazon Pay";
	Assert.assertEquals(actual, expected);
	

}

}
