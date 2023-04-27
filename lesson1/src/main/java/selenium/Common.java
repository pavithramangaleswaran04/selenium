package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Common {
	WebDriver driver;

	public void com() {
		
		
	        // Set up the wWebDriverManager for chrome driver
	        WebDriverManager.chromedriver().setup();
	        // Create the driver object
	        driver = new ChromeDriver();
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


	}

}
