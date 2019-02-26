package qa;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class TC11 {

public static void main(String...s){

System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shusain\\Desktop\\JS\\Selenium\\Selenium Setup\\geckodriver-v0.18.0-win32\\geckodriver.exe");	
WebDriver driver = new FirefoxDriver();	

driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=83c4a9e530565b0d4453c56381975876");

Select S1=new Select(driver.findElement(By.name("country")));
S1.selectByVisibleText("THAILAND");


java.util.List<WebElement> TT1=S1.getOptions();
System.out.println(TT1.size());

int Size1=TT1.size();

for(int i=0;i<Size1;i++){
	String A=TT1.get(i).getText();
	System.out.println(A);
}
}	
}
