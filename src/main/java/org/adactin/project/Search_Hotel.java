package org.adactin.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	public static WebDriver driver;

	public Search_Hotel(WebDriver driver3) {
		driver = driver3;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//select[@name='location']")
	private WebElement location;
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_Type() {
		return room_Type;
	}

	public WebElement getRoom_Nos() {
		return room_Nos;
	}

	public WebElement getCheck_In() {
		return check_In;
	}

	public WebElement getCheck_Out() {
		return check_Out;
	}

	public WebElement getAdult_Room() {
		return adult_Room;
	}

	public WebElement getChild_Room() {
		return child_Room;
	}

	public WebElement getSubmit_Btn() {
		return submit_Btn;
	}

	public WebElement getReset_Btn() {
		return reset_Btn;
	}

	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotels;
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement room_Type;
	
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement room_Nos;
	
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement check_In;
	
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement check_Out;
	
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adult_Room;
	
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement child_Room;
	
	@FindBy(xpath="//input[@name='Submit']")
	private WebElement submit_Btn;
	
	@FindBy(xpath="//input[@name='Reset']")
    private WebElement reset_Btn;	
}
