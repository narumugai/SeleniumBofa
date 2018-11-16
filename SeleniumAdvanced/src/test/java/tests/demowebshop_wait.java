package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class demowebshop_wait {
  @Test(enabled=false)
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.09\\Desktop\\selenium jarfiles\\chromedriver.exe");
	  ChromeDriver driver=new ChromeDriver(); 
	  driver.get("http://demowebshop.tricentis.com");
	  driver.findElementByLinkText("Log in").click();
		driver.findElementById("Email").sendKeys("askmail@email.com");
		driver.findElementById("Password").sendKeys("abc123");
		driver.findElementByCssSelector("input[value='Log in']").click();
		driver.findElementByPartialLinkText("Shopping cart").click();
		driver.findElement(By.cssSelector("input[name='discountcouponcode']")).sendKeys("AutomationDiscount");
		driver.findElement(By.cssSelector("input[value='Apply coupon']")).click();
		WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='message']")));
		String text=driver.findElement(By.cssSelector("div[class='message']")).getText();
		System.out.println(text);
		
	  
	  
  }
  @Test
  public void keyboardactions(){
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.09\\Desktop\\selenium jarfiles\\chromedriver.exe");
	  ChromeDriver driver=new ChromeDriver(); 
	  driver.get("http://demowebshop.tricentis.com");
	  WebElement enter=driver.findElement(By.id("small-searchterms"));
	  Actions act=new Actions(driver);
	  act.keyDown(Keys.SHIFT).sendKeys("computer").keyUp(Keys.SHIFT).perform();
	  WebDriverWait wait=new WebDriverWait(driver,15);
	  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.))
	  
  }
}
