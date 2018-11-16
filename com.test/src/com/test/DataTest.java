package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.util.log.Log;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class DataTest {
	WebDriver driver;
  @Test(dataProvider = "dp1")
  public void f(String username , String Password) {
	    driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(Password);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		driver.findElement(By.linkText("Log out")).click();
	  
  }
  @BeforeClass
  @Parameters({"browsername"})
  public void beforeMethod(String value) {
	  //System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.09\\Desktop\\selenium jarfiles\\chromedriver.exe");
		driver =driversutility.getdriver(value);
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com");
		
  }

  @AfterClass
  public void afterMethod() {
	  driver.close();
  }
  
  @DataProvider(name="dp1")
  public Object[][] getdata()
  {
	  Object[][] obj={
			  {"askmail@bmail.com","abc123"},
			  {"askmail@email.com","abc123"}
	 
	  };
	  return obj;
  }
}

  

