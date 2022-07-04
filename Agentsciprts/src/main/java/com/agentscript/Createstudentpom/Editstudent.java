package com.agentscript.Createstudentpom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.agentscript.base.Base;
import com.agentscript.utility.UtilityFile;

public class Editstudent extends Base {

	public WebDriver driver;

	public Editstudent(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[@class='msm-agent-inner-list'])[4]")
	WebElement operation;
	@FindBy(xpath = "//*[text()='Students']")
	WebElement student;
	@FindBy(xpath = "//button[@title='Apply Filter']/span/img")
	WebElement filter;
	@FindBy(xpath = "//div[5]/div/table/tbody/tr[2]/td[5]/div/div[2]/div/div/div[1]/input")
	WebElement filtersearch;
	@FindBy(xpath = "//div/div[5]/div/table/tbody/tr[2]/td[3]/div/div[2]/div/div/div[1]/input")
	WebElement filtersearch2;
	@FindBy(xpath = "//div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[1]")
	WebElement edit;
	@FindBy(xpath = "//div[text()='Application']")
	WebElement applicatn;

	@FindBy(xpath = "//input[@aria-label='dropdown search']")
	WebElement dropdown;
	@FindBy(xpath = "//mat-select[@name='InstitutionId']")
	WebElement institution;
	@FindBy(xpath = "//button[text()=' Create application ' ]")
	WebElement createappli;
	@FindBy(xpath = "//mat-select[@name='ProgramId']")
	WebElement program;
	@FindBy(xpath = "//*[@name='IntekId']//span[text()='Intake']")
	WebElement intake;
	@FindBy(xpath = "//*[@placeholder='Student Residing']//span[text()='Student Residing']")
	WebElement studentpresent;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
	WebElement presentselect;
	@FindBy(xpath = "//span[text()='Mode']")
	WebElement mode;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
	WebElement modeselect;
	@FindBy(xpath = "//button[text()='Save & Continue']")
	WebElement savecontinue;
	@FindBy(xpath = "//button[text()='No']")
	WebElement no;
	@FindBy(xpath = "//mat-icon[text()='close']")
	WebElement close;

	@FindBy(xpath = "//div[@class='mat-tab-label-content'][text()='Education']")
	WebElement education;
	@FindBy(xpath = "//mat-select[@name='CountryOfEducation']")
	WebElement countryeducation;
	@FindBy(xpath = "//mat-select[@name='HighestLevelOfEducation']")
	WebElement highestlevel;
	@FindBy(xpath = "//mat-select[@name='GradingScheme']")
	WebElement gradingschm;
	@FindBy(xpath = "//input[@name='GradeAverage']")
	WebElement gradeavg;
	@FindBy(xpath = "//button[text()='Update']")
	WebElement update;
	@FindBy(xpath = "//div[@class='mat-tab-label-content'][text()='Test Scores']")
	WebElement testscore;
	@FindBy(xpath = "//mat-select[@name='EnglishExamType']")
	WebElement engexamtype;
	@FindBy(xpath = "//input[@name='EnglishExamDate']")
	WebElement date;
	@FindBy(xpath = "//input[@name='EnglishScoreOverall']")
	WebElement overall;
	@FindBy(xpath = "//button[text()='Confirm']")
	WebElement confirm;

	@FindBy(xpath = "//button[text()='Make Payment']")
	WebElement makepaymt;
	@FindBy(xpath = "(//button[text()=' Make Payment '])[2]")
	WebElement makepaymt2;
	@FindBy(xpath = "//button[text()='Pay with Stripe']")
	WebElement paystripe;
	@FindBy(xpath = "//*[@id='card_number']")
	WebElement cardno;
	@FindBy(xpath = "//input[@id='cc-exp']")
	WebElement monthyear;
	@FindBy(xpath = "//input[@id='cc-csc']")
	WebElement csc;
	@FindBy(xpath = "//span[text()='Pay']")
	WebElement pay;

	@FindBy(xpath = "//a[@class='nav-link']//span[text()='Applications']")
	WebElement applicationn;
	@FindBy(xpath = "//a[text()=' Fee ']")
	WebElement fee;

	@FindBy(xpath = "//a[text()=' Student Documents ']")
	WebElement studentdoc;
	@FindBy(xpath = "//span[text()=' keyboard_arrow_down ']")
	WebElement action;
	@FindBy(xpath = "//span[text()='Upload']")
	WebElement upld;
	@FindBy(xpath = "//label[text()='Select File']")
	WebElement selectfile;
	@FindBy(xpath = "//button[text()='Upload']")
	WebElement uplodd;

	@FindBy(xpath = "//button[text()=' Upload ']")
	WebElement upload;
	@FindBy(xpath = "//mat-select[@name='DocumentTypeId']")
	WebElement docname;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
	WebElement docnameclick;
	@FindBy(xpath = "//label[text()=' Choose File ']")
	WebElement choosefile;
	@FindBy(xpath = "(//button[text()=' Upload '])[2]")
	WebElement uploadd;
	@FindBy(xpath = "//button[text()='Submit Document']")
	WebElement submitdoc;

	@FindBy(xpath = "//button[text()='SUBMIT NOW']")
	WebElement submit;
	@FindBy(xpath = "//button[text()=' Yes']")
	WebElement submityes;

	@FindBy(xpath = "//button[text()=' Add receipt ']")
	WebElement addreceipt;
	@FindBy(xpath = "//*[@name='FeeType']//span[text()='Type']")
	WebElement type;
	@FindBy(xpath = "//*[@name='feeFilter']//input[@aria-label='dropdown search']")
	WebElement typesearch;
	@FindBy(xpath = "//mat-select[@name='PaymentMode']")
	WebElement paymentmode;
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement feesubmit;
	@FindBy(xpath = "//input[@name='FeeAmount']")
	WebElement feeamount;
	@FindBy(xpath = "(//mat-icon[text()='filter_list'])[4]")
	WebElement filtermv;
	@FindBy(xpath = "//button[@type='submit'][text()='Add']")
	WebElement add;

	public void Editstudentt(String fn, String inst, String pgm, String ink, String edu, String hl, String gsch,
			String gav, String eex, String dt, String ovral) throws Throwable {

		Actions a = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		JavascriptExecutor exi = (JavascriptExecutor) driver;

		// close.click();
		// a.moveToElement(operation).perform();
		 //Thread.sleep(3000);
		 //operation.click();
		Thread.sleep(3000);
		student.click();
		Thread.sleep(3000);
		UtilityFile.screenShot(driver);
		Thread.sleep(3000);
		a.moveToElement(filter).perform();
		Thread.sleep(3000);
		filter.click();
		Thread.sleep(3000);
		filtersearch.sendKeys(fn);
		Thread.sleep(3000);
		a.moveToElement(edit).click(edit).build().perform();
		// edit.click();
		// exi.executeScript("arguments[0].scrollIntoView();", applicatn);
		Thread.sleep(3000);
		UtilityFile.screenShot(driver);
		Thread.sleep(3000);
		applicatn.click();
		Thread.sleep(3000);
        a.moveToElement(createappli).click(createappli).build().perform();
        Thread.sleep(3000);
        UtilityFile.screenShot(driver);
		
		Thread.sleep(3000);
		institution.click();
		Thread.sleep(3000);
		dropdown.sendKeys(inst);
		Thread.sleep(3000);
		dropdown.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		program.click();
		Thread.sleep(3000);
		dropdown.sendKeys(pgm);
		Thread.sleep(3000);
		dropdown.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		intake.click();
		Thread.sleep(3000);
		dropdown.sendKeys(ink);
		Thread.sleep(3000);
		dropdown.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		studentpresent.click();
		Thread.sleep(3000);
		presentselect.click();
		Thread.sleep(3000);
		a.moveToElement(mode).perform();
		Thread.sleep(3000);
		mode.click();
		Thread.sleep(3000);
		modeselect.click();
		Thread.sleep(3000);
		exi.executeScript("arguments[0].scrollIntoView();", savecontinue);
		Thread.sleep(3000);
		savecontinue.click();
		Thread.sleep(3000);
		UtilityFile.screenShot(driver);
		Thread.sleep(3000);
		no.click();
		Thread.sleep(3000);
		savecontinue.click();
		Thread.sleep(3000);
		UtilityFile.screenShot(driver);
		Thread.sleep(3000);
		savecontinue.click();
		Thread.sleep(3000);
		UtilityFile.screenShot(driver);
		Thread.sleep(3000);
		savecontinue.click();
		Thread.sleep(3000);
		UtilityFile.screenShot(driver);
		Thread.sleep(3000);
		a.sendKeys(Keys.PAGE_UP).build().perform();
		exi.executeScript("window.scrollBy(0,500)");
		UtilityFile.screenShot(driver);
		countryeducation.click();
		Thread.sleep(3000);
		dropdown.sendKeys(edu);
		Thread.sleep(3000);
		dropdown.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		highestlevel.click();
		Thread.sleep(3000);
		dropdown.sendKeys(hl);
		Thread.sleep(3000);
		dropdown.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		gradingschm.click();
		Thread.sleep(3000);
		dropdown.sendKeys(gsch);
		Thread.sleep(3000);
		dropdown.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		a.moveToElement(gradeavg).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(2000);
		gradeavg.sendKeys(gav);
		
		Thread.sleep(3000);
		savecontinue.click();
		Thread.sleep(3000);
		
		UtilityFile.screenShot(driver);
		Thread.sleep(3000);
		engexamtype.click();
		Thread.sleep(3000);
		dropdown.sendKeys(eex);
		Thread.sleep(3000);
		dropdown.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		a.moveToElement(date).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(2000);
		date.sendKeys(dt);
		Thread.sleep(3000);
		a.moveToElement(overall).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(2000);
		overall.sendKeys(ovral);
		Thread.sleep(3000);
		confirm.click();
		Thread.sleep(3000);
		UtilityFile.screenShot(driver);
		Thread.sleep(5000);

	}

	public void Addapplication() throws Throwable {

		String path = prop.getProperty("excel");
		FileInputStream Fis = new FileInputStream(path);
		XSSFWorkbook WB = new XSSFWorkbook(Fis);
		XSSFSheet WS = WB.getSheet("Sheet1");
		int Rc = WS.getLastRowNum();
		for (int i = 1; i <= Rc; i++) {
			XSSFRow WR = WS.getRow(i);
			if (WR == null) {
				break;
			}
			XSSFCell WC = WR.getCell(0);

			XSSFCell WC16 = WR.getCell(16);
			XSSFCell WC17 = WR.getCell(17);
			XSSFCell WC18 = WR.getCell(18);
			XSSFCell WC19 = WR.getCell(19);

			XSSFCell WC20 = WR.getCell(20);
			XSSFCell WC21 = WR.getCell(21);
			XSSFCell WC22 = WR.getCell(22);
			XSSFCell WC23 = WR.getCell(23);
			XSSFCell WC24 = WR.getCell(24);
			XSSFCell WC25 = WR.getCell(25);

			String fn = WC.getStringCellValue();

			String inst = WC16.getStringCellValue();
			String pgm = WC17.getStringCellValue();
			String ink = WC18.getStringCellValue();
			String edu = WC19.getStringCellValue();

			String hl = WC20.getStringCellValue();
			String gsch = WC21.getStringCellValue();
			String gav = WC22.getStringCellValue();
			String eex = WC23.getStringCellValue();
			String dt = WC24.getStringCellValue();
			String ovral = WC25.getStringCellValue();

			Editstudentt(fn, inst, pgm, ink, edu, hl, gsch, gav, eex, dt, ovral);
		}

	}

	public void application(String fn) throws InterruptedException, Throwable {

		Actions a = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		JavascriptExecutor exi = (JavascriptExecutor) driver;
		
	//	close.click();
   //	Thread.sleep(3000);
	//	a.moveToElement(operation).build().perform();
	//	operation.click();
	//	Thread.sleep(3000);
	//	operation.click();
		a.moveToElement(applicationn).click(applicationn).build().perform();
		Thread.sleep(3000);
		applicationn.click();
		UtilityFile.screenShot(driver);
		Thread.sleep(3000);
		a.moveToElement(filter).perform();
		Thread.sleep(3000);
		filter.click();
		Thread.sleep(3000);
		filtersearch2.sendKeys(fn);
		Thread.sleep(3000);
		a.moveToElement(edit).click(edit).build().perform();
		Thread.sleep(3000);
		UtilityFile.screenShot(driver);
		Thread.sleep(3000);
		
		  studentdoc.click();
		  Thread.sleep(3000); 
		  a.moveToElement(action).perform();
		  Thread.sleep(3000); 
		  action.click();
		  Thread.sleep(3000);
		  upld.click();
		  Thread.sleep(3000); 
		  selectfile.click();
		  Thread.sleep(3000);
		  StringSelection ss = new StringSelection(prop.getProperty("path"));
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null); 
		  Robot ro = new Robot();
		  ro.delay(300);
		  ro.keyPress(KeyEvent.VK_ENTER);
		  ro.keyRelease(KeyEvent.VK_ENTER);
		  ro.keyPress(KeyEvent.VK_CONTROL);
		  ro.keyPress(KeyEvent.VK_V);
		  ro.keyRelease(KeyEvent.VK_V);
		  ro.keyRelease(KeyEvent.VK_CONTROL); 
		  ro.keyPress(KeyEvent.VK_ENTER);
		  ro.keyRelease(KeyEvent.VK_ENTER); 
		  Thread.sleep(5000); 
		  uplodd.click();
		  UtilityFile.screenShot(driver);
		  Thread.sleep(5000); 
		 

	}

	public void Addingdocument() throws Throwable {

		String path = prop.getProperty("excel");
		FileInputStream Fis1 = new FileInputStream(path);
		XSSFWorkbook WB = new XSSFWorkbook(Fis1);
		XSSFSheet WS = WB.getSheet("Sheet1");
		int Rc = WS.getLastRowNum();
		for (int i = 1; i <= Rc; i++) {
			XSSFRow WR = WS.getRow(i);
			if (WR == null) {
				break;
			}
			XSSFCell WC = WR.getCell(0);

			String fn = WC.getStringCellValue();

			application(fn);
		}

	}

	public void fee() throws InterruptedException {
		JavascriptExecutor exi = (JavascriptExecutor) driver;
		Actions a = new Actions(driver);

		Thread.sleep(3000);
		fee.click();
		Thread.sleep(3000);
		UtilityFile.screenShot(driver);
		Thread.sleep(3000);
		//a.moveToElement(addreceipt).perform();
		exi.executeScript("arguments[0].scrollIntoView();", addreceipt);

	}

	public void addingfee1(String typ, String pmt) throws Throwable {

		Actions a = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		JavascriptExecutor exi = (JavascriptExecutor) driver;

		// exi.executeScript("arguments[0].scrollIntoView();", fee);
		// wait.until(ExpectedConditions.elementToBeClickable(fee));

		addreceipt.click();
		Thread.sleep(3000);
		UtilityFile.screenShot(driver);
		Thread.sleep(3000);
		type.click();
		Thread.sleep(3000);
		dropdown.sendKeys(typ);
		Thread.sleep(3000);
		dropdown.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		paymentmode.click();
		Thread.sleep(3000);
		dropdown.sendKeys(pmt);
		Thread.sleep(3000);
		dropdown.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		feesubmit.click();
		Thread.sleep(3000);
		UtilityFile.screenShot(driver);
		Thread.sleep(3000);

	}

	public void AddingFee() throws Throwable {

		String path = prop.getProperty("excel");
		FileInputStream Fis = new FileInputStream(path);
		XSSFWorkbook WB = new XSSFWorkbook(Fis);
		XSSFSheet WS = WB.getSheet("Sheet2");
		int Rc = WS.getLastRowNum();
		for (int i = 1; i <= Rc; i++) {
			XSSFRow WR = WS.getRow(i);
			if (WR == null) {
				break;
			}
			XSSFCell WC = WR.getCell(0);
			XSSFCell WC1 = WR.getCell(1);

			String typ = WC.getStringCellValue();
			String pmt = WC1.getStringCellValue();

			addingfee1(typ, pmt);
		}

	}

	

	              public void Makepaymt(String cd ,String my,String cv) throws Throwable {
				  JavascriptExecutor exi = (JavascriptExecutor) driver;
				  Actions a = new Actions(driver);
				  
				  
			
			try {
					
				  if(driver.findElement(By.xpath("(//button[text()=' Make Payment '])[2]")).isEnabled()) 
				  {
					  Thread.sleep(3000);
						 makepaymt2.click();
						 Thread.sleep(3000);
						 UtilityFile.screenShot(driver);
						 Thread.sleep(3000);
						 exi.executeScript("arguments[0].scrollIntoView();", paystripe);
						 paystripe.click();
						 Thread.sleep(2000); 
						 driver.switchTo().frame(1);
						 Thread.sleep(3000);
						 
						 String cardNum= "4111111111111111";
						 WebElement inputField= driver.findElement(By.xpath("//*[@id='card_number']"));

						 JavascriptExecutor js= (JavascriptExecutor) driver;
						 js.executeScript("arguments[1].value = arguments[0]; ", cd, inputField); 
						 
						
						 
						// driver.findElement(By.id("card_number")).click()
						// a.moveToElement(driver.findElement(By.id("card_number"))).click().sendKeys(cd).build().perform();
						 Thread.sleep(3000);
					     a.moveToElement(driver.findElement(By.id("cc-exp"))).click().sendKeys(my).build().perform();
					     Thread.sleep(2000); 
						 csc.sendKeys(cv); 
						 Thread.sleep(3000); 
						 UtilityFile.screenShot(driver);
						 Thread.sleep(3000);
						 pay.click();
						 Thread.sleep(5000);
				  }
				  else {
						  
					    
						  System.out.println("Make payment option is not avaliable");
						  

						 
				  }
				} catch (Exception e) {
					// TODO: handle exception
				}
			
	              } 
	              public void Makepayment() throws Throwable {

	          		String path = prop.getProperty("excel");
	          		FileInputStream Fis = new FileInputStream(path);
	          		XSSFWorkbook WB = new XSSFWorkbook(Fis);
	          		XSSFSheet WS = WB.getSheet("Sheet3");
	          		int Rc = WS.getLastRowNum();
	          		for (int i = 1; i <= Rc; i++) {
	          			XSSFRow WR = WS.getRow(i);
	          			if (WR == null) {
	          				break;
	          			}
	          			XSSFCell WC = WR.getCell(0);
	          			XSSFCell WC1 = WR.getCell(1);
	          			XSSFCell WC2 = WR.getCell(2);
	          			
	          			String cd = WC.getStringCellValue();
	          			String my = WC1.getStringCellValue();
	          			String cv = WC2.getStringCellValue();
	          			
	          			Makepaymt(cd,my,cv);
	          		}
             
	              }    

	public void submitunify() throws Throwable {

		JavascriptExecutor exi = (JavascriptExecutor) driver;
		Actions a = new Actions(driver);
		// exi.executeScript("arguments[0].scrollIntoView();", filtermv);
		driver.navigate().refresh();
		a.sendKeys(Keys.PAGE_UP).build().perform();
		exi.executeScript("window.scrollBy(0,500)");
		submit.click();
		Thread.sleep(3000);
		UtilityFile.screenShot(driver);
		
		Thread.sleep(3000);
		submityes.click();
		Thread.sleep(3000);
		UtilityFile.screenShot(driver);
		Thread.sleep(3000);
		UtilityFile.NewTab(driver);
		Thread.sleep(3000);

	}

}
