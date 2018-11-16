package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepage {
	WebDriver driver;
	@FindBy(linkText="Register")
	WebElement register;
	@FindBy(linkText="Log in")
	WebElement login;
	@FindBy(partialLinkText="Shoppingcart")
	WebElement shoppingcart;
	public homepage(WebDriver driver) {
		super();
		this.driver = driver;
	}
public String register(){
	register.click();
	return driver.getTitle();
	
}
public String login(){
	login.click();
	return driver.getTitle();
			
}
}
