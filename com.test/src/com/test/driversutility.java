package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class driversutility {
	public static WebDriver getdriver(String browsername){
		if (browsername.equals("chrome"))
				{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.09\\Desktop\\selenium jarfiles\\chromedriver.exe");
			return new ChromeDriver();
				}
		if(browsername.equals("ie"))
		{
			System.setProperty("webdriver.internetexplorer.driver", "C:\\Users\\training_b6b.01.09\\Desktop\\selenium jarfiles\\IEDriverServer.exe");
		    return new InternetExplorerDriver(); 
		}
	if (browsername.equals("firefox"))
	{
	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\training_b6b.01.09\\Desktop\\selenium jarfiles\\geckodriver.exe");
	return new FirefoxDriver();
	}
	else
		return null;
	
	}
}
