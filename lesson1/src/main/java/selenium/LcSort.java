package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LcSort {

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
	public void aui3() {

		// Create the driver object
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://letcode.in/test");
		driver.findElement(By.xpath("//a[@class='card-footer-item' and @ href='/sortable']")).click();

		List<WebElement> elements=driver.findElements(By.id("sample-box1"));
		//Drag and drop for element8

		WebElement  fromElement = elements.get(8);
		WebElement toElement= elements.get(0);

		Actions actions = new Actions(driver);
		actions.clickAndHold(fromElement);
		actions.moveToElement(toElement);
		actions.release(toElement);
		actions.build().perform();

		//Drag and drop for element7

		WebElement  fromElement1 = elements.get(7);
		WebElement toElement1= elements.get(1);

		Actions actions1 = new Actions(driver);
		actions1.clickAndHold(fromElement1);
		actions1.moveToElement(toElement1);
		actions1.release(toElement1);
		actions1.build().perform();


	}

}
