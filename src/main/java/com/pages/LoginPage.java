package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
  public LoginPage(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
	  
  }
  @CacheLookup
  @FindBy(name="username") private WebElement username;
  @CacheLookup
  @FindBy(name="password") private WebElement password;
  
  @CacheLookup
  @FindBy(xpath="//*[text()='Sign in']") private WebElement sigin;
  
  public void vtigetpage(String user, String pass)
  {
	  username.sendKeys(user);
	  password.sendKeys(pass);
	  sigin.click();
  }
 
  

}
