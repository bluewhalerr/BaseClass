package com.pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SearchHotelPage {
	public static WebDriver driver;//WebDriver of the This Page class,By initially it is Null
	
	@FindBy(id = "location")
	private WebElement location;
	
	@FindBy(id = "hotels")
	private WebElement hotels;
	
	public SearchHotelPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLocation() {
		return location;
	}
	
	public WebElement getHotel() {
		return hotels;
		
	}
}

