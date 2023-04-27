package selenium;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LcAlertDialog{
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
	public void dialog() throws InterruptedException {

		driver.get("https://letcode.in/test");
		// workspace page
		driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[4]/app-menu/div/footer/a")).click();

		//Alert1
		WebElement alt1 = driver.findElement(By.id("accept"));
		alt1.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();

		//Alert 2
		WebElement alt2 = driver.findElement(By.id("confirm"));
		alt2.click();
		Alert alert2 = driver.switchTo().alert();
		String text = alert2.getText();
		System.out.println(text);
		alert2.dismiss();

		//Alert 3
		WebElement alt3 = driver.findElement(By.id("prompt"));
		alt3.click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Pavi"+Keys.TAB);
		alert3.accept();

		//Alert 4
		WebElement alt4 = driver.findElement(By.id("modern"));
		alt4.click();
		WebElement close4 = driver.findElement(By.xpath("/html/body/app-root/app-alert/section[1]/div/div/div[1]/div/div/div[5]/button"));
		//Thread.sleep(3000);
		close4.click();


	}
	@AfterTest
	void teardown() {
		// Close the driver

		// driver.quit();
	}


}

