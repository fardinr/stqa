package stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handling_dropdown {

	public static void main(String[] args) throws InterruptedException {
			//Demo cssSElector
		System.setProperty("webdriver.chrome.driver","C:\\Selenium WebDriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://blazedemo.com/");
		Select s = new Select(wd.findElement(By.name("fromPort")));
		s.selectByIndex(2);
		//s.selectByValue("Boston");
		s.selectByVisibleText("Boston");
		Select q = new Select(wd.findElement(By.name("toPort")));
		q.selectByIndex(3);
		}
		}
