package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBase {
	
	public static WebDriver driver=null;
	
	@BeforeTest
	public void init()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		
	}
	
	@Test
	public void getURL()
	{
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/log-in/");
	}
	
	@AfterTest
	public void end()
	{
		driver.close();
		driver.quit();
	}
	
	

}
