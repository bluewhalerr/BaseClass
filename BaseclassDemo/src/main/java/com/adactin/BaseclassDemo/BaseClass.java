package com.adactin.BaseclassDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Actions action;

	// Method Creation to launch the browser
	public static WebDriver browserLauncher(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();

		return driver;
	}

	// Method Creation to click on web Elements
	public static void clicOnThelement(WebElement element) {
		element.click();
	}

	// Method Creation for passing sendKeys
	public static void inputValueElement(WebElement element, String value) {
		element.sendKeys(value);
	}

	// Method Creation for navigating to the URL
	public static WebDriver getUrl(String url) {
		driver.get(url);
		return driver;
	}

	// Method creation for close the browser
	public static WebDriver closeCurrentWindow() {
		driver.close();
		return driver;
	}

	// Method creation for quit the browser
	public static WebDriver quitMultipleWindows() {
		driver.quit();
		return driver;
	}

	// Method creation to get current url
	public static String currentUrl() {
		return driver.getCurrentUrl();
	}

	// Method creation to get title
	public static String titleOfWebpage() {
		return driver.getTitle();
	}

	// Method creation to get text
	public static String webText(WebElement ele) {
		return ele.getText();
	}

	// Method creation to get attribute
	public static String webAttribute(WebElement ele, String attributeName) {
		String attribute = ele.getAttribute(attributeName);
		return attribute;
	}

	// Method creation for explicit wait
	public static void explicitWait(int timeDuration, WebElement ele) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeDuration));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}

	// Method creation for implicit wait
	public static void implicitWait(int timeDuration) {
		driver.manage().timeouts().implicitlyWait(timeDuration, TimeUnit.SECONDS);
	}

	// Method creation for handling frames
	public static WebElement framesWindows(int index, String nameOrId, WebElement ele) {
		if (nameOrId != null && !nameOrId.isEmpty()) {
			driver.switchTo().frame(nameOrId);
		} else if (index >= 0) {
			driver.switchTo().frame(index);
		} else if (ele != null)
			driver.switchTo().frame(ele);
		return null;
	}

	// Method creation for handling Js Alerts
	public static void alertPopUp() {

		driver.switchTo().alert().accept();

	}

	// Method creation for Navigate To
	public static void toNavigate(String url) {

		driver.navigate().to(url);
	}

	// Method creation for Navigate forward
	public static void forwardNavigate() {
		driver.navigate().forward();
	}

	// Method creation for Navigate back
	public static void backNavigate() {
		driver.navigate().back();
	}

	// Method creation for Navigate and refresh
	public static void refreshNavigate() {
		driver.navigate().refresh();
	}

	// Method Creation to perform action-Right Click/context click
	public static void actionClass(WebElement ele) {
		action = new Actions(driver);
		action.contextClick(ele).build().perform();
	}

	// Method Creation to perform action-MoveToElement
//	public static void mouseHovering(WebElement ele) {
//		action = new Actions(driver);
//		action.moveToElement(ele).build().perform();
//	}

	// Method Creation to perform action-Drag&Drop---Method(1)
	public static void dragAndDrop(WebElement from, WebElement to) {
		action = new Actions(driver);
		action.dragAndDrop(from, to).build().perform();
	}

	// Method Creation to perform action-Drag&Drop---Method(2)
	public static void clickHoldAndDrop(WebElement from, WebElement to) {
		action = new Actions(driver);
		action.clickAndHold(from).build().perform();
		action.moveToElement(to).build().perform();
		// action.sendKeys(input).build().perform();
	}

	// Method to send input using actions
	public static void sendInput(WebElement input, String value) {
		action = new Actions(driver);
		action.sendKeys(input, value).build().perform();
	}

	// Method creation for Robot Class
	public static void keyboardKeysPress() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void pageUp() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500)");
	}

	public static void pageDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	}
	public static void scrollIntoView(WebElement element) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView();", element);
	}

	// Method creation for windows handling Using FOR-Each to get the title of the
	// Tabs
	public static void windowHandlesTitle() {
		Set<String> element = driver.getWindowHandles();

		for (String st : element) {
			String title = driver.switchTo().window(st).getTitle();
			System.out.println(title);
		}

	}

	// Method creation for windows handling Using FOR-Each to get the desired TAB
	public static void windowHandles() {
		Set<String> element = driver.getWindowHandles();

		String selenium = "The Selenium Browser Automation Project | Selenium";
		for (String string : element) {
			if (driver.switchTo().window(string).getTitle().contains(selenium)) {
				break;
			}
		}
	}
	// Method creation for windows handling Using ITERATION to get the desired TAB
	public static void iterationWidowHandling() {
		String homeTab = driver.getWindowHandle();//// Storing the current window in a Variable
		Set<String> windowHandels = driver.getWindowHandles();// Storing all window handels
		Iterator<String> childTab = windowHandels.iterator();// Now iterate using Iterator
		while (childTab.hasNext()){
			String selenium = childTab.next();
			String title = "WebDriver | Selenium";
			if(driver.switchTo().window(selenium).getTitle().contains(title)) {
				break;
			}
		}
	}
}
