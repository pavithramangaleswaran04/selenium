package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LcTableSimple {


	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeTest
	void setup() {
		// Set up the wWebDriverManager for chrome driver
		WebDriverManager.chromedriver().setup();
		// Create the driver object
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}
 
	@Test
	public void name() {
		
		 List<WebElement> elem = driver.findElements(By.xpath("//div[@class='refinement brand']/descendant::a"));
	        for(WebElement li:elem)
	        {
	            System.out.println(li.getText());
	        }

	        List<WebElement> elem1 = driver.findElements(By.xpath("//div[@class='refinement brand']/descendant::a/span[2]"));
	        int sum = 0;
	        for(WebElement li1:elem1)
	        {
	            System.out.println(li1.getText());
	            String s = li1.getText().replace("(", "");
	            sum = sum + Integer.parseInt(s.replace(")", ""));
	        }


	        System.out.println("Total sum is: " + sum);
	        int totalAppearingOnPage = Integer.parseInt(driver.findElement(
	                By.xpath("//h1[normalize-space(text())='Best Selling Fairway woods']/following::div[@class='results-hits'][1]/span")).
	                getText());
	        System.out.println("Total appearing on page: " + totalAppearingOnPage);
	        driver.quit();
	    }
		
	

}
