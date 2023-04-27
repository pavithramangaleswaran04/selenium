package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draft {
	
	WebDriver driver;
	public void checkbox() {
		
	
	WebDriverManager.chromedriver().setup();
	// Create the driver object
	driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://letcode.in/test");

	
	
	
	
	
	}
}
