package ceb.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ceb.base.base;
import ceb.datagenerator.DataGenerator;
import ceb.pages.LoginPage;

public class TC002_Registration extends base {

	@Test(dataProvider="QA2",dataProviderClass=DataGenerator.class)
	public void tc002_Registration(String fname, String lname, String Mnumber) throws Exception{
	LoginPage login=new LoginPage(driver);
	login.enterFirstName(fname);
	Thread.sleep(2000);
	login.enterSurName(lname);
	Thread.sleep(2000);
	login.enterMobile(Mnumber);	
	Thread.sleep(2000);
	driver.findElement(By.id("u_0_n")).sendKeys("Saddam");
	}	
	
	
}
