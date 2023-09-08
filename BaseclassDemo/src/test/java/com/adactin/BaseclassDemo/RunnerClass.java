package com.adactin.BaseclassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pom.BookHotelPage;
import com.pom.LoginPage;
import com.pom.SearchHotelPage;
import com.pom.SelecHotelPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunnerClass extends BaseClass {
	public static WebDriver driver = BaseClass.browserLauncher("Chrome");//Extended class name .Method()

	public static void main(String[] args) {

		// 1 To launch the browser

//driver=browserLauncher("Chrome");
		
		//Class created to call the Inspected WebElement and use its method from the Pages Class
		LoginPage lp = new LoginPage(driver);
		SearchHotelPage sp = new SearchHotelPage(driver);
		SelecHotelPage shp = new SelecHotelPage(driver);
		BookHotelPage bhp = new BookHotelPage(driver);
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
		dropDown(sp.getHotel(),  "byValue", "Hotel Sunshine");
		
		//Room Type DropDown
		dropDown(sp.getRoom(), "byIndex", "2");
		
		//Number of Rooms
		dropDown(sp.getRoomNos(), "byVisibleText", "6 - Six");
		
		//Clear the default Date
		inputClear(sp.getDateIn());
		
		//Room In date
		inputValueElement(sp.getDateIn(),"10/09/2023");
		
		//Clear the default Date
		inputClear(sp.getDateOut());
		
		//Room Out Date
		inputValueElement(sp.getDateOut(), "11/09/2023");
		
		//Adult per Room
		dropDown(sp.getAdultRoom(), "byVisibleText", "2 - Two");
		
		//Child Per Room
		dropDown(sp.getChildRoom(), "byVisibleText", "2 - Two");
		
		//Click on Submit Btn
		clicOnThelement(sp.getSubmitBtn());
		
		//Click on the Radio Btn in the Select Hotel Page
		clickRadoiBtn(shp.selectHotel());
		
		//Click on Continue Btn
		clicOnThelement(shp.getContinueBtn());
		
		//BOOK HOTEL PAGE
		
		//Entering FirstName 
		inputValueElement(bhp.getFirstName(), "Peter");
		
		//Entering LastName 
		inputValueElement(bhp.getLastName(), "Parker");
		
		//Entering Address
		inputValueElement(bhp.getAddress(), "101 Baker's Street");
	
		//Entering CardNumber 
		inputValueElement(bhp.getCardNumber(), "2222333344445555");
		
		//Selecting CardType in BookHotelPage
		dropDown(bhp.getCardType(), "byVisibleText", "Master Card");
		
		//Selecting Card Expiry Month 
		dropDown(bhp.getExpMonth(), "byVisibleText", "March");
		
		//Selecting Card Expiry Year 
		dropDown(bhp.getExpYear(), "byVisibleText", "2012");
		
		//Entering CvvNumber
		inputValueElement(bhp.getCvvNum(), "123");
		
		//Click on Book Now
		clicOnThelement(bhp.getBookNow());
	}

}
