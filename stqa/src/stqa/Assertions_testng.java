package stqa;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Assertions_testng {

	@Test
	public void assertOrange() {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium WebDriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.google.co.in/");
		String ExpectedTitle="Google";  //if there is a matching result then will get as PASS
		//String ExpectedTitle= "Orange"; // if there is no matching result then will get FAIL.
		String ActualTitle=wd.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		System.out.println("Actual Title of WebPage----->" + ActualTitle);

	}

}
