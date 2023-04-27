package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LcShadow {

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
	public void DOM() {

		driver.get("https://letcode.in/shadow");

		//shadow root open
		WebElement shadowHost = driver.findElement(By.id("open-shadow"));
		SearchContext shadowRoot= shadowHost.getShadowRoot();
		shadowRoot.findElement(By.cssSelector("#fname")).sendKeys("Pavithra");

		//shadow root closed lastname
		driver.findElement(By.xpath("//div[@class='field']//my-web-component")).click();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("Mangaleswaran").perform();


		//shadow root closed mail
		driver.findElement(By.xpath("//div[@id='close-shadow']")).click();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("mpavithra0704@gmail.com").perform();


	}

}
