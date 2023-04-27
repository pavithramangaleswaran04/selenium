package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LcDrag {
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
	public void aui1() {


		driver.get("https://letcode.in/test");
		driver.findElement(By.xpath("//a[@class='card-footer-item' and @href='/draggable']")).click();

		driver.switchTo().frame(0);

		//Drag
		WebElement box = driver.findElement(By.xpath("//h3[text()='I can only be dragged within the dotted container']"));
		Actions action = new Actions(driver);
		int x = box.getLocation().getX();
		int y = box.getLocation().getY();
		System.out.println(box.getLocation());
		action.clickAndHold(box).moveByOffset(x+50,y+70).release().build().perform();
		action.dragAndDropBy(box, x+30,y+50).build().perform();

	}

}
