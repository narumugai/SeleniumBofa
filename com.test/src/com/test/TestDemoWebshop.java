package com.test;

import org.testng.annotations.Test;

import com.page.RegisterPage;
import com.page.homepage;
import com.page.loginpage;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

public class TestDemoWebshop {
	WebDriver driver;
	loginpage lp;
	RegisterPage rp;
	homepage hp;
	
  @Test
  public void f() {
  }
  @BeforeClass
  public void beforeClass() {
	 driver=driversutility.getdriver("chrome");
	 lp=PageFactory.initElements(driver, loginpage.class);
	 hp=PageFactory.initElements(driver,homepage.class);
	 rp=PageFactory.initElements(driver, RegisterPage.class);
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
