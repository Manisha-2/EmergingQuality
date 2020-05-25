package Com.TestingShatra.Keywords;


import java.io.FileInputStream;
import java.util.Properties;
import java.util.logging.Logger;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import ru.yandex.qatools.ashot.AShot;

public class Constant {
	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream fis;
	public static Select select;
	public static AShot ashot;
	public static Actions action;
	public static JavascriptExecutor jse;
	public static Logger logger;
}
