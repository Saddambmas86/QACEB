package qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class printdynamicTable {
	
public static void main(String...s){

System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shusain\\Desktop\\JS\\Selenium\\Selenium Setup\\geckodriver-v0.18.0-win32\\geckodriver.exe");	

WebDriver driver= new FirefoxDriver();
driver.get("http://toolsqa.com/automation-practice-table");

for(int i=1;i<=5;i++){

String SValue=driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr["+i+"]/th")).getText();	
System.out.println("Headers are: "+SValue);
for(int j=1;j<=5;j++){
String AllValues=driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
System.out.println("Columns are: "+ AllValues);
System.out.println();
			
}
		}
}
}