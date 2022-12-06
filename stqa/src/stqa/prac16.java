package stqa;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow; 
import org.apache.poi.xssf.usermodel.XSSFCell; 
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook; 
import org.apache.poi.xssf.usermodel.XSSFWorkbook; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class prac16
{
public static void main(String[] args) throws Exception
{
System.setProperty("webdriver.chrome.driver","C:\\\\Selenium WebDriver\\\\ChromeDriver\\\\chromedriver_win32\\\\chromedriver.exe"
);
WebDriver wd= new ChromeDriver();
wd.get("https://opensource-demo.orangehrmlive.com/");
FileInputStream fis = new FileInputStream("C:\\\\\\\\Selenium WebDriver\\ExcelData.xlsx");
System.out.println();

int vRow=1, vColumn=1;
String value=null;  
Workbook  wk = new XSSFWorkbook(fis);
System.out.println(wk);
Sheet  sh = wk.getSheet("ReadData");

Row row=sh.getRow(vRow); //returns the logical row  
Cell cell=row.getCell(vColumn); //getting the cell representing the given column  
value=cell.getStringCellValue();    //getting cell value  


System.out.print(value);


//for(int i=1; i<=sh.getLastRowNum(); i++)
//{
//	XSSFRow rw = sh.getRow(i);
//	XSSFCell un = rw.getCell(0);
//	XSSFCell pw = rw.getCell(1);
//	System.out.println(un + " "+ pw);
//	wd.findElement(By.id("txtUsername")).sendKeys(un.toString());  	 	 	
//	wd.findElement(By.name("txtPassword")).sendKeys(pw.toString());  	 	 	
//	wd.findElement(By.className("button")).click();
//	}
	}
	}
	 
