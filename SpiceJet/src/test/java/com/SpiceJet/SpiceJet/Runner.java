package com.SpiceJet.SpiceJet;

import org.apache.hc.client5.http.impl.classic.MainClientExec;

public class Runner extends B{
	public static void main(String[] args) {
		//Launch the browser
		browserLauncher("Chrome");
		
		//navigate to the Url
		getUrl("https://www.spicejet.com/");
		
		//Click on the radio Btn
		LandingPage lp = new LandingPage(driver);
		clickRadoiBtn(lp.getRadio());
		
		//click on the from textbox and select from the List
		clickOnThelement(lp.getFromLocation());
		
		lp.getList();
		
		implicitWait(30);
		doublClick(lp.getToLocation());
		lp.getToList();
		
		
	}

}
