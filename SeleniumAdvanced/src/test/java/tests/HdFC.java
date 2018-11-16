package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class HdFC {
	WebDriver driver;
	
  @Test
  public void finddmat() throws InterruptedException {
	  //driver.findElement(By.id("div-close")).click();
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.09\\Desktop\\selenium jarfiles\\chromedriver.exe");
	  ChromeDriver driver=new ChromeDriver(); 
	 driver.get("http://www.hdfcbank.com");
	 driver.manage().window().maximize();
	 
Actions act=new Actions(driver);
act.moveToElement(driver.findElement(By.cssSelector("a[href='/personal/products'"))).perform();
Thread.sleep(2000);
act.moveToElement(driver.findElement(By.cssSelector("a[href='/personal/products/demat'"))).perform();

driver.findElement(By.cssSelector("a[href='/personal/products/demat/demat-account']")).click();


  }
}