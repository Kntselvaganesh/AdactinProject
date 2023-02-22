package org.adactin.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm_Page {
public static WebDriver driver;
	public Confirm_Page(WebDriver driver7) {
		driver = driver7;
		PageFactory.initElements(driver, this);
	}

	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getItinerary_Btn() {
		return itinerary_Btn;
	}

	public WebElement getLogout_Btn() {
		return logout_Btn;
	}

	public WebElement getSearch_HotelBtn() {
		return search_HotelBtn;
	}

	@FindBy(xpath="//input[@name='my_itinerary']")
	private WebElement itinerary_Btn;
	
	@FindBy(xpath="//input[@name='logout']")
	private WebElement logout_Btn;
	
	@FindBy(xpath="//input[@name='search_hotel']")
	private WebElement search_HotelBtn;
}
