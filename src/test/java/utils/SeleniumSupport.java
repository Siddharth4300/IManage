/**
 * 
 */
package utils;

import java.io.IOException;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author siddharth.patil
 *
 */
public class SeleniumSupport {
	public static WebDriver driver;

	@BeforeClass
	public static void setupSelenium() throws IOException {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Selenium\\Selenium_Class\\Selenium class\\13_nov_sun\\resources\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://hrms.imanage.in/");
		Runtime.getRuntime().exec("C:\\Users\\siddharth.patil\\Desktop\\AutoIT\\ImanageAuthentication.exe");
	}
}
