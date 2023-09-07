package com.adactin.BaseclassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pom.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunnerClass extends BaseClass {
	public static WebDriver driver = BaseClass.browserLauncher("Chrome");//Extended class name .Method()

	public static void main(String[] args) {

		// 1 To launch the browser

//driver=browserLauncher("Chrome");

		LoginPage lp = new LoginPage(driver);

		// WebDriverManager.chromedriver().setup();

		// driver = new ChromeDriver();

		// .manage().window().maximize();

		// Navigate to the Adactin website
		driver = getUrl("https://adactinhotelapp.com/");
		// driver.get("https://adactinhotelapp.com/");

		// 2 To Enter the Username
		// WebElement username = driver.findElement(By.id("username"));

		inputValueElement(lp.getUserName(), "CharanTheja");// Method called from baseclass

		// 3 To Enter the Password
		// WebElement password = driver.findElement(By.id("password"));

		inputValueElement(lp.getPassword(), "123456789");// Method called from baseclass

		// 4 To click on login
		// WebElement loginbtn = driver.findElement(By.id("login"));

		// loginbtn.click();
		clicOnThelement(lp.getLogin()); // Method called from baseclass
	}

}
