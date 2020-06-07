

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Keyword {
	/**
	 * This method is used to get WebElement from DOM.
	 * @param locaterType
	 * @param LocatorValue
	 * @return WebElement
	 * @author Punam Shirsath
	 */
	public static WebElement getWebElement(String locaterType,String LocatorValue) {
		WebElement element=null;
		
		switch(locaterType)
		{
		case"XPATH":
			
			element=Constant.driver.findElement(By.xpath(LocatorValue));
			break;
		case"CSS":
			element=Constant.driver.findElement(By.cssSelector(LocatorValue));
			break;
		case"ID":
			element=Constant.driver.findElement(By.cssSelector(LocatorValue));
			break;
		case"LINKTEXT":
			element=Constant.driver.findElement(By.linkText(LocatorValue));
			break;
		case"PARTIAL_LINKTEXT":
			element=Constant.driver.findElement(By.partialLinkText(LocatorValue));
			break;
		default:
			System.out.println("Invalid LOcatorType: "+locaterType+". Expected XPATH,CSS,ID,LINKTEXT,PARTIAL_LINKTEXT");
		}
		return element;
	}
	
	
	
	
    /**
     * This Method is used to Launch Specified Browser.
     * @param browserName
     * @author Punam Shirsath
     */
	public static void openBrowser(String browserName) {
		
		switch(browserName)
		{
		case"Chrome":
			WebDriverManager.chromedriver().setup();
			Constant.driver = new ChromeDriver(); 
			break;
		case"Firefox":
			WebDriverManager.firefoxdriver().setup();
			Constant.driver=new FirefoxDriver();
			break;
		default:
			System.out.println("Invalid browserName: "+browserName);
		}
	}
	
	
	/**
	 * This method is to open specified URL in Specified Browser.
	 * @param url
	 * @@author Punam Shirsath
	 */
	public static  void openURL(String url)
	{
		Constant.driver.get(url);
	}
	
	
	
	/**
	 * This method is used to pass text for search box WebElement.
	 * @param locaterType
	 * @param LocatorValue
	 * @param textToEnter
	 * @author Manisha Kale
	 */
	public static void enterText(String locaterType,String LocatorValue,String textToEnter) {
		
		getWebElement(locaterType, LocatorValue).sendKeys(textToEnter);
  
	}
	
	

    /**
     * This method is used to click for specific WebElement.
     * @param locaterType
     * @param LocatorValue
     * @author Manisha Kale
     */
	public static void clickOnElement(String locaterType,String LocatorValue) {
         getWebElement(locaterType, LocatorValue).click();

	}
	
	
	/**
	 * This method is used to Select Value from Dropdown.
	 * @param locaterType
	 * @param LocatorValue
	 * @param textToselect
	 * @author Punam Shirsath
	 */
	public static void selectValue(String locaterType,String LocatorValue,String textToselect) {
		WebElement element=getWebElement(locaterType, LocatorValue);

		Select select=new Select (element);
		select.selectByVisibleText(textToselect);

	}
	
	
	

    /**
     * This method is used to Apply Implicit wait for specific WebElement.
     * @param locatorValue
     * @param locaterType
     * @return WebElement
     * @author Manisha Kale
     */
	public static Timeouts   implicit_Wait(long locatorValue,String locaterType) {
		Timeouts element=null;
		switch(locaterType)
		{
		case"DAYS":
			
			element=Constant.driver.manage().timeouts().implicitlyWait(locatorValue,TimeUnit.DAYS);
			break;
		case"HOURS":
			element=Constant.driver.manage().timeouts().implicitlyWait(locatorValue,TimeUnit.HOURS);
			break;
		case"MICROSECONDS":
			element=Constant.driver.manage().timeouts().implicitlyWait(locatorValue,TimeUnit.MICROSECONDS);
			break;
		case"MILLISECONDS":
			element=Constant.driver.manage().timeouts().implicitlyWait(locatorValue,TimeUnit.MILLISECONDS);
			break;
		case"MINUTES":
			element=Constant.driver.manage().timeouts().implicitlyWait(locatorValue,TimeUnit.MINUTES);
			break;
		case"NANOSECONDS":
			element=Constant.driver.manage().timeouts().implicitlyWait(locatorValue,TimeUnit.NANOSECONDS);
			break;
		case"SECONDS":
			element=Constant.driver.manage().timeouts().implicitlyWait(locatorValue,TimeUnit.SECONDS);
			break;
		
		default:
			System.out.println("Invalid LOcatorType: "+locaterType+". Expected DAYS,HOURS,MICROSECONDS,MILLISECONDS,MINUTES,NANOSECONDS,SECONDS");
		}
		
		return element;
	
	}
	
	
	/**
	 * This method is used to capture screenshot and save file with Date-Time Format with Specific Extension
	 * @param fileName
	 * @param extension
	 * @throws IOException
	 * @author Manisha Kale
	 */
	public static void captureScreenshot(String fileName,String extension)throws IOException
	{

	// Take the screenshot and store as file format
	File scrFile = ((TakesScreenshot)Constant.driver).getScreenshotAs(OutputType.FILE);

		DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss");
	    Calendar cal = Calendar.getInstance();
	    String cal1 = dateFormat.format(cal.getTime());

	//Copy the screenshot on the desire location with different name using current date and time
	FileUtils.copyFile(scrFile, new File("D:/WorkSapce/Keyword/shots/" + fileName+" "+cal1+extension));
	}
	
	
	/**
	 * This method is used for Add logger
	 * @param locaterType
	 * @author Manisha Kale
	 */
	public static  void logger_add(String locaterType) {
	         Logger logger=Logger.getLogger("Keyword");
	       // configure log4j properties file
	       PropertyConfigurator.configure("Log4j.properties");
	       logger.info(locaterType);

	}
	
	/*
	 * This method is used forRead Json File And get Expected Result.
	 * @Author Manisha Kale                                                                                                                                                                                                                                                                                                                                                       
	 */
	public static 	List<String> readJsonFile(String filePATH) throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		Object unitsObj = parser.parse(new FileReader(filePATH));
		JSONObject unitsJson = (JSONObject) unitsObj;
		List<String> expectedResult = new ArrayList();
		JSONArray units = (JSONArray) unitsJson.get("Mobile accessories");
		String s[]=new String[units.size()];
		int i=0;
		for(i=0;i<units.size();i++) {
				 s[i]=(String) units.get(i);
				 
				System.out.println(s.length);
			}
			//System.out.println(s.length);
			
	for(int k=0;k<units.size();k++)
	{
		expectedResult.add(k, s[k]);
		System.out.println(expectedResult.size());
		}
			
	System.out.println(expectedResult);
	return expectedResult;

	}
	
	/*
	 * This method is used for get List Value from web element reurn the Actual Result.
	 * @Author Manisha Kale                                                                                                                                                                                                                                                                                                                                                       
	 */
	public static   List<String> listValueSelect(String locaterType, String LocatorValue) {
		List<WebElement> liList = null;
		
		switch(locaterType)
		{
		case"XPATH":
			
			liList= Constant.driver.findElements(By.xpath(LocatorValue));
			break;
		case"CSS":
			liList=  Constant.driver.findElements(By.cssSelector(LocatorValue));
			break;
       //case"ID":
		//	 liList= Constant.driver.findElement(By.id(LocatorValue));
		 //  break;
		//case"LINKTEXT":
		   //  liList=Constant.driver.findElement(By.linkText(LocatorValue));
			//break;
	//case"PARTIAL_LINKTEXT":
	//	liList= Constant.driver.findElement(By.partialLinkText(LocatorValue));
		//break;
		default:
			System.out.println("Invalid LOcatorType: "+locaterType+". Expected XPATH,CSS,ID,LINKTEXT,PARTIAL_LINKTEXT");
		}
		ArrayList<String> actualResult = new ArrayList<String>();
	
		Iterator<WebElement> itr= liList.iterator();
		while(itr.hasNext())
		{
			actualResult.add(itr.next().getText());
			System.out.println(actualResult.size());
		}
		System.out.println(liList);
		return actualResult;
	}
	
	
	
	/**
	 * This method is used to maximize Window.
	 * @author Punam Shirsath
	 */
	public static void maximize_Window()
	{
	Constant.driver.manage().window().maximize();

	}
	
	
	/*
	 * This method is used to move Mouse Over particular WebElement.
	 * @Author Manisha Kale                                                                                                                                                                                                                                                                                                                                                       
	 */
	public static void moveToElement(String locatorType, String locatorValue) {
		Constant.action= new Actions(Constant.driver);
		Constant.action.moveToElement(getWebElement(locatorType,locatorValue));
		Constant.action.perform();
			
	}
	
	
	/*
	 * This method is used for Close Browser.
	 * @Author Nishant Choudhari                                                                                                                                                                                                                                                                                                                                                       
	 */
	public static void closeBrowser() {
		Constant.driver.close();
	}
	
	
	/*
	 * This method is used for Close All Browser Window opened by Webdriver Instance.
	 * @Author Punam Shirsath                                                                                                                                                                                                                                                                                                                                                        
	 */
	public static void closeAllBrowsers() {
		Constant.driver.quit();

	}
	
	/*
	 * This method is used to Check is Alert is Present or not if Present then close.
	 * @Author Nishant Choudhari                                                                                                                                                                                                                                                                                                                                                       
	 */
public static boolean isAlertPresent() {
		
		try {
			Constant.driver.switchTo().alert().accept();
			return true;
			
		} catch (Exception e) {
			System.out.println("Exception occurs");
			return false;
			
		}
		
	}

/*
 * This method is used to handle window.
 * @Author Nishant Choudhari                                                                                                                                                                                                                                                                                                                                                       
 */
public static void windowHandle() {
	String parentwindow=Constant.driver.getWindowHandle();
	Set<String> allkeys=Constant.driver.getWindowHandles();
	for(String child: allkeys) {
		while(!parentwindow.equals(child)) {
			Constant.driver.switchTo().window(child);
		}
	}
	
}

}
