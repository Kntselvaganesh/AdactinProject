package org.adactin.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
public WebDriver driver;
	
	public Home_Page(WebDriver driver2) {
     driver = driver2;
     PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin_btn() {
		return login_btn;
	}

	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@name='login']")
	private WebElement login_btn;
	
	
	
	
	
	
	
	
	
	
	
	
}
