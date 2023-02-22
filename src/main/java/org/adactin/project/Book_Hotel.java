package org.adactin.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {

	public static WebDriver driver;
	public Book_Hotel(WebDriver driver5) {

		driver = driver5;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@name='first_name']")
	private WebElement first_Name;
	
	
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement last_Name;
	
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement billing_Address;
	
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement credit_Card;
	
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement creditcard_Type;
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement exp_Mnth;
	
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement exp_Year;
	
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement cvv;
	
	@FindBy(xpath="//input[@name='book_now']")
	private WebElement booknow_Btn;
	
	@FindBy(xpath="//input[@name='cancel']")
	private WebElement cancel_Btn;
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirst_Name() {
		return first_Name;
	}

	public WebElement getLast_Name() {
		return last_Name;
	}

	public WebElement getBilling_Address() {
		return billing_Address;
	}

	public WebElement getCredit_Card() {
		return credit_Card;
	}

	public WebElement getCreditcard_Type() {
		return creditcard_Type;
	}

	public WebElement getExp_Mnth() {
		return exp_Mnth;
	}

	public WebElement getExp_Year() {
		return exp_Year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknow_Btn() {
		return booknow_Btn;
	}

	public WebElement getCancel_Btn() {
		return cancel_Btn;
	}

	
	
	
}
