package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {
WebDriver driver;
@FindBy(id="gender-female")
WebElement gender;
@FindBy(id="FirstName")
WebElement firstname;
@FindBy(id="LastName")
WebElement lastname;
@FindBy(id="Email")
WebElement email;
@FindBy(id="Password")
WebElement password;
@FindBy(id="ConfirmPassword")
WebElement confirmpassword;
@FindBy(id="register-button")
WebElement registerbutton;
@FindBy(className="result")
WebElement result;
public RegisterPage(WebDriver driver) {
	super();
	this.driver = driver;
}
public String registration(){
	gender.click();
	firstname.sendKeys("insuvai");
	lastname.sendKeys("sakthivel");
	email.sendKeys("insuvai@gmail.com");
	password.sendKeys("qwerty");
	confirmpassword.sendKeys("qwerty");
	registerbutton.click();
	return result.getText();
			
	
}

}
