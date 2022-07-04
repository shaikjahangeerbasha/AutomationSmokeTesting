package com.agentscript.pom;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.agentscript.base.Base;
import com.agentscript.utility.UtilityFile;



public class Signin extends Base {
WebDriver driver;
	
	public Signin(WebDriver driver)
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
	@FindBy(xpath = "//mat-icon[text()='close']")
	WebElement close;
	@FindBy(xpath = "//a[@id='dropdownMenuLink']")
	WebElement dropdownmenu;
	@FindBy(xpath = "//a[text()='Log Out']")
	WebElement logout;
	@FindBy(xpath = "//span[text()='Yes, I am sure!']")
	WebElement yes;
	public void agents(String un,String pw) throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		UtilityFile.screenShot(driver);
		username.sendKeys(un);
		Thread.sleep(3000);
		password.sendKeys(pw);
		Thread.sleep(3000);
		login.click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        Thread.sleep(10000);
      //  close.click();
        Thread.sleep(3000);
		UtilityFile.screenShot(driver);
        Thread.sleep(3000);
        dropdownmenu.click();
        Thread.sleep(3000);
        UtilityFile.screenShot(driver);
        logout.click();
        Thread.sleep(3000);
        yes.click();
		}
	
	  public void Loginagents() throws Throwable
		{
			
				String path=prop.getProperty("excel");
				FileInputStream Fis=new FileInputStream(path);
				XSSFWorkbook WB=new XSSFWorkbook(Fis); 
				XSSFSheet WS=WB.getSheet("Sheet6"); 
				int Rc=WS.getLastRowNum(); 
				for (int i = 1; i<=Rc; i++) 
				{ 
					XSSFRow WR=WS.getRow(i);
					if(WR==null)
					{
						break;
					} 
					XSSFCell WC=WR.getCell(0);
					XSSFCell WC1=WR.getCell(1);
					
					
					
					String un=WC.getStringCellValue(); 
					String pw=WC1.getStringCellValue();
					
					
					agents(un,pw);
					}
					
			
		
	    
		}   
	
	}
