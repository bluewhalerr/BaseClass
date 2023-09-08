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
	
	@FindBy(id="room_type")
	private WebElement room;
	
	@FindBy(id="room_nos")
	private WebElement roomNos;
	
	@FindBy(id="datepick_in")
	private WebElement dateIn;
	
	@FindBy(id = "datepick_out")
	private WebElement dateOut;
	
	@FindBy(id="adult_room")
	private WebElement adultRoom;
	
	@FindBy(id = "child_room")
	private WebElement childRoom;
	
	@FindBy(id="Submit")
	private WebElement submit;
	
	public SearchHotelPage(WebDriver driver) {
		SearchHotelPage.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLocation() {
		return location;
	}
	
	public WebElement getHotel() {
		return hotels;
		
	}
	
	public WebElement getRoom() {
		return room;
	}
	
	public WebElement getRoomNos() {
		return roomNos;
	}
	
	public WebElement getDateIn() {
		return dateIn;
	}
	
	public WebElement getDateOut() {
		return dateOut;
	}
	
	public WebElement getAdultRoom() {
		return adultRoom;
	}
	public WebElement getChildRoom() {
		return childRoom;
	}
	
	public WebElement getSubmitBtn() {
		return submit;
	}
}

