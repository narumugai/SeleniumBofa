package com.test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class New {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.09\\Desktop\\selenium jarfiles\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://www.cleartrip.com");
		WebElement from=driver.findElementById("FromTag");
		from.sendKeys("hyd");
		Thread.sleep(4000);
		from.sendKeys(Keys.ENTER);
		
		
		WebElement to=driver.findElementById("ToTag");
		to.sendKeys("bang");
		Thread.sleep(3000);
		to.sendKeys(Keys.ARROW_DOWN);
		to.sendKeys(Keys.ENTER);
		
	  
  }
}
