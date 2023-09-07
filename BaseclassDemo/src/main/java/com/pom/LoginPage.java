package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public static WebDriver driver;//WebDriver of the LoginPage class,By initially it is Null
	
	//Inspected WebElement of the WEB PAGE and it is stored in a variable
	@FindBy(id = "username")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "login")
	private WebElement login;
	
	//For connecting the Login Page Class and the Runner class to use the WebElements Methods of a WebPage in the Runner Class
	
	//So a Constructor is created -Class Name and the Name of the constructor should be same
	public LoginPage(WebDriver driver) {//This is the driver of the LoginPage so we need to connect the Driver of the Login Page and the Runner class driver 
		LoginPage.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//Creating methods for the WebElement
	public WebElement getUserName() {
		return username;
	}
	
	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getLogin() {
		return login;
	}
}