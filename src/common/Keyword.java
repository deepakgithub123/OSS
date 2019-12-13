package common;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Keyword extends Xls_Reader{

	public Keyword(String path6) throws IOException {
		super(path6);
		// TODO Auto-generated constructor stub
	}

	public static WebDriver product;

	public void open_Browser(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("Firefox")) {
				String url = System.getProperty("user.dir") + "\\src\\Browsers_drivers\\geckodriver.exe";
				String driverPath = System.setProperty("webdriver.gecko.driver", url);
				setProduct(new FirefoxDriver());
			} else if (browserName.equalsIgnoreCase("chrome")) {
				/*
				 * String url = System.getProperty("user.dir")+
				 * "\\src\\Browsers_drivers\\chromedriver.exe";
				 */
				String url = System.getProperty("user.dir") + "\\src\\Browser\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", url);
				setProduct(new ChromeDriver());
				getProduct().manage().window().maximize();
				getProduct().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			} else if (browserName.equalsIgnoreCase("IE")) {
				String url = System.getProperty("user.dir") + "\\src\\Browsers_drivers\\IEDriverServer.exe";
				System.setProperty("webdriver.ie.driver", url);
				setProduct(new InternetExplorerDriver());
			}
		} catch (WebDriverException e) {
			System.out.println(e.getMessage());
		}
	}

	public String enter_URL(String URL) {
		getProduct().navigate().to(URL);
		String actualUrl = getProduct().getCurrentUrl();
		return actualUrl;

	}

	public By locatorValue(String locatorType, String value) {

		By by;
		switch (locatorType) {
		case "id":

			by = By.id(value);
			break;
		case "name":
			by = By.name(value);
			break;
		case "xpath":

			by = By.xpath(value);
			break;
		case "css":
			by = By.cssSelector(value);
			break;
		case "linkText":
			by = By.linkText(value);
			break;
		case "partialLinkText":
			by = By.partialLinkText(value);
			break;
		default:
			by = null;
			break;
		}
		/* System.out.println(by); */
		return by;
	}

	public String input_data(String locatorType, String value, String passValue) {
		WebDriverWait wait = new WebDriverWait(product, 30);
		String returnTxt = null;
		try {
			By locator;
			locator = locatorValue(locatorType, value);
			wait.until(ExpectedConditions.elementToBeClickable(locator));
			getProduct().findElement(locator).sendKeys(passValue);
			returnTxt = getProduct().findElement(locator).getText();
		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to enter text" + e);
		}

		return returnTxt;
	}
		
	public String getText(String locatorType, String value) {
		WebDriverWait wait = new WebDriverWait(product, 30);
		String returnTxt = null;
		try {
			By locator;
			locator = locatorValue(locatorType, value);
			returnTxt = getProduct().findElement(locator).getText();
		} catch (NoSuchElementException e) {
				System.err.format("No Element Found to enter text" + e);
			}
		return returnTxt;
	}
	
	public String getTitle() {
		WebDriverWait wait = new WebDriverWait(product, 30);
		String returnTxt = null;
		returnTxt = getProduct().getTitle();
		return returnTxt;
	}
	
	
	public String getURL() {
		WebDriverWait wait = new WebDriverWait(product, 30);
		String returnTxt = null;
		returnTxt = getProduct().getCurrentUrl();
		return returnTxt;
	}
	

	public void click_On_Link(String locatorType, String value) {
		try {
			By locator;
			locator = locatorValue(locatorType, value);
			WebElement element = getProduct().findElement(locator);
			element.click();
		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to enter text" + e);
		}
	}

	public void click_On_Button(String locatorType, String value) {
		WebDriverWait wait = new WebDriverWait(product, 30);
		try {
			By locator;
			locator = locatorValue(locatorType, value);
			wait.until(ExpectedConditions.elementToBeClickable(locator));
			WebElement element = getProduct().findElement(locator);
			element.click();
		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to perform click" + e);
		}
	}
	
	public void click_On_Checkbox(String locatorType, String value) {
		try {
			By locator;
			locator = locatorValue(locatorType, value);
			WebElement element = getProduct().findElement(locator);
			element.click();
		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to perform check" + e);
		}
	}


	public void close_Browser() {
		getProduct().quit();
	}

	public static WebDriver getProduct() {
		return product;
	}

	public static void setProduct(WebDriver product) {
		Keyword.product = product;
	}
	
	public void waitForElementPresence(String locatorType, String value, int timeout) //wait for the presence of the element
	{
		WebDriverWait wait = new WebDriverWait(product, timeout);
		By locator;
		locator = locatorValue(locatorType, value);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}	
}
