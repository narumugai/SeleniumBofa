package com.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Newtest1 {
	@Test
	public void testgoogle()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.09\\Desktop\\selenium jarfiles\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://www.google.co.in");
		String title=driver.getTitle();
		Assert.assertEquals(title, "Google");
		  
		
	}

}
