package ceb.base;

import org.apache.bcel.classfile.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import ceb.utility.Utility1;

public class base {
	
public static WebDriver driver;		

@BeforeMethod
public void InitiateBrowser() throws Exception{

if(Utility1.fetchValueFromFile("browser").equalsIgnoreCase("chrome")){
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
driver=new ChromeDriver();
}

else if(Utility1.fetchValueFromFile("browser").equalsIgnoreCase("Firefox")){
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");	
	driver=new FirefoxDriver();
}

else if(Utility1.fetchValueFromFile("browser").equalsIgnoreCase("ie")){
	System.setProperty("webdriver.ie.driver", "./driver/geckodriver.exe");	
	driver=new InternetExplorerDriver();
}

else{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	driver=new ChromeDriver();	
}

driver.get(Utility1.fetchValueFromFile("URL"));
}


@AfterMethod	
public void dropBrowser(){
	driver.quit();
}
	

}
