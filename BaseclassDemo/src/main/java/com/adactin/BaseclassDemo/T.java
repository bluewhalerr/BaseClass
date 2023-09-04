package com.adactin.BaseclassDemo;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T extends BaseClass {

	public static WebDriver driver;

	public static void main(String[] args) throws AWTException {
		driver = browserLauncher("Chrome");// Browser Launch
//
//		driver = getUrl("https://www.selenium.dev/");// Navigate to the URL
//
//		WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Documentation')]"));
//		clicOnThelement(ele);// click on the element
//
//		String url = currentUrl();// getting current URL
//
//		System.out.println(url);
//
//		String title = titleOfWebpage();// Getting the Title of the webpage
//
//		System.out.println(title);
//
//		WebElement text = driver.findElement(By.xpath("//a[text()='freely available']")); // getting web element text
//		String txt = webText(text);
//
//		System.out.println(txt);
//
//		WebElement element = driver.findElement(By.xpath("//a[text()='freely available']"));// getting web element
//																							// attribute
//		String att = webAttribute(element, "href");
//		System.out.println(att);
//		
//		//Navigate Methods
//		toNavigate("https://www.selenium.dev/documentation/webdriver/");//Navigate using URL
//		
//		backNavigate();
//		
//		forwardNavigate();
//		
//		refreshNavigate();
//		
//		//Actions Methods
//		WebElement contextClick = driver.findElement(By.xpath("//a[text()='Documentation']"));
//		actionClass(contextClick);//Right click to webelement
//		
//		keyboardKeysPress();//Press & Release down and enter the keyboard keys
//		
//		WebElement contextClickW3C = driver.findElement(By.xpath("//a[text()='W3C Recommendation']"));
//		
//		actionClass(contextClickW3C);//Right click to webelement
//		
//		keyboardKeysPress();//Press & Release down and enter the keyboard keys
//		
//		//Window Handeling Methods
//		windowHandlesTitle();
//		windowHandles();//Navigate to the desired window
//		iterationWidowHandling();//Navigate using iterator
		//WebElement down = driver.findElement(By.xpath("//a[text()='Actions API']"));
		
		//JavaScript Executor using coordinates to scroll up and down
//		pageDown();
//		pageUp();
		
		//Js Using WebElement into view
//		WebElement down = driver.findElement(By.xpath("//a[text()='Actions API']"));
//		scrollIntoView(down);
		
		//Actions Class Send Keys
		
//		driver = browserLauncher("Chrome");// Browser Launch
//		driver = getUrl("https://adactinhotelapp.com/");// Navigate to the URL
//		WebElement username = driver.findElement(By.id("username"));
//		sendInput(username,"Ram");
		
		// Implicit wait
//		driver = browserLauncher("Chrome");// Browser Launch
//		driver = getUrl("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");// Navigate to the URL
//		WebElement click = driver.findElement(By.id("populate-text"));
//		clicOnThelement(click);
//		WebElement waitEle = driver.findElement(By.id("h2"));//Applying wait for the implicit web element
//		implicitWait(30);
		
		// Explicit wait
		// explicitWait(30,waitEle);
//		String ActualText = waitEle.getText();
//		String EcpectedText ="Selenium Webdriver";
//		if(ActualText.contains(EcpectedText)) {
//			System.out.println("Success");

		// Frames
		
//		//To find the number of frames in the website
//		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
//		int numberOfFrames = frames.size();
//		System.out.println("Number of Frames: " + numberOfFrames);
//		WebElement e = framesWindows(-1, "aw0", null);
//		e.click();
//		}
		
		driver = getUrl("https://www.selenium.dev/");// Navigate to the URL
	}

}
