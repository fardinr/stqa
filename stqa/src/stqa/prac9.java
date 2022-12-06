package stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium WebDriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		// Loading a URL  	            
		wd.get("https://www.redbus.in/");
		// Locating and typing in From text box.
		WebElement fromTextBox = wd.findElement(By.id("src"));
		fromTextBox.sendKeys("mum");
		// Put a sleep wait
		Thread.sleep(2000);
		// Clicking on first search result
		wd.findElement(By.xpath("//li[@select-id='results[0]']")).click();
		// Let's print the select value
		String selectedCity = wd.findElement(By.id("src")).getAttribute("value");
		System.out.println("Selected city in From is :"+selectedCity);
		// Closing browser
		//wd.quit();

	}

}
