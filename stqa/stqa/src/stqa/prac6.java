package stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium WebDriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("http://demo.t3-framework.org/joomla30/index.php/en/joomla-pages/sample-page-2/login-page");
		//tagname#id
		wd.findElement(By.cssSelector("input#username")).sendKeys("admin");  	 	
		//tagname[attribute=value of attribute]
		
		//tabname.classname
		WebElement w=wd.findElement(By.cssSelector("input[id=password]"));
				w.sendKeys("admin123");
		w.submit();	
		}

}
