package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LcCalendar {

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
	public void DateAndTime() {

		//driver.get("https://letcode.in/calendar");
		//driver.findElement(By.xpath("//div[@class='datetimepicker is-danger is-active']//div[@class='datetimepicker-container']")).click();


		//Open the URL
		driver.get("https://letcode.in/calendar");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		// Get the element
		//	driver.findElement(By.xpath("//div[@class='datetimepicker is-danger is-active']//button[@type='button'][normalize-space()='17']")).click();

		//click on today date
		WebElement dateBox = driver.findElement(By.xpath("//div[@class='datetimepicker is-danger is-active']//button[@type='button'][normalize-space()='Today']"));
		dateBox.click();

		//click on calendar
		WebElement cal = driver.findElement(By.xpath("//input[@class='datetimepicker-dummy-input is-datetimepicker-range']"));
		cal.click();

		//click on start date
		driver.findElement(By.xpath("//div[@class='datepicker is-active']//div[@class='datepicker-date is-current-month']//button[@type='button'][normalize-space()='4']")).click();

		//click on end date
		driver.findElement(By.xpath("//div[@class='datepicker is-active']//button[@type='button'][normalize-space()='17']")).click();

		// Select time after 2 hrs
		Actions act = new Actions(driver);
		WebElement y= driver.findElement(By.xpath("//div[@class='timepicker-hours']//span[@class='timepicker-next'][normalize-space()='+']"));
		act.doubleClick(y).perform();

	}

}
