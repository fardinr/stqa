package stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class button_redio_text_box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium WebDriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("C:\\\\Selenium WebDriver\\\\form.html");
		// Maximize window
		wd.manage().window().maximize();
		wd.findElement(By.name("firstname")).sendKeys("mayur");  	 	
		wd.findElement(By.name("middlename")).sendKeys("vilas");
		wd.findElement(By.name("lastname")).sendKeys("bhujbal");  	 	
		//wd.findElement(By.name("hobby[ ]")).click();
		wd.findElement(By.name("Course")).click();
		//Selecting the first checkbox using XPath
		wd.findElement(By.xpath("/html/body/form/select/option[5]")).click();
		//Selecting the second checkbox using Xpath
		wd.findElement(By.name("male")).click();
		wd.findElement(By.name("click")).click();
	}

}
