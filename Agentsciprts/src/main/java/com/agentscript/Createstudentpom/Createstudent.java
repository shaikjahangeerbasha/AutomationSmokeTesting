package com.agentscript.Createstudentpom;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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

public class Createstudent extends Base {

    public WebDriver driver;
	public Createstudent(WebDriver driver) {
		  this.driver = driver;
	  PageFactory.initElements(driver, this);
	   }
    @FindBy(xpath ="(//div[@class='msm-agent-inner-list'])[4]")
	WebElement operation;
	@FindBy(xpath ="//*[text()='Students']")
	WebElement student;
	@FindBy(xpath = "//button[text()=' Add New Student Profile']")
	WebElement addnewstudnt;
	@FindBy(xpath = "//span[text()='Title']")
	WebElement title;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
	WebElement titleclick;
	@FindBy(xpath = "//input[@name='FirstName']")
	WebElement firstname;
	@FindBy(xpath = "//input[@name='LastName']")
	WebElement lastname;
	@FindBy(xpath = "//mat-select[@name='MaritialStatus']")
	WebElement maritialstatus;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
	WebElement maritialstatusclick;
	@FindBy(xpath = "//input[@placeholder='Date of Birth']")
	WebElement dateofbirth;
	@FindBy(xpath = "//input[@name='Email']")
	WebElement emailid;
	@FindBy(xpath = "//*[@name='MobileNoCountryCode']//span[text()='Country Code']")
	WebElement countrycode;
	@FindBy(xpath = "//input[@aria-label='dropdown search']")
	WebElement dropdown;
	
	@FindBy(xpath = "//input[@name='MobileNo']")
	WebElement contactno;
	@FindBy(xpath = "//input[@name='PassportNo']")
	WebElement passportno;
	@FindBy(xpath = "//mat-select[@name='Citizenship']")
	WebElement citizenship;
	@FindBy(xpath = "(//button[text()='Save & Continue'])[1]")
	WebElement save;
	
	
	
	@FindBy(xpath = "//input[@name='Addres']")
	WebElement address;
	@FindBy(xpath = "//mat-select[@name='Country']")
	WebElement countryclick;
	@FindBy(xpath = "//mat-select[@name='Province']")
	WebElement provience;
	@FindBy(xpath = "//input[@name='City']")
	WebElement city;
	
	//input[@name='MailingAddres']

	@FindBy(xpath = "//input[@name='MailingAddres']")
	WebElement mailingadd;
	@FindBy(xpath = "//mat-select[@name='MailingCountry']")
	WebElement mailingcountry;
	@FindBy(xpath = "//mat-select[@name='MailingProvince']")
	WebElement mailingprovience;
	@FindBy(xpath = "//input[@name='MailingCity']")
	WebElement mailingcity;
	
	@FindBy(xpath = "//input[@name='EmrgencyName']")
	WebElement emergencyname;
	@FindBy(xpath = "//mat-select[@name='EmergencyCellPhoneCountryCode']")
	WebElement emgcellphone;
	
	
	@FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
	WebElement relationshipclick;
	@FindBy(xpath = "//input[@name='EmergencyRelation']")
	WebElement relationship;
	
	@FindBy(xpath = "//input[@name='EmergencyEmail']")
	WebElement emergecyemail;
	@FindBy(xpath = "//mat-select[@name='EmergencyCellPhoneCountryCode']")
	WebElement emercountrycode;
	
	@FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
	WebElement emercountrycodeclick;
	
	@FindBy(xpath = "//input[@name='EmergencyCellPhone']")
	WebElement emercellphone;
	
	
	@FindBy(xpath = "(//button[text()='Save & Continue'])[2]")
	WebElement save2;
	
	@FindBy(xpath = "//div/button[text()='Save ']")
	WebElement save3;
	
	
	
	
	@FindBy(xpath = "//div[@class='mat-tab-label-content'][text()='Test Scores']")
	WebElement testscore;
	@FindBy(xpath = "//mat-select[@name='EnglishExamType']")
	WebElement engexamtype;
    @FindBy(xpath = "//input[@name='EnglishExamDate']")
	WebElement date;
	@FindBy(xpath = "//input[@name='EnglishScoreOverall']")
	WebElement overall;
	
	
	@FindBy(xpath = "//div[@class='mat-tab-label-content'][text()='Documents']")
	WebElement documents;
	@FindBy(xpath = "//div[1]/table/tbody/tr[2]/td[1]/div/div[2]/div/div/div[1]/input")
	WebElement docsearch;
    @FindBy(xpath = "(//mat-icon[text()='keyboard_arrow_down'])[1]")
	WebElement actiontab;
	@FindBy(xpath = "//span[text()=' folder ']")
	WebElement upload;
	@FindBy(xpath = "//mat-icon[text()='close']")
	WebElement close;
	
	@FindBy(xpath = "//span[@class='mat-button-wrapper']/img[@alt='Upload']")
	WebElement selectfile;
	@FindBy(xpath = "//button[text()='Upload']")
	WebElement upload2;

    public void createstudent(String fn ,String ln,String dt,String em,String cnt,String ctno,String ctzn,String ptno ,String ad,String cntt ,String pvn,String ct,String mailad,String mailcntt ,String mailpvn,String mailct) throws Throwable {
    	Actions a = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		JavascriptExecutor exi = (JavascriptExecutor) driver;
    
		    //close.click();
			a.moveToElement(operation).perform();
			Thread.sleep(3000);
			operation.click();
			Thread.sleep(3000);
			student.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			Thread.sleep(3000);
			addnewstudnt.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			Thread.sleep(3000);
			title.click();
			//Thread.sleep(3000);
			titleclick.click();
			//Thread.sleep(3000);
			firstname.sendKeys(fn);
			//Thread.sleep(3000);
			lastname.sendKeys(ln);
			//Thread.sleep(3000);
			maritialstatus.click();
			Thread.sleep(3000);
			maritialstatusclick.click();
			Thread.sleep(3000);
			dateofbirth.sendKeys(dt);
			//Thread.sleep(3000);
			emailid.sendKeys(em);
			countrycode.click();
			Thread.sleep(3000);
			dropdown.sendKeys(cnt);
			Thread.sleep(3000);
			dropdown.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			contactno.sendKeys(ctno);
			citizenship.click();
			Thread.sleep(3000);
			dropdown.sendKeys(ctzn);
			Thread.sleep(3000);
			dropdown.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			passportno.sendKeys(ptno);
			Thread.sleep(3000);
			save.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			Thread.sleep(3000);
			address.sendKeys(ad);
			countryclick.click();
			Thread.sleep(3000);
			dropdown.sendKeys(cntt);
			Thread.sleep(3000);
			dropdown.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			provience.click();
			Thread.sleep(3000);
			dropdown.sendKeys(pvn);
			Thread.sleep(3000);
			dropdown.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			city.sendKeys(ct);
			Thread.sleep(3000);
		    a.moveToElement(mailingadd).perform();
			mailingadd.sendKeys(mailad);
			Thread.sleep(3000);
			a.doubleClick(mailingcountry).build().perform();
			Thread.sleep(3000);
			dropdown.sendKeys(mailcntt);
			Thread.sleep(3000);
			dropdown.sendKeys(Keys.ENTER);
			Thread.sleep(5000);
			mailingprovience.click();
			Thread.sleep(3000);
			dropdown.sendKeys(mailpvn);
			Thread.sleep(3000);
			dropdown.sendKeys(Keys.ENTER);
			Thread.sleep(5000);
			a.moveToElement(mailingcity).perform();

			mailingcity.sendKeys(mailct);
			Thread.sleep(3000);
			a.doubleClick(save2).build().perform();
			//save2.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			Thread.sleep(3000);
			
			emergencyname.sendKeys(fn);
			Thread.sleep(3000);
			
			relationship.click();
			Thread.sleep(3000);
			relationshipclick.click();
			Thread.sleep(3000);
			emergecyemail.sendKeys(em);
			Thread.sleep(3000);
			
			emercountrycode.click();
            Thread.sleep(3000);
			dropdown.sendKeys(cnt);
			Thread.sleep(3000);
			emercountrycodeclick.click();
			Thread.sleep(3000);
			emercellphone.sendKeys(ctno);
			Thread.sleep(3000);
			a.moveToElement(save3).perform();
		    save3.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			Thread.sleep(3000);
			
		
    }
    public void Createstudent() throws Throwable
	{
		
		
		
			String path=prop.getProperty("excel");
			FileInputStream Fis=new FileInputStream(path);
			XSSFWorkbook WB=new XSSFWorkbook(Fis); 
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
				XSSFCell WC1=WR.getCell(1);
				XSSFCell WC2=WR.getCell(2);
				XSSFCell WC3=WR.getCell(3);
				XSSFCell WC4=WR.getCell(4);
				XSSFCell WC5=WR.getCell(5);
				XSSFCell WC6=WR.getCell(6);
				XSSFCell WC7=WR.getCell(7);
				XSSFCell WC8=WR.getCell(8);
				XSSFCell WC9=WR.getCell(9);
				XSSFCell WC10=WR.getCell(10);
				XSSFCell WC11=WR.getCell(11);
				
				XSSFCell WC12=WR.getCell(12);
				XSSFCell WC13=WR.getCell(13);
				XSSFCell WC14=WR.getCell(14);
				XSSFCell WC15=WR.getCell(15);
				
				String fn=WC.getStringCellValue(); 
				String ln=WC1.getStringCellValue();
				String dt=WC2.getStringCellValue();
				String em=WC3.getStringCellValue();
				
				String cnt=WC4.getStringCellValue(); 
				String ctno=WC5.getStringCellValue();
				String ptno=WC6.getStringCellValue();
				String ctzn=WC7.getStringCellValue();
				
				String ad=WC8.getStringCellValue(); 
				String cntt=WC9.getStringCellValue();
				String pvn=WC10.getStringCellValue();
				String ct=WC11.getStringCellValue();
				
				String mailad=WC12.getStringCellValue(); 
				String mailcntt=WC13.getStringCellValue();
				String mailpvn=WC14.getStringCellValue();
				String mailct=WC15.getStringCellValue();
				
				createstudent(fn,ln,dt,em,cnt,ctno,ptno,ctzn,ad,cntt,pvn,ct,mailad,mailcntt,mailpvn,mailct) ;
			}
				
		
	
    
	}   
}
