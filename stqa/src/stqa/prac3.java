package stqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class prac3 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium WebDriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://the-internet.herokuapp.com/frames";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// identify element  	      
		driver.findElement(By.linkText("Nested Frames")).click();  	      
		// switch to frame with frame name and identify inside element  	      
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-left");//name of frame
		WebElement l = driver.findElement(By.cssSelector("body"));//content in body tag
		System.out.println("Bottom frame text: " +l.getText());
		// switch to main page  	      
		driver.switchTo().defaultContent();  	      
		//driver.quit();
		}

		}
