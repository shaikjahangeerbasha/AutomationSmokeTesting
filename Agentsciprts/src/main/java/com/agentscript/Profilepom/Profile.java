package com.agentscript.Profilepom;

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

public class Profile extends Base {

    public WebDriver driver;
   
	
	public Profile(WebDriver driver) {
		  this.driver = driver;
	  PageFactory.initElements(driver, this);
	   }
   

	@FindBy(xpath = "//mat-icon[text()='close']")
	WebElement close;
	@FindBy(xpath ="//a[@id='dropdownMenuLink']")
	WebElement dropdownmenu;
    @FindBy(xpath = "//a[text()='Profile']")
	WebElement profile;
	@FindBy(xpath = "//button[text()='Save & Continue ']")
	WebElement savendcontinue;
	@FindBy(xpath = "//button[text()='Update ']")
	WebElement update;
	@FindBy(xpath = "//a[text()='Reference']")
	WebElement reference;
	@FindBy(xpath = "//button[text()=' Add Reference ']")
	WebElement addreference;
	@FindBy(xpath = "//input[@name='Name']")
	WebElement name;
	@FindBy(xpath = "//input[@name='Designation']")
	WebElement position;
	@FindBy(xpath = "//input[@name='Institution']")
	WebElement institution;
	@FindBy(xpath = "(//input[@name='PhoneNo'])[2]")
	WebElement phnno;
	@FindBy(xpath = "(//input[@name='Email'])[2]")
	WebElement email;
	@FindBy(xpath = "//mat-select[@name='RefResponse']")
	WebElement refreference;
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
	WebElement institution2;
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
    

}