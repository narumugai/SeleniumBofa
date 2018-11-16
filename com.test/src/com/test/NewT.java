package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewT {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.09\\Desktop\\selenium jarfiles\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.findElementByCssSelector("a[title='Google apps']").click();
		WebElement app=driver.findElementByCssSelector("ul[aria-dropeffect='move']");
		List <WebElement>num= app.findElements(By.tagName("li"));
		Assert.assertEquals(num.size(), 13);
		//System.out.println(num.size());
}
  }

