package ceb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ceb.utility.Utility1;

public class LoginPage {

WebDriver driver;	
	
public LoginPage(WebDriver driver){
	this.driver=driver;
}
	
public void enterUserName(String uname) throws Exception{	
driver.findElement(By.id(Utility1.fetchValueFromFile("Login_username_id"))).sendKeys(uname);
}
	
public void enterPassword(String pass) throws Exception{
	driver.findElement(By.id(Utility1.fetchValueFromFile("Login_password_id"))).sendKeys(pass);
}	

public void enterFirstName(String fname) throws Exception{	
driver.findElement(By.id("u_0_n")).sendKeys(fname);
}

public void enterSurName(String lname) throws Exception{	
driver.findElement(By.id("u_0_p")).sendKeys(lname);
}

public void enterMobile(String Mnumber) throws Exception{	
driver.findElement(By.id("u_0_s")).sendKeys(Mnumber);
}

public void clickLogin() throws Exception{
driver.findElement(By.id(Utility1.fetchValueFromFile("Login_clickbutton_id"))).click(); 	
}


}
