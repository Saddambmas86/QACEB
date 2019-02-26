package ceb.assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ceb.utility.Utility1;

public class Compare {

	
public static boolean validateURL(WebDriver driver, String ExpURL) throws Exception{
boolean flag=false;
if(Utility1.fetchValueFromFile("URL").equalsIgnoreCase(ExpURL)){
	flag=true;
}
return flag;	
}

public static boolean validateTitle(WebDriver driver, String ExpTitle){
boolean flag=false;

if(driver.getTitle().equalsIgnoreCase(ExpTitle)){
	flag=true;
}
return flag;		
}

public static boolean LoginSuccessfull(WebDriver driver, String ExpText){
	
boolean flag=false;

String A=driver.findElement(By.xpath("//a[text()='Home']")).getText();

if(A.equalsIgnoreCase("Home")){
	System.out.println("Login successfull");
	flag=true;
}
return flag;

}


}
