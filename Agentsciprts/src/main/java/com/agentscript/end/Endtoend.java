package com.agentscript.end;

import org.testng.annotations.Test;

import com.agentscript.base.Base;
import com.agentscript.pom.Signin;


public class Endtoend extends Base {
	
	@Test(priority = 0, groups = { "sanity" }, alwaysRun = true)
    public void intibase() throws Throwable {
		Base base = new Base();
		base.initialization();
	}

	  @Test(priority = 1)
	  public void Differentagentlogin() throws Throwable{
		  Signin agnt = new Signin(driver);
	      agnt.Loginagents();
	 
}
	
}
