package org.adactin.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itinerary {
	public Itinerary(WebDriver driver6) {
		driver = driver6;
		PageFactory.initElements(driver, this);

	}

	public static WebDriver driver;

	
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getMy_ItineraryBtn() {
		return my_ItineraryBtn;
	}

	public WebElement getCancel_AllBtn() {
		return cancel_AllBtn;
	}

	public WebElement getLogout_Btn() {
		return logout_Btn;
	}

	public WebElement getSearch_HotelBtn() {
		return search_HotelBtn;
	}

	@FindBy(xpath="//input[@name='check_all']")
	private WebElement my_ItineraryBtn;
	
	@FindBy(xpath="//input[@name='cancelall']")
	private WebElement cancel_AllBtn;
	
	//Alert to accept.
	
	@FindBy(xpath="//input[@name='logout']")
	private WebElement logout_Btn;
	
	@FindBy(xpath="//input[@name='search_hotel']")
	private WebElement search_HotelBtn;
}
