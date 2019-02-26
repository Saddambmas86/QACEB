package ceb.datagenerator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataGenerator {

@DataProvider(name="QA")
public static Object[][] dataGenerator() throws IOException{
FileInputStream fin=new FileInputStream("./testdata/TestData.xlsx");

XSSFWorkbook wb=new XSSFWorkbook(fin);
XSSFSheet sheet=wb.getSheet("Login");

	int numberofData=sheet.getPhysicalNumberOfRows();

	Object data[][]=new Object[numberofData][2];

	for(int i=0;i<numberofData;i++){

	XSSFRow row=sheet.getRow(i);
	XSSFCell username= row.getCell(0);
	XSSFCell password=row.getCell(1);
	
	if(username.getCellType()== username.CELL_TYPE_NUMERIC){
	data[i][0]=username.getNumericCellValue();
	}
	else{
		data[i][0]=username.getStringCellValue();
	}
	
	if(password.getCellType()==password.CELL_TYPE_NUMERIC){
	data[i][1]=password.getNumericCellValue();
	}
	else{
		data[i][1]=password.getStringCellValue();	
	}
	
	}
	return data;
	}

	
@DataProvider(name="QA2")	
public static Object[][] dataGenerator2() throws Exception{

FileInputStream Fin=new FileInputStream("./testdata/TestData.xlsx");

XSSFWorkbook wb=new XSSFWorkbook(Fin);
XSSFSheet Sheet=wb.getSheet("Registration");
int numberofRow= Sheet.getPhysicalNumberOfRows();

Object data[][]=new Object[numberofRow][3];

for(int i=0;i<numberofRow;i++){
	
XSSFRow row=Sheet.getRow(i);
XSSFCell column1=row.getCell(0);
XSSFCell column2=row.getCell(1);
XSSFCell column3=row.getCell(2);

data[i][0]=column1.getStringCellValue();
data[i][1]=column2.getStringCellValue();
data[i][2]=column3.getStringCellValue();	
}

return data;	
	
}
	
	
	
}
