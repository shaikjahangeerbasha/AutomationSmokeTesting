package com.agentscript.Createstudentpom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.agentscript.base.Base;
import com.agentscript.utility.UtilityFile;

public class Applisubmitinstitute extends Base{

    public WebDriver driver;

	public Applisubmitinstitute(WebDriver driver) {
		  this.driver = driver;
	  PageFactory.initElements(driver, this);
	   }
    @FindBy(xpath = "//p[text()='Operation']")
   	WebElement operation; 
    @FindBy(xpath = "//span[text()='Applications']")
   	WebElement application; 
    
    @FindBy(xpath = "//mat-icon[text()='filter_list']")
   	WebElement filter; 
    @FindBy(xpath = "(//input[@aria-label='Filter cell'])[5]")
   	WebElement search; 
    @FindBy(xpath = "//div/div[6]/div[2]/table/tbody/tr[1]/td[1]")
   	WebElement edit;
    
    @FindBy(xpath = "//button[text()=' Submit To Institute']")
   	WebElement submitinsitute; 
    @FindBy(xpath = "//button[text()=' Yes']")
	WebElement submityes;
    @FindBy(xpath = "//input[@name='UserName']")
	WebElement username;
	@FindBy(xpath = "//input[@name='Password']")
	WebElement password;
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement login;
	
	@FindBy(xpath = "//button[text()='OK']")
   	WebElement ok; 
    @FindBy(xpath = "//h1[text()='Educational Background']")
	WebElement edubackground;
    @FindBy(xpath = "//button[text()=' Add 10th ']")
	WebElement add10;
	@FindBy(xpath = "//mat-select[@name='CountryOfInstitution']")
	WebElement countrinstitution;
	@FindBy(xpath = "//input[@aria-label='dropdown search']")
	WebElement dropdown;
	@FindBy(xpath = "(//button[text()='Add'])[2]")
	WebElement add;
	
  
	
	public String adminlgin(String adminun,String adminpwd) throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//send the emailid from username field
		username.sendKeys(adminun);
		//send the password from password field
		password.sendKeys(adminpwd);
		login.click();
	
        return adminpwd;
		
	}
	
	public void submittoinstitute(String fn,String cntt) throws Throwable {
	
		Actions a = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		JavascriptExecutor exi = (JavascriptExecutor) driver;
    
		operation.click();
		Thread.sleep(3000);
		UtilityFile.screenShot(driver);
		Thread.sleep(2000);
    	application.click();
		Thread.sleep(2000);
		UtilityFile.screenShot(driver);
		Thread.sleep(2000);
		filter.click();
		Thread.sleep(3000);
		search.sendKeys(fn); 
		a.moveToElement(edit).perform();
		edit.click();
		Thread.sleep(3000);
		submitinsitute.click();
		Thread.sleep(2000);
		UtilityFile.screenShot(driver);
		
		Thread.sleep(3000);
		
		
		try {
				
			  if(driver.findElement(By.xpath("//button[text()='OK']")).isEnabled()) 
			  {
				    Thread.sleep(3000);
				    ok.click();
				    Thread.sleep(5000);
					 exi.executeScript("arguments[0].scrollIntoView();", edubackground);
					Thread.sleep(3000);
					edubackground.click();
					Thread.sleep(3000);
					add10.click();
					Thread.sleep(3000);
					countrinstitution.click();
					Thread.sleep(3000);
					dropdown.sendKeys(cntt);
					Thread.sleep(3000);
					dropdown.sendKeys(Keys.ENTER);
					Thread.sleep(3000);
					add.click();
					Thread.sleep(3000);
					a.moveToElement(submitinsitute).perform();
					Thread.sleep(3000);
					submitinsitute.click();
					Thread.sleep(3000);
			  }
			  else {
					  
				    
					  System.out.println("education is not filled");
					  

					 
			  }
			} catch (Exception e) {
				// TODO: handle exception
			}
		
              
		
		
		
		submityes.click();
		Thread.sleep(3000);
		UtilityFile.screenShot(driver);
		Thread.sleep(2000);
		UtilityFile.Tab0(driver);
		Thread.sleep(2000);
		UtilityFile.screenShot(driver);
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		UtilityFile.screenShot(driver);
		Thread.sleep(2000);
 
      
		
	}
	public void submitinstitute() throws Throwable {
		
		String path=prop.getProperty("excel");
		FileInputStream Fis1=new FileInputStream(path);
		XSSFWorkbook WB=new XSSFWorkbook(Fis1); 
		XSSFSheet WS=WB.getSheet("Sheet1"); 
		int Rc=WS.getLastRowNum(); 
		for (int i = 1; i<=Rc; i++) 
		{ 
			XSSFRow WR=WS.getRow(i);
			if(WR==null)
			{
				break;
			} 
			XSSFCell WC=WR.getCell(0);
			XSSFCell WC9=WR.getCell(9);
			
		
            String fn=WC.getStringCellValue(); 
            String cntt=WC9.getStringCellValue();
			
            submittoinstitute(fn,cntt);		
            }	
	}
}
