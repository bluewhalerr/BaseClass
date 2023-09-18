package com.SpiceJet.SpiceJet;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	public static WebDriver driver;
	@FindBy(xpath="//div[@data-testid='round-trip-radio-button']")
	private WebElement radio;
	
	@FindBy(xpath="//div[@data-testid='to-testID-origin']")
	private WebElement fromLocation;

	@FindBy(xpath="//div[@data-testid='to-testID-origin']/child::div/following-sibling::div")
	private List<WebElement> list;
	
	@FindBy(xpath="//div[@data-testid='to-testID-destination']/child::div/following-sibling::div")
	private WebElement toLocation;
	
	@FindBy(xpath="//div[@data-testid='to-testID-destination']/child::div/following-sibling::div")
	private List<WebElement> toList;

	public LandingPage(WebDriver driver) {
		LandingPage.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getRadio() {
		return radio;
	}
	public WebElement getFromLocation() {
		return fromLocation;
	}
	
	public WebElement getList() {
		String select ="Bengaluru";
		for(WebElement elements : list) {
			String options = elements.getText();
			if(options.contains(select)) {
				elements.click();
				break;
			}
		}
		return fromLocation;
				
	}
	public WebElement getToLocation() {
		return toLocation;
	}
	
	public WebElement getToList() {
		String select ="Bengaluru";
		for(WebElement elements : toList) {
			String options = elements.getText();
			if(options.contains(select)) {
				elements.click();
				break;
			}
		}
		return toLocation;		
	}

}
