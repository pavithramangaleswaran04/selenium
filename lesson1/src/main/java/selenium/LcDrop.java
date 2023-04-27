package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LcDrop {
	WebDriver driver;

 	@Test
	public void aui1() {
		
 	// Set up the wWebDriverManager for chrome driver
 			WebDriverManager.chromedriver().setup();
 			// Create the driver object
 			driver = new ChromeDriver();
 			driver.manage().window().maximize();
 			//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://letcode.in/test");
		driver.findElement(By.xpath("//a[@class='card-footer-item' and @href='/dropable']")).click();
		
		//Drop
				WebElement from = driver.findElement(By.id("draggable"));
				WebElement to = driver.findElement(By.id("droppable"));
				Actions action = new Actions(driver);
				action.dragAndDrop(from, to).build().perform();
			

		
	}

}
