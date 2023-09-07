package com.adactin.BaseclassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pom.LoginPage;
import com.pom.SearchHotelPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunnerClass extends BaseClass {
	public static WebDriver driver = BaseClass.browserLauncher("Chrome");//Extended class name .Method()

	public static void main(String[] args) {

		// 1 To launch the browser

//driver=browserLauncher("Chrome");
		
		//Class created to call the Inspected WebElement and use its method from the Pages Class
		LoginPage lp = new LoginPage(driver);
		SearchHotelPage sp = new SearchHotelPage(driver);

		// WebDriverManager.chromedriver().setup();

		// driver = new ChromeDriver();

		// .manage().window().maximize();
		
		//LOGIN PAGE
		//2 Navigate to the Adactin website
		driver = getUrl("https://adactinhotelapp.com/");
		// driver.get("https://adactinhotelapp.com/");

		// 3 To Enter the Username
		// WebElement username = driver.findElement(By.id("username"));

		inputValueElement(lp.getUserName(), "CharanTheja");// Method called from baseclass

		// 4 To Enter the Password
		// WebElement password = driver.findElement(By.id("password"));

		inputValueElement(lp.getPassword(), "123456789");// Method called from baseclass

		// 5 To click on login
		// WebElement loginbtn = driver.findElement(By.id("login"));

		// loginbtn.click();
		clicOnThelement(lp.getLogin()); // Method called from baseclass
		
		//IN SEARCH HOTEL PAGE
		
		//6 Location Dropdown 
		dropDown(sp.getLocation(), "byVisibleText", "London");
		
		//Hotel Dropdown
		dropDown(sp.getHotel(),  "byVisibleText", "Hotel Sunshine");
		
		
	}

}
