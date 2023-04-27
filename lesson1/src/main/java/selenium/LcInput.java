package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LcInput {
	
	 WebDriver driver;
	    @BeforeTest
	    void setup() {
	        // Set up the wWebDriverManager for chrome driver
	        WebDriverManager.chromedriver().setup();
	        // Create the driver object
	        driver = new ChromeDriver();
			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    
	        driver.get("https://letcode.in/test");
	        
	        driver.findElement(By.id("testing")).click();
	        driver.findElement(By.xpath("//a[@class='card-footer-item' and @href='/edit']")).click();
	        driver.findElement(By.id("fullName")).sendKeys("Pavithra Mangaleswaran");
	       	driver.findElement(By.id("join")).sendKeys(" person", Keys.TAB);
	       	String myValue = driver.findElement(By.id("getMe")).getAttribute("value");
	       	System.out.println(myValue);
	       	
	        driver.findElement(By.id("clearMe")).clear();
	     	boolean isEdit = driver.findElement(By.id("noEdit")).isEnabled();
         	System.out.println(isEdit);
         	
	     	String  isreadonly = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
         	System.out.println(isreadonly);

	    }
	   	
	    
	    
	    
	    
	    
	    @AfterTest
	    void teardown() {
	       // Close the driver

	       // driver.quit();
	    }

}
