package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LcSnackGame {
	
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
	public void playIt() {
		//URL
		driver.get("https://letcode.in/game");

		//switch to game frame
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='google_esf']")));
		// driver.switchTo().frame(1);

		//start the game
		WebElement start = driver.findElement(By.xpath("/html/body/app-root/app-snake-game/section/div/div[20]"));
		start.click();

		//selection mode elements initialization
		WebElement classicmode = driver.findElement(By.xpath("/html/body/app-root/app-snake-game/section/div/div[21]/div[1]"));
		classicmode.click();


		Actions act = new Actions(driver);
		//act.sendKeys(Keys.UP).perform();
		//act.sendKeys(Keys.RIGHT).perform();
		act.sendKeys(Keys.DOWN).perform();


		
	}

}
