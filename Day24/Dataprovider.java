package Asserts_demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Dataprovider {
	
		@DataProvider(name="excelData")
		public Object[][] excelDataProvider() throws IOException{
			String excelPath="C:\\Users\\raviy\\OneDrive\\Desktop\\TestData\\LoginData.xlsx";
			String sheetName="sheet2";
			
			FileInputStream fis=new FileInputStream(excelPath);
			Workbook workbook=WorkbookFactory.create(fis);
			Sheet sheet=workbook.getSheet(sheetName);
			
			int rows=sheet.getPhysicalNumberOfRows();
			int cols=sheet.getRow(0).getLastCellNum();
			
			Object[][] data=new Object[rows-1][cols];
			
			for(int i=1;i<rows;i++) {
				Row row=sheet.getRow(i);
				for(int j=0;j<cols;j++) {
					Cell cell=row.getCell(j);
					data[i-1][j]=(cell==null) ? "" : cell.toString();
				}
			}
			workbook.close();
			fis.close();
			return data;
	}
		@Test(dataProvider="excelData")
		public void search(String search) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("http://zero.webappsecurity.com/");
			WebElement s=driver.findElement(By.id("searchTerm"));
			s.click();
			s.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
		}
  
}
