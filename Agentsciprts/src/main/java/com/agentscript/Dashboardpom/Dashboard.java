package com.agentscript.Dashboardpom;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
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

public class Dashboard extends Base {

    public WebDriver driver;
   
	
	public Dashboard(WebDriver driver) {
		  this.driver = driver;
	  PageFactory.initElements(driver, this);
	   }
   

	@FindBy(xpath = "//mat-icon[text()='close']")
	WebElement close;
	@FindBy(xpath ="//img[@title='Knowledge base']")
	WebElement knowledgebase;
    @FindBy(xpath = "//input[@placeholder='Category Search']")
	WebElement categorysearch;
	@FindBy(xpath = "(//div[text()=' Document / Video '])[1]")
	WebElement documentvideo;
	@FindBy(xpath = "//span[text()='Test']")
	WebElement test;
	@FindBy(xpath = "//span[text()='Connect with us on']")
	WebElement connectwithus;
	@FindBy(xpath = "//div[text()='Application Status']")
	WebElement applistuatus;
	@FindBy(xpath = "//input[@placeholder='Enter MSM Application ID']")
	WebElement entermsmappliid;
	@FindBy(xpath = "(//div[@class='cb-msg'])[2]")
	WebElement FAQS;
	@FindBy(xpath = "//a[text()='Continue to Chat']")
	WebElement continuechat;
	@FindBy(xpath = "//a[text()='use WhatsApp Web']")
	WebElement usewhatsup;
	@FindBy(xpath = "//div[text()='Chat with us']")
	WebElement chatwithus;
	@FindBy(xpath = "//mat-icon[text()='more_vert']")
	WebElement moreoption;
	@FindBy(xpath = "//button[text()='Continue to Apply']")
	WebElement continueapply;
	@FindBy(xpath = "//a[text()='Restart chat']")
	WebElement restartchat;
    @FindBy(xpath = "//a[text()='Privacy policy']")
	WebElement privacypolicy;
	@FindBy(xpath = "(//mat-icon[text()='close'])[1]")
	WebElement closewhatup;
	@FindBy(xpath = "//img[@title='Forms']")
	WebElement forms;
	@FindBy(xpath = "(//span[text()='Institution'])[2]")
	WebElement institution;
	@FindBy(xpath = "//input[@aria-label='dropdown search']")
	WebElement dropdown;
	@FindBy(xpath = "//input[@placeholder='Category Search']")
	WebElement category;
	@FindBy(xpath = "(//img[@alt='download'])[1]")
	WebElement formdownld;
	
	@FindBy(xpath = "//img[@title='Feedback']")
	WebElement feedback;
	@FindBy(xpath = "//textarea[@name='Message']")
	WebElement message;
	@FindBy(xpath = "//span[@class='mat-checkbox-inner-container']")
	WebElement checbox;
	@FindBy(xpath = "//button[text()='Update']")
	WebElement update;
	
	@FindBy(xpath = "//img[@title='Notifications']")
	WebElement notification;
	@FindBy(xpath = "//button[@title='Apply Filter']")
	WebElement filter;
	@FindBy(xpath = "//div[5]/div/table/tbody/tr[2]/td[2]/div/div[2]/div/div/div[1]/input")
	WebElement search;
	@FindBy(xpath = "//div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[1]")
	WebElement edit;
	@FindBy(xpath = "//div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[3]/span")
	WebElement readmore;
	
	
	@FindBy(xpath = "//img[@title='Assigned task to me and my team']")
	WebElement task;
	@FindBy(xpath = "//button[text()='Add Task']")
	WebElement addtask;
	@FindBy(xpath ="//*[@name='TaskType']//span[text()='Type']")
	WebElement type;
	@FindBy(xpath = "//input[@name='TaskSubject']  ")
	WebElement subject;
	@FindBy(xpath = "//textarea[@name='TaskDescription']")
	WebElement description;
	@FindBy(xpath = "//button[text()='Add']  ")
	WebElement add;
	@FindBy(xpath = "//mat-icon[text()='add']")
	WebElement adding;
	@FindBy(xpath = "//input[@data-placeholder='Please type the name of the document']")
	WebElement document;
	@FindBy(xpath = "//input[@name='DocumentFile'] ")
	WebElement choosefile;
	@FindBy(xpath = "//button[text()='Upload'] ")
	WebElement upload;
	
	@FindBy(xpath = "//*[@placeholder='Start Hours']/mat-form-field/div/div/div[3]/mat-select")
	WebElement starthours;
	@FindBy(xpath = "//*[@placeholder='Start Minutes']/mat-form-field/div/div/div[3]/mat-select")
	WebElement startminute;
	@FindBy(xpath = "//input[@name='ActualHours']  ")
	WebElement actualhours;
	@FindBy(xpath = "//input[@name='ActualMinutes']  ")
	WebElement actualmnt;
    

	
	   public void knowledgebase(String ctt) throws Throwable {
		   Actions a = new Actions(driver);
			
	    	
	    	
			   // close.click();
				a.moveToElement(knowledgebase).perform();
				Thread.sleep(3000);
				knowledgebase.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				categorysearch.sendKeys(ctt);
				Thread.sleep(3000);
				a.moveToElement(documentvideo).perform();
				documentvideo.click();
				Thread.sleep(3000);
				test.click();
				Thread.sleep(5000);
				UtilityFile.screenShot(driver);
				UtilityFile.windowhandledparent(driver);
				Thread.sleep(3000);
				close.click();
				
				 }
	
	public void forms(String inst ,String ct) throws Throwable {
     
		   
 		    forms.click();
 		   
 			Thread.sleep(2000);
 			UtilityFile.screenShot(driver);
 			Thread.sleep(2000);
 			institution.click();
 			Thread.sleep(3000);
 			dropdown.sendKeys(inst);
 			Thread.sleep(3000);
 			dropdown.sendKeys(Keys.ENTER);
 			category.sendKeys(ct);
 			Thread.sleep(3000);
 			category.sendKeys(Keys.ENTER);
 			Thread.sleep(3000);
 			formdownld.click();
 			Thread.sleep(3000);
 			UtilityFile.screenShot(driver);
 			Thread.sleep(2000);
 			UtilityFile.windowhandledparent(driver);
 		
		 }
	public void feedback(String ms) throws Throwable {
     
 	
 	       // close.click(); 
		    Actions a = new Actions(driver);
		    a.moveToElement(feedback).perform();
 	        feedback.click();
 	        Thread.sleep(2000);
 	        UtilityFile.screenShot(driver);
			Thread.sleep(2000);
 			message.sendKeys(ms);
 			Thread.sleep(3000);
 			checbox.click();
 			Thread.sleep(3000);
 			update.click();
 			Thread.sleep(2000);
 	        UtilityFile.screenShot(driver);
 			Thread.sleep(3000);
 			
	 }
	public void Notification(String nsr) throws Throwable {
    	
		Actions a = new Actions(driver);
		a.moveToElement(notification).perform();
		Thread.sleep(3000);
		notification.click();
		Thread.sleep(2000);
	    UtilityFile.screenShot(driver);
		Thread.sleep(3000);
		filter.click();
		Thread.sleep(3000);
		a.moveToElement(search).perform();
		search.sendKeys(nsr);
		Thread.sleep(3000);
		a.moveToElement(edit).perform();
		edit.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		filter.click();
	
		Thread.sleep(3000);
		readmore.click();
		Thread.sleep(3000);
		close.click();
	}
	public void Task(String tp,String hr,String mn,String sub,String des,String docnm) throws Throwable {
    	
		Actions a = new Actions(driver);
		//close.click(); 
    	task.click();
    	Thread.sleep(3000);
        UtilityFile.screenShot(driver);
        Thread.sleep(2000);
    	addtask.click();
    	type.click();
    	Thread.sleep(3000);
    	dropdown.sendKeys(tp);
    	dropdown.sendKeys(Keys.ENTER);
    	Thread.sleep(3000);
    	starthours.click();
    	Thread.sleep(3000);
    	dropdown.sendKeys(hr);
    	dropdown.sendKeys(Keys.ENTER);
    	Thread.sleep(3000);
    	startminute.click();
    	Thread.sleep(3000);
    	dropdown.sendKeys(mn);
    	dropdown.sendKeys(Keys.ENTER);
    	Thread.sleep(3000);
    	subject.sendKeys(sub);
    	Thread.sleep(3000);
    	description.sendKeys(des);
    	Thread.sleep(3000);
    	a.moveToElement(adding).perform();
    	adding.click();
    	Thread.sleep(3000);
    	UtilityFile.screenShot(driver);
    	Thread.sleep(2000);
    	document.sendKeys(docnm);
    	a.moveToElement(choosefile).click(choosefile).build().perform();  
		StringSelection ss = new
		StringSelection(prop.getProperty("path")); 
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		  Robot robot = new Robot();
		  robot.delay(250);
		  robot.keyPress(KeyEvent.VK_ENTER);
		  robot.keyRelease(KeyEvent.VK_ENTER);
		  robot.keyPress(KeyEvent.VK_CONTROL);
		  robot.keyPress(KeyEvent.VK_V);
		  robot.keyRelease(KeyEvent.VK_V);
		  robot.keyRelease(KeyEvent.VK_CONTROL);
		  robot.keyPress(KeyEvent.VK_ENTER);
		  robot.delay(90); 
		  robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		upload.click();
		Thread.sleep(3000);
		a.moveToElement(add).perform();
		Thread.sleep(3000);
		add.click();
		Thread.sleep(2000);
	
	}
    
	
    
 public void Whatsup(String vnm,String invnm) throws Throwable {
    	Actions a = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		JavascriptExecutor exi = (JavascriptExecutor) driver;
    
		    //close.click();
			Thread.sleep(2000);
			connectwithus.click();
			Thread.sleep(2000);
			UtilityFile.screenShot(driver);
	    	
			Thread.sleep(3000);
			applistuatus.click();
			Thread.sleep(3000);
			entermsmappliid.sendKeys(vnm);
			entermsmappliid.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			applistuatus.click();
			Thread.sleep(3000);
			entermsmappliid.sendKeys(invnm);
			entermsmappliid.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
		    a.moveToElement(FAQS).perform();
			FAQS.click();
			Thread.sleep(10000);
			
			UtilityFile.screenShot(driver);
			Thread.sleep(2000);
			UtilityFile.windowhandledparent(driver);
			Thread.sleep(3000);
			moreoption.click();
			Thread.sleep(3000);
			restartchat.click();
			Thread.sleep(3000);
			moreoption.click();
			Thread.sleep(3000);
			privacypolicy.click();
			Thread.sleep(10000);
			UtilityFile.screenShot(driver);
			Thread.sleep(2000);
			UtilityFile.windowhandledparent(driver);
			Thread.sleep(3000); 
			a.moveToElement(chatwithus).perform();
			chatwithus.click();
			String parent=driver.getWindowHandle();
		    Set<String>s=driver.getWindowHandles();
		    Iterator<String> I1= s.iterator();
		    while(I1.hasNext())
			{
		    String child_window=I1.next();
		    if(!parent.equals(child_window))
			{
			driver.switchTo().window(child_window);
			continuechat.click();
			usewhatsup.click();
			 driver.close();
		   }
		    }
		    driver.switchTo().window(parent);
			closewhatup.click();
		} 
     
   public void Dashboard() throws Throwable
 	
   {
 	        String path=prop.getProperty("excel");
 			FileInputStream Fis=new FileInputStream(path);
 			XSSFWorkbook WB=new XSSFWorkbook(Fis); 
 			XSSFSheet WS=WB.getSheet("Sheet5"); 
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
 				
 				String ctt=WC.getStringCellValue(); 
 				String inst=WC1.getStringCellValue();
 				String ct=WC2.getStringCellValue();
 				String ms=WC3.getStringCellValue();
 				String nsr=WC4.getStringCellValue();
 				
 				String tp=WC5.getStringCellValue();
 				String hr=WC6.getStringCellValue();
 				String mn=WC7.getStringCellValue();
 				String sub=WC8.getStringCellValue();
 				String des=WC9.getStringCellValue();
 				String docnm=WC10.getStringCellValue();
 				
 				
 				String vnm=WC11.getStringCellValue();
 				String invnm=WC12.getStringCellValue();
 				
 				knowledgebase(ctt);
 				forms(inst,ct);
 				Notification(nsr);
 				Task(tp,hr,mn,sub,des,docnm);
 				feedback(ms);
 			    Whatsup(vnm,invnm);
 				
 				}
 			}   
    
	}   

