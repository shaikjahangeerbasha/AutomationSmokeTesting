package com.agentscript.utility;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.agentscript.base.Base;

public class UtilityFile extends Base
{
	static ArrayList<String> tab;
	public static void screenShot(WebDriver driver) 
	{
		DateFormat dateFormate=new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		Date date =new Date();
		String d=dateFormate.format(date);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("C:\\Users\\BASHA\\eclipse-workspace1\\Agentsciprts\\target\\Screenshortslogin\\"+d+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void NewTab(WebDriver driver)
	{

		
		try {
			tab = new ArrayList<>();
			Thread.sleep(3000);
			Robot b = new Robot();
			b.keyPress(KeyEvent.VK_CONTROL);
			b.keyPress(KeyEvent.VK_SHIFT);
			b.keyPress(KeyEvent.VK_N);
			b.keyRelease(KeyEvent.VK_CONTROL);
			b.keyRelease(KeyEvent.VK_SHIFT);
			b.keyRelease(KeyEvent.VK_N);
			Thread.sleep(3000);
			tab = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tab.get(1));
			driver.get("https://appuatmsm.azurewebsites.net");

		} catch (Throwable e) {
			System.out.println(e.getMessage());
			tab = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tab.get(1));
			driver.get("https://appuatmsm.azurewebsites.net");

		}
		
	}
	public static void Tab0(WebDriver driver)
	{
		try {
			
		
		tab = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(0));
		} catch (Exception e) {
			tab = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tab.get(0));
			
		}
	}
	public static void Tab1(WebDriver driver)
	{
		try {
			
		tab = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(1));
		} catch (Exception e) {
			tab = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tab.get(1));
		}
	}
public static void windowhandledparent(WebDriver driver)
{
	
	String parent=driver.getWindowHandle();
    Set<String>s=driver.getWindowHandles();
    Iterator<String> I1= s.iterator();
    while(I1.hasNext())
	{
    String child_window=I1.next();
    if(!parent.equals(child_window))
	{
	driver.switchTo().window(child_window);
    driver.close();
	}
    }
	driver.switchTo().window(parent);
	
	
}



} 	
	
