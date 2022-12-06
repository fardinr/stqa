package stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handling_list_box {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium WebDriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("C:\\Selenium WebDriver\\index.html");
		//wd.findElement(By.name("custname")).sendKeys("Shubham");
		//Selecting the second checkbox using Xpath
		//wd.findElement(By.xpath("/html/body/select/option[2]")).click();
		Select s = new Select(wd.findElement(By.name("Cars")));  	 	
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByVisibleText("Ferrari");


	}

}
