package com.agentscript.end;

import org.testng.annotations.Test;

import com.agentscript.Createstudentpom.Applisubmitinstitute;
import com.agentscript.Createstudentpom.Createstudent;
import com.agentscript.Createstudentpom.Editstudent;
import com.agentscript.Createstudentpom.LogInPage;
import com.agentscript.base.Base;

public class studentcreateendtoend extends Base {

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
	  public void Crtstudent() throws Throwable{ 
		  Createstudent  crtstnt = new Createstudent(driver);
		  crtstnt.Createstudent();
	  
	  } 
	  
	 
     @Test(priority = 3)
	  public void Editstudnt() throws Throwable{
		  Editstudent edtstd = new Editstudent(driver);
		  edtstd.Addapplication();
		  
     }
     @Test(priority = 4)
	  public void Editstudnnt() throws Throwable{
		  Editstudent edtst = new Editstudent(driver);
	
		  edtst.Addingdocument();
		  edtst.fee();
		  edtst.AddingFee();
		  edtst.Makepayment();
		  edtst.submitunify();
	 
} 

  @Test(priority = 5)
  public void Adminlogin() throws Throwable{
  Applisubmitinstitute stoin = new Applisubmitinstitute(driver);
  stoin.adminlgin(prop.getProperty("adminun"), prop.getProperty("adminpwd"));
  stoin.submitinstitute();
  
  }  
 
	 
}