package stepDefs;

import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import utils.SeleniumSupport;
import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ImanageLoginStepDefination {

	@Given("^I want to login into imanage with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_want_to_login_into_imanage_with(final String companyId, final String employeeId, final String password)
			throws Throwable {
		SeleniumSupport.driver.findElement(By.xpath("//input[@name='COMPANY']")).sendKeys("Infrasoft");
		SeleniumSupport.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SeleniumSupport.driver.findElement(By.xpath("//input[@name='USERID']")).clear();
		SeleniumSupport.driver.findElement(By.xpath("//input[@name='USERID']")).sendKeys("EP3372");
		SeleniumSupport.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SeleniumSupport.driver.findElement(By.xpath("//input[@name='PASSWORD']")).clear();
		SeleniumSupport.driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("Infra#123");
		SeleniumSupport.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Inside given condition");
		Wait<WebDriver> wait = new FluentWait<WebDriver>(SeleniumSupport.driver).withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(20, TimeUnit.NANOSECONDS).ignoring(NoSuchElementException.class);
		WebElement ele = wait.until(new Function<WebDriver, WebElement>() {
			@Override
			public WebElement apply(WebDriver arg0) {
				return arg0.findElement(By.xpath("//input[@name='PASSWORD']"));
			}
		});
		
		
		byte[] arr = ((TakesScreenshot) SeleniumSupport.driver).getScreenshotAs(OutputType.BYTES);
//		scenario.embed(arr, "image/png");
		
		Actions actions = new Actions(SeleniumSupport.driver);
		actions.clickAndHold(ele).build().perform();
	}

	@When("^click on the submit button$")
	public void click_on_the_submit_button() throws Throwable {
		WebElement element = SeleniumSupport.driver.findElement(By.xpath("//input[@name='BTNSUBMIT']"));// .click();
		WebDriverWait wait = new WebDriverWait(SeleniumSupport.driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		JavascriptExecutor executor = (JavascriptExecutor) SeleniumSupport.driver;
		executor.executeScript("arguments[0].click()", element);
		System.out.println("Inside when  condition");
	}

	@Then("^I will validate the succesful login$")
	public void i_will_validate_the_succesful_login() throws Throwable {
		System.out.println("Inside vaidate condition");
	}

	@Then("^check more outcomes$")
	public void check_more_outcomes() throws Throwable {
		System.out.println("Inside and condition");
	}
}
