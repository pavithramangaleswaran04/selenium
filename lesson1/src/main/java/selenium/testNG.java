package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testNG {

	
	 WebDriver driver;
	    @BeforeTest
	    void setup() {
	        // Set up the wWebDriverManager for chrome driver
	        WebDriverManager.chromedriver().setup();
	        // Create the driver object
	        driver = new ChromeDriver();
	    }
	 
	    @Test
	    void checkTheUrl() {
	        // Open the browser and go to lambdatest ecommerce website
	        driver.get("https://letcode.in/test");
	        
	        driver.findElement(By.id("testing")).click();
	        driver.findElement(By.className("card-footer-item")).click();
	               
	    }
	 
	    @AfterTest
	    void teardown() {
	       // Close the driver
	       // driver.quit();
	    }
}
