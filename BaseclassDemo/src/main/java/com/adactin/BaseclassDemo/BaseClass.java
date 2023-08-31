package com.adactin.BaseclassDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	//Method Creation to launch the browser
	public static WebDriver browserLauncher(String browserName) {
		 if (browserName.equalsIgnoreCase("chrome")) {
	            WebDriverManager.chromedriver().setup();
	            driver = new ChromeDriver();
		 }
		 else if (browserName.equalsIgnoreCase("firefox")) {
			 WebDriverManager.chromedriver().setup();
			 driver = new FirefoxDriver();
		 }
		 driver.manage().window().maximize();
		 
		 return driver;
	}
	
	//Method Creation to click on web Elements
	public static void  clicOnThelement(WebElement element) {
		element.click();
	}
	
	//Method Creation for passing sendKeys
	public static void inputValueElement(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	//Method Creation for navigating to the URL
	public static  WebDriver getUrl(String url) {
		driver.get(url);
		return driver;
		
		
	}
}
