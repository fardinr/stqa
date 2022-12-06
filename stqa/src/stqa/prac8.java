package stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class prac8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Selenium WebDriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://blazedemo.com/");
		Select s=new Select(wd.findElement(By.xpath("/html/body/div[3]/form/select[2]") ));
		s.selectByIndex(2);
		wd.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
//		tagname[@attribute=value of attribute]  	 	
		wd.findElement(By.xpath("//input[@value='LOGIN']")).click();

	}

}
