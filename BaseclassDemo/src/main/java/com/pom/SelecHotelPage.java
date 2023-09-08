package com.pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelecHotelPage {
	public static WebDriver driver;//WebDriver of the This Page class,By initially it is Null
	
	@FindBy(xpath = "//input[contains(@type,'radio')]")
	private WebElement selectHotel;
	
	@FindBy(id="continue")
	private WebElement continueBtn;

	//Creating constructor
	public SelecHotelPage(WebDriver driver) {
		SelecHotelPage.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public WebElement selectHotel() {
		return selectHotel;
	}
	
	public WebElement getContinueBtn() {
		return continueBtn;
	}
}
