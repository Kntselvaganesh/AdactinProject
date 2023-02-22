package org.adactin.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	public static WebDriver driver;

	public Select_Hotel(WebDriver driver4) {
     driver = driver4;
     PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getSelect_RadioBtn() {
		return select_RadioBtn;
	}

	public WebElement getContinue_Btn() {
		return continue_Btn;
	}

	public WebElement getCancel_Btn() {
		return cancel_Btn;
	}

	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement select_RadioBtn;
	
	@FindBy(xpath="//input[@name='continue']")
	private WebElement continue_Btn;
	
	@FindBy(xpath="//input[@name='cancel']")
	private WebElement cancel_Btn;
	
}
