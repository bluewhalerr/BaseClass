package com.adactin.BaseclassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunnerClass extends BaseClass {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		//1 To launch the browser
		
		driver=browserLauncher("Chrome");
		
		//WebDriverManager.chromedriver().setup();

		//driver = new ChromeDriver();

		//.manage().window().maximize();
		
		//Navigate to the Adactin website
		driver= getUrl("https://adactinhotelapp.com/");
		//driver.get("https://adactinhotelapp.com/");
		
		//2 To Enter the Username
		WebElement username = driver.findElement(By.id("username"));
		
		inputValueElement(username, "CharanTheja");// Method called from baseclass
		
		//3 To Enter the Password
		WebElement password = driver.findElement(By.id("password"));
		
		inputValueElement(password, "123456789");// Method called from baseclass
		
		//4 To click on login
		WebElement loginbtn = driver.findElement(By.id("login"));
		
		//loginbtn.click();
		clicOnThelement(loginbtn); // Method called from baseclass
	}

}
