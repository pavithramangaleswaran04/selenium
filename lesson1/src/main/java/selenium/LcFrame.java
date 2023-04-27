package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LcFrame {

	WebDriver driver;
    @BeforeTest
    void setup() {
        // Set up the wWebDriverManager for chrome driver
        WebDriverManager.chromedriver().setup();
        // Create the driver object
        driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


    }
    
    @Test

	public void innerHtml() {

		
		driver.get("https://letcode.in/frame");
		//driver.findElement(By.linkText("Inner HTML")).click();


	
	
		//Enter details
		driver.switchTo().frame("firstFr");
		driver.findElement(By.name("fname")).sendKeys("Pavithra");
		driver.findElement(By.name("lname")).sendKeys("Mangaleswaran");

		//
		driver.switchTo().frame(1);
		driver.findElement(By.name("email")).sendKeys("email");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[text()='Refer the video']")).click();
		

	}

}
