package stqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium WebDriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.techlistic.com");

		//Maximize window
		wd.manage().window().maximize();

		//Navigate directly to some URL
		wd.navigate().to("https://www.techlistic.com/p/java.html");
		//Navigate Back
		wd.navigate().back();
		//Navigate Forward
		wd.navigate().forward();
		//Refresh Page
		wd.navigate().refresh();
		//close Browser
		wd.close();

	}
}
