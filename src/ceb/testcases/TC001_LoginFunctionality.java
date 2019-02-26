package ceb.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ceb.base.base;
import ceb.datagenerator.DataGenerator;
import ceb.pages.LoginPage;

public class TC001_LoginFunctionality extends base{

@Test(dataProvider="QA",dataProviderClass=DataGenerator.class)	
public void tc001_LoginFunctionality(String uname, String pass) throws Exception{
LoginPage login=new LoginPage(driver);
login.enterUserName(uname);
Thread.sleep(1000);
login.enterPassword(pass);
Thread.sleep(1000);
login.clickLogin();	
}




	
}
