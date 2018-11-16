package com.test;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
  @Test
  
  public void f() {
	  driver=driversutility.getdriver("chrome");
	  driver.get("http://www.hdfcbank.com");
	 String window= driver.getWindowHandle();
	  driver.findElement(By.id("loginsubmit")).click();
	 Set <String> windows = driver.getWindowHandles();
	 for(String s:windows)
		 driver.switchTo().window(s);
	 
	  driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/a")).click();
	  
	  driver.switchTo().frame(driver.findElement(By.name("login_page")));
	 // driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td[2]/span/input")).sendKeys("1002345");
	  driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[6]/td[2]/a/img")).click();
	  if(ExpectedConditions.alertIsPresent()!=null)
	  {
		  Alert al=driver.switchTo().alert();
		  System.out.println(al.getText());
		  al.accept();
		  
	  }
	  driver.switchTo().window(window);
	  driver.quit();

  }
}
