package stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium WebDriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver(); 
		wd.get("https://www.google.com/");
		wd.manage().window().maximize();
		WebElement p= wd.findElement(By.name("q"));
		p.sendKeys("marvel cinamatic universe");
		p.submit();
		//wd.findElement(By.className("gNO89b")).click();
	}

}
