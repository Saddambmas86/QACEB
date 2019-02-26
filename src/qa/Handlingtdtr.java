package qa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handlingtdtr {
	
public static void main(String...s) throws Exception{
	
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shusain\\Desktop\\JS\\Selenium\\Selenium Setup\\geckodriver-v0.18.0-win32\\geckodriver.exe");	
WebDriver driver= new FirefoxDriver();	

driver.get("https://www.toolsqa.com/automation-practice-table/");
WebElement table=driver.findElement(By.id("content"));
List<WebElement> rows = table.findElements(By.tagName("tr"));
List<WebElement> column = table.findElements(By.tagName("td"));

int RowNum=2;
int colNum=6;


if(RowNum<=rows.size() && colNum<=column.size() ){
	
driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr["+RowNum+"]/td["+colNum+"]")).click();
System.out.println("Wait start");
Thread.sleep(3000);
System.out.println("click successful");
	
}





}
	
	

}
