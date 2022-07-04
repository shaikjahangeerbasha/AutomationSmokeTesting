package com.agentscript.end;

import org.testng.annotations.Test;

import com.agentscript.Createstudentpom.LogInPage;
import com.agentscript.Dashboardpom.Dashboard;
import com.agentscript.Programsearchpom.Programsearch;
import com.agentscript.base.Base;

public class Dashboardendtoend extends Base {
	@Test(priority = 0, alwaysRun = true)
    public void intibase() throws Throwable {
		Base base = new Base();
		base.initialization();
	}

	@Test(priority = 1)

	public void login() throws Throwable {
		LogInPage log1 = new LogInPage(driver);
		log1.Login(prop.getProperty("un3"), prop.getProperty("pd3"));
	
	}

	
	  @Test(priority = 2)
	  public void Dashboardfeatures() throws Throwable{ 
		  Dashboard  knwbs = new Dashboard(driver);
		  knwbs.Dashboard();
		
	  
	  } 

}

