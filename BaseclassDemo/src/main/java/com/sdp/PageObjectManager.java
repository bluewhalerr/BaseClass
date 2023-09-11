package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.BookHotelPage;
import com.pom.LoginPage;
import com.pom.SearchHotelPage;
import com.pom.SelecHotelPage;

public class PageObjectManager {
	
	public static WebDriver driver;
	
	private LoginPage lp;
	private SearchHotelPage sp;
	private SelecHotelPage shp;
	private BookHotelPage bhp;
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	public LoginPage getLp() {
		lp = new LoginPage(driver);
		return lp;
	}
	
	public SearchHotelPage getSp() {
		sp = new SearchHotelPage(driver);
		return sp;
	}
	
	public SelecHotelPage getShp() {
		shp = new SelecHotelPage(driver);
		return shp;
	}
	public BookHotelPage getBhp() {
		bhp = new BookHotelPage(driver);
		return bhp;
	}
}
