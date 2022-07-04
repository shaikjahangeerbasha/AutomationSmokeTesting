package com.agentscript.Profilepom;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.agentscript.base.Base;

public class LogInPage extends Base 
{
	WebDriver driver;
	
	public LogInPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@name='UserName']")
	WebElement username;
	@FindBy(xpath = "//input[@name='Password']")
	WebElement password;
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement login;
	
	 @FindBy(xpath ="(//div[@class='msm-agent-inner-list'])[4]")
		WebElement operation;
		@FindBy(xpath ="//*[text()='Students']")
		WebElement student;
		@FindBy(xpath = "//button[text()=' Add New Student Profile']")
		WebElement addnewstudnt;
	
	
	public String Login(String email,String pass) throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//send the emailid from username field
		username.sendKeys(email);
		//send the password from password field
		password.sendKeys(pass);
		login.click();
	
        return pass;
		
	}
	
	

	 
}
