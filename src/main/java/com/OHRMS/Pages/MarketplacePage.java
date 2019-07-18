package com.OHRMS.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OHRMS.baseclass.Baseclass;

public class MarketplacePage extends Baseclass {

	public MarketplacePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id='MP_btn']/input[@class='button']")
	WebElement marketplace;
	

}
