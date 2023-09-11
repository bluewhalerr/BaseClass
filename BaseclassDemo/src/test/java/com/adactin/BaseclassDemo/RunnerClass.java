package com.adactin.BaseclassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pom.BookHotelPage;
import com.pom.LoginPage;
import com.pom.SearchHotelPage;
import com.pom.SelecHotelPage;
import com.sdp.PageObjectManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunnerClass extends BaseClass {
	public static WebDriver driver = BaseClass.browserLauncher("Chrome");//Extended class name .Method()

	public static void main(String[] args) {

		// 1 To launch the browser

//driver=browserLauncher("Chrome");
		
		//Class created to call the Inspected WebElement and use its method from the Pages Class
		//LoginPage lp = new LoginPage(driver);
		//SearchHotelPage sp = new SearchHotelPage(driver);
		//SelecHotelPage shp = new SelecHotelPage(driver);
		//BookHotelPage bhp = new BookHotelPage(driver);
		// WebDriverManager.chromedriver().setup();

		// driver = new ChromeDriver();

		// .manage().window().maximize();
		PageObjectManager pom = new PageObjectManager(driver);
		
		//LOGIN PAGE
		//2 Navigate to the Adactin website
		driver = getUrl("https://adactinhotelapp.com/");
		// driver.get("https://adactinhotelapp.com/");

		// 3 To Enter the Username
		// WebElement username = driver.findElement(By.id("username"));

		inputValueElement(pom.getLp().getUserName(), "CharanTheja");// Method called from baseclass

		// 4 To Enter the Password
		// WebElement password = driver.findElement(By.id("password"));

		inputValueElement(pom.getLp().getPassword(), "123456789");// Method called from baseclass

		// 5 To click on login
		// WebElement loginbtn = driver.findElement(By.id("login"));

		// loginbtn.click();
		clicOnThelement(pom.getLp().getLogin()); // Method called from baseclass
		
		//IN SEARCH HOTEL PAGE
		
		//6 Location Dropdown 
		dropDown(pom.getSp().getLocation(), "byVisibleText", "London");
		
		//Hotel Dropdown
		dropDown(pom.getSp().getHotel(),  "byValue", "Hotel Sunshine");
		
		//Room Type DropDown
		dropDown(pom.getSp().getRoom(), "byIndex", "2");
		
		//Number of Rooms
		dropDown(pom.getSp().getRoomNos(), "byVisibleText", "6 - Six");
		
		//Clear the default Date
		inputClear(pom.getSp().getDateIn());
		
		//Room In date
		inputValueElement(pom.getSp().getDateIn(),"10/09/2023");
		
		//Clear the default Date
		inputClear(pom.getSp().getDateOut());
		
		//Room Out Date
		inputValueElement(pom.getSp().getDateOut(), "11/09/2023");
		
		//Adult per Room
		dropDown(pom.getSp().getAdultRoom(), "byVisibleText", "2 - Two");
		
		//Child Per Room
		dropDown(pom.getSp().getChildRoom(), "byVisibleText", "2 - Two");
		
		//Click on Submit Btn
		clicOnThelement(pom.getSp().getSubmitBtn());
		
		//Click on the Radio Btn in the Select Hotel Page
		clickRadoiBtn(pom.getShp().selectHotel());
		
		//Click on Continue Btn
		clicOnThelement(pom.getShp().getContinueBtn());
		
		//BOOK HOTEL PAGE
		
		//Entering FirstName 
		inputValueElement(pom.getBhp().getFirstName(), "Peter");
		
		//Entering LastName 
		inputValueElement(pom.getBhp().getLastName(), "Parker");
		
		//Entering Address
		inputValueElement(pom.getBhp().getAddress(), "101 Baker's Street");
	
		//Entering CardNumber 
		inputValueElement(pom.getBhp().getCardNumber(), "2222333344445555");
		
		//Selecting CardType in BookHotelPage
		dropDown(pom.getBhp().getCardType(), "byVisibleText", "Master Card");
		
		//Selecting Card Expiry Month 
		dropDown(pom.getBhp().getExpMonth(), "byVisibleText", "March");
		
		//Selecting Card Expiry Year 
		dropDown(pom.getBhp().getExpYear(), "byVisibleText", "2012");
		
		//Entering CvvNumber
		inputValueElement(pom.getBhp().getCvvNum(), "123");
		
		//Click on Book Now
		clicOnThelement(pom.getBhp().getBookNow());
	}

}
