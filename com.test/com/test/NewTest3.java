package com.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest3 {
  @Test
  public void find count() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.09\\Desktop\\selenium jarfiles\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.findElementByCssSelector("a[title='Google apps']").click();
}
  }
}
