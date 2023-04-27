package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LcSlider {
	
	

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
	public void aui5() throws InterruptedException {
		

		driver.get("https://letcode.in/test");
		
		//go to slider
		driver.findElement(By.xpath("//a[@class='card-footer-item' and @href='/slider']")).click();
		
		//Slider
				WebElement slider = driver.findElement(By.id("generate"));
				Actions action = new Actions(driver);
				action.dragAndDropBy(slider, 20, 20).build().perform();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/app-root/app-word-generator/section[1]/div/div/div[1]/div/div/div[1]/div[1]/button")).click();		
	}

}
