package second;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {

	
	

	public void name() {
		
		WebDriver driver;
		// TODO Auto-generated method stub
		  WebDriverManager.chromedriver().setup();
	        // Create the driver object
	        driver = new ChromeDriver();
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get("https://letcode.in/test");


	}
}
