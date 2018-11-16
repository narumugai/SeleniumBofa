package com.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Verification {
	ChromeDriver driver;
	@BeforeClass
	public void beforemethod()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.09\\Desktop\\selenium jarfiles\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@AfterClass
	public void aftermethod()
	{
		driver.close();
		
	}
	@Test(priority=1)
	public void register(){
		
		driver.get("http://demowebshop.tricentis.com");
		driver.findElementByLinkText("Register").click();
		driver.findElementById("gender-female").click();
		driver.findElementById("FirstName").sendKeys("mathinik");
		driver.findElementById("LastName").sendKeys("Muthusamy");
		driver.findElementById("Email").sendKeys("mathini179034@gmail.com");
		driver.findElementById("Password").sendKeys("pwd1234");
		driver.findElementById("ConfirmPassword").sendKeys("pwd1234");
		driver.findElementById("register-button").click();
		String result=driver.findElementByClassName("result").getText();
		Assert.assertEquals(result, "Your registration completed");
		driver.findElementByLinkText("Log out").click();
		
	}

	@Test(priority=2)
	public void login()
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.09\\Desktop\\selenium jarfiles\\chromedriver.exe");
	
		//driver.get("http://demowebshop.tricentis.com");
		driver.findElementByLinkText("Log in").click();
		driver.findElementById("Email").sendKeys("mathini179034@gmail.com");
		driver.findElementById("Password").sendKeys("pwd1234");
		driver.findElementByCssSelector("input[value='Log in']").click();
		//String user=driver.findElementByClassName("account").getText();
		//Assert.assertEquals(user, "tamilmuthu17@gmail.com");
		WebElement button=driver.findElementByCssSelector("a[href='/logout']");
		Assert.assertNotNull(button);
	}
}
