package com.agentscript.Programsearchpom;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Set;
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

public class Programsearch extends Base {

    public WebDriver driver;
	public Programsearch(WebDriver driver) {
		  this.driver = driver;
	  PageFactory.initElements(driver, this);
	   }
   
	@FindBy(xpath ="//span[text()='Nationality']")
	WebElement nationalty;
	@FindBy(xpath = "//input[@aria-label='dropdown search']")
	WebElement dropdown;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[3]")
	WebElement nationalityclick;
	@FindBy(xpath = "//input[@name='param2']")
	WebElement destination;
	@FindBy(xpath = "(//button[text()='Know More'])[1]")
	WebElement knowmore;
	@FindBy(xpath = "//a[text()='Check students eligibility ']")
	WebElement chekeligibi;
	@FindBy(xpath = "//input[@placeholder='Enter student name, student ID or email ID']")
	WebElement searchname;
	@FindBy(xpath = "//button[text()=' Search ']")
	WebElement searchclick;
	@FindBy(xpath = "(//button[text()='Select to Check Eligibility'])[1]")
	WebElement selectchekeligibi;
	@FindBy(xpath = "//mat-select[@name='EnglishExamType']")
	WebElement examseach;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
	WebElement examseachclick;
	@FindBy(xpath = "//input[@name='EnglishExamOverall']")
	WebElement overall;
	@FindBy(xpath = "//button[text()='Run test']")
	WebElement runtext;
	
	@FindBy(xpath = "//mat-icon[text()='close']")
	WebElement close;
	@FindBy(xpath = "//button[text()='Continue to Apply']")
	WebElement continueapply;
	@FindBy(xpath = "//button[text()='Retry']")
	WebElement retry;
    @FindBy(xpath = "//a[text()='Apply']")
	WebElement apply;
	@FindBy(xpath = "(//button[text()='Select to Apply'])[1]")
	WebElement selecttoapply;
	@FindBy(xpath = "//mat-select[@name='Province']")
	WebElement provience;
	@FindBy(xpath = "//input[@name='City']")
	WebElement city;

    public void programsrch(String nt ,String des,String sn,String avr) throws Throwable {
    	Actions a = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		JavascriptExecutor exi = (JavascriptExecutor) driver;
    
		    //close.click();
		    Thread.sleep(3000);
		    UtilityFile.screenShot(driver);
 			
			a.moveToElement(nationalty).perform();
			Thread.sleep(3000);
			nationalty.click();
			Thread.sleep(3000);
			dropdown.sendKeys(nt);
			Thread.sleep(3000);
			nationalityclick.click();
			Thread.sleep(3000);
			destination.sendKeys(des);
			Thread.sleep(3000);
			destination.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			knowmore.click();
			Thread.sleep(3000);
		    UtilityFile.screenShot(driver);
			
			String parent=driver.getWindowHandle();

			Set<String>s=driver.getWindowHandles();

			
			Iterator<String> I1= s.iterator();

			while(I1.hasNext())
			{

			String child_window=I1.next();


			if(!parent.equals(child_window))
			{
			driver.switchTo().window(child_window);
			Thread.sleep(5000);
			
			
				
			try {
				
			
			
			if(driver.findElement(By.xpath("//a[text()='Apply']")).isEnabled()) {
			apply.click();
			Thread.sleep(3000);
		    UtilityFile.screenShot(driver);
			
			Thread.sleep(5000);
			searchname.sendKeys(sn);
			searchclick.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			selecttoapply.click();
			  UtilityFile.screenShot(driver);
			break;
			}

			else {
				System.out.println("hi");
			}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		    chekeligibi.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			Thread.sleep(3000);
		    searchname.sendKeys(sn);
			searchclick.click();
			Thread.sleep(3000);
		    selectchekeligibi.click();
		    UtilityFile.screenShot(driver);
			Thread.sleep(3000);
			examseach.click();
			examseachclick.click();
			overall.sendKeys(avr);
			runtext.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			continueapply.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			//retry.click();
			
			
			
			}}
			
		
    }
    public void programsearch() throws Throwable
	{
		
		
		
			String path=prop.getProperty("excel");
			FileInputStream Fis=new FileInputStream(path);
			XSSFWorkbook WB=new XSSFWorkbook(Fis); 
			XSSFSheet WS=WB.getSheet("Sheet4"); 
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
				XSSFCell WC2=WR.getCell(2);
				XSSFCell WC3=WR.getCell(3);
				
				
				String nt=WC.getStringCellValue(); 
				String des=WC1.getStringCellValue();
				String sn=WC2.getStringCellValue();
				String avr=WC3.getStringCellValue();
				
				
				programsrch(nt,des,sn,avr);
				}
				
		
	
    
	}   
}
