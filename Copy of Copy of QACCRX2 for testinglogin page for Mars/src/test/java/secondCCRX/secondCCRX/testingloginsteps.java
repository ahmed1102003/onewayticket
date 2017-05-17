package secondCCRX.secondCCRX;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.TreeSet;

import org.apache.commons.collections.Bag;
import org.apache.commons.collections.bag.HashBag;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;

//import org.apache.commons.codec.binary.StringUtils;

//import org.apache.commons.exec.util.StringUtils;

//import org.apache.commons.exec.util.StringUtils;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Point;
//import org.openqa.selenium.Rectangle;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.server.handler.interactions.MouseMoveToLocation;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testingloginsteps {
 
	
	private static final int waittime = 1000;
	static final int LOAD = 120;
	static WebDriver driver = null;
	private List<WebElement> findElements;
	private long avaragetime;
	private String number2;
	private String loginpass;
	private String emailpass;
	static final Logger log = Logger.getLogger("file3");
	static final Logger logerror = Logger.getLogger("file4");
	

	public void afterScenario() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}


	@Given("^User at login page$")
	// @SuppressWarnings("deprecation")
	public void user_at_login_page() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		//driver = new ChromeDriver();
		driver = new FirefoxDriver();
		//PropertyConfigurator.configure("resources/log4j.properties");
		PropertyConfigurator.configure(this.getClass().getClassLoader().getResource("resources/log4j.properties"));
		logerror.error("for testing the error file log ");
		log.info("for testing the info file log ");
		driver.get("http://localhost:8080/logIn/Home.jsp");
		log.info("Opened CCRX page via IP address");
	}

	
	// This will add value to the field with ID only
	@When("^I enter (.*) in the (.*)$")
	public void I_enter_username_in_the(String username, String filed) throws InterruptedException {
		Thread.sleep(waittime);
		// By id = By.id(xpaths.get(filed));
		// Thread.sleep(waittime);
		WebElement findElement = driver.findElement(By.id(filed));
		findElement.clear();
		findElement.sendKeys(username);
	}

	@When("^I enter (.*) in the (.*) by xpath$")
	public void I_enter_username_in_by_xpath(String username, String filed) throws InterruptedException {
		Thread.sleep(waittime);
		WebElement findElement = driver.findElement(By.xpath(filed));
		findElement.clear();
		findElement.sendKeys(username);
	}

	@When("^I enter (.*) in the (.*) by name$")
	public void I_enter_username_in_by_name(String data, String filed) throws InterruptedException {
		Thread.sleep(waittime);
		WebElement findElement = driver.findElement(By.name(filed));
		findElement.clear();
		findElement.sendKeys(data);
	}

	@When("^I click on (.*) button$")
	public void I_click_on_ID_button(String ID) throws InterruptedException {
		Thread.sleep(waittime);
		By id = By.id(ID);
		// Thread.sleep(1000);
		driver.findElement(By.id(ID)).click();
	}

	@When("^I click on (.*) button by xpath$")
	public void I_click_on_xpath_button(String xpath) throws InterruptedException {
		Thread.sleep(waittime);
		By id = By.xpath(xpath);
		driver.findElement(id).click();
	}

	@When("^wait (.*) seconds$")
	public void wait_for_seconds(int seconds) throws InterruptedException {
		Thread.sleep(seconds * 1000);
	}

	@When("^I click on (.*) button by name$")
	public void I_click_on_Login_button_by_name(String Name) throws InterruptedException {
		Thread.sleep(waittime);
		By id = By.name(Name);
		driver.findElement(By.name(Name)).click();
	}
	
	@Then("^'(.*)' message will display at '(.*)'$")
	public void Check_Messages(String message, String xpath) throws InterruptedException {
		// Thread.sleep(1000);
		By xpath2 = By.xpath(xpath);
		// WebDriverWait wait = new WebDriverWait(driver, LOAD);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("xpath_to_search_textbox")));
		// wait.until(ExpectedConditions.visibilityOfElementLocated(xpath2));
		// Thread.sleep(1000);
		WebElement findElement = driver.findElement(xpath2);
		String text = findElement.getText();
		assertEquals(message, text);
	}
	
	
	@Then("^get the messages '(.*)'$")
	public void get_the_messages(String xpath) {
		// WebDriverWait wait = new WebDriverWait(driver,LOAD);
		By by = By.xpath(xpath);
		this.findElements = driver.findElements(by);
		// driver.switchTo().frame(0);
		System.out.println("Options for drop down list" + this.findElements.size());
		for (WebElement i : this.findElements) {
			String dropdownlistoption = i.getText();
			System.out.println("/" + dropdownlistoption + "|");
		}
	}
	@Then("^the following messages will be displayed$")
	public void the_following_messages_will_be_displayed(String... messages) {
		for (WebElement i : this.findElements) {
			String dropdownlistoption = i.getText();
			System.out.println("|" + dropdownlistoption + "|");
		}
		for (String i : messages) {
			System.out.println("|" + i + "|");
		}
		List<String> list = new ArrayList<String>(Arrays.asList(messages));
		for (WebElement webElement : this.findElements) {
			String actual = webElement.getText().trim();
			if (!StringUtils.isEmpty(actual)) {
				assertTrue(list.size() > 0);
				String excpet = list.remove(0);
				assertEquals(excpet, actual);
			}

		}
		assertEquals(0, list.size());
	}



	@When("^Confrim the message with Welcome$")
	public void Confrim_the_message_with_Welcome() throws Throwable {
		get_the_messages("/html/body/h1");
		the_following_messages_will_be_displayed("Welcome");
	}

	
	@When("^Confrim the message For Test button with Connection Error$")
	public void Confrim_the_message_For_Test_button_with_Connection_Error() throws Throwable {
		get_the_messages("//*[@id=\"tdlaligncenter\"]");
		the_following_messages_will_be_displayed("Connection Error");
	}

}