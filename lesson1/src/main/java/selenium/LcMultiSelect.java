package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LcMultiSelect {


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
	public void aui4() {
		driver.get("https://letcode.in/test");

		driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[4]/div/div/div/div[4]/app-menu/div/footer/a")).click();

		Actions act = new Actions(driver);
		List<WebElement>list = driver.findElements(By.xpath("//div[@id='container']/div"));

		Action actions = act.keyDown(Keys.CONTROL).click(list.get(0)).click(list.get(1))
				.click(list.get(2)).click(list.get(3)).click(list.get(4)).click(list.get(5))
				.click(list.get(6)).click(list.get(7)).click(list.get(8)).build();
		actions.perform();


	}

}
