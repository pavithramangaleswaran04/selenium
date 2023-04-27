package selenium;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LcElement {

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
	public void findelemnt() throws InterruptedException {

		
		driver.get("https://letcode.in/test");

		//go to element
		driver.findElement(By.xpath("//a[@class='card-footer-item' and @href='/elements']")).click();

		// textfield
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ortonikc");
		//textfield.sendKeys("ortonikc",Keys.TAB);




		//search button
		driver.findElement(By.xpath("//button[@id='search']")).click();

		Thread.sleep(3000);

	      WebElement i = driver.findElement(By.xpath("//img[@alt='Placeholder image']"));
	      boolean n = i.isDisplayed();
	      assert(n);
	      System.out.println("present"+n);

		
		
		
/*
		Thread.sleep(3000);
		//identify image
	      WebElement i = driver.findElement(By.xpath("//img[@alt='Placeholder image']"));
	      // Javascript executor to check image
	      Boolean p = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);

	      //verify if status is true
	      if (p) {
	         System.out.println("Logo present");
	      } else {
	         System.out.println("Logo not present");
	      }*/
		// sleep
		Thread.sleep(3000);
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='block']//ol[@type='1']"));
		for (WebElement link : links) {
			System.out.println(link.getText());
		}
	}
}
