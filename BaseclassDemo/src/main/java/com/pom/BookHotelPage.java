package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage {

	public static WebDriver driver;

	@FindBy(id = "first_name")
	private WebElement firstName;

	@FindBy(id = "last_name")
	private WebElement lastName;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement card;
	
	@FindBy(id="cc_type")
	private WebElement cardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement expMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement expYear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvvNum;
	
	@FindBy(id="book_now")
	private WebElement bookNow;

	// Creating A constructor
	public BookHotelPage(WebDriver driver) {
		BookHotelPage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName() {
		return firstName;
	}
	
	public WebElement getLastName() {
		return lastName;
	}
	
	public WebElement getAddress() {
		return address;
	}
	
	public WebElement getCardNumber() {
		return card;
	}
	public WebElement getCardType() {
		return cardType;
	}
	public WebElement getExpMonth() {
		return expMonth;
	}
	public WebElement getExpYear() {
		return expYear;
	}
	
	public WebElement getCvvNum() {
		return cvvNum;
	}
	public WebElement getBookNow() {
		return bookNow;
	}
}
