package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LcForms {
	


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
	public void allInOne() {

		//Open the URL and click file button

		driver.get("https://letcode.in/forms");

		driver.manage().window().maximize();

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Enter first name
		driver.findElement(By.id("firstname")).sendKeys("Pavithra");

		//Enter last name
		driver.findElement(By.id("lasttname")).sendKeys("Mangaleswaran");

		//Enter email
		WebElement mail =driver.findElement(By.id("email"));
		mail.clear();
		mail.sendKeys("pavithra04@gmail.com");

		//Select country code

		WebElement country = driver.findElement(By.xpath("//body//app-root//div[2]//div[2]//div[1]//div[1]//div[1]//select[1]"));
		Select myCountry = new Select(country);
		myCountry.selectByValue("43");
		WebElement selectCountry = myCountry.getFirstSelectedOption();
		System.out.println(selectCountry.getText());

		//Enter phone number
		driver.findElement(By.id("Phno")).sendKeys("4567829");

		//Enter address line-1
		driver.findElement(By.id("Addl1")).sendKeys("jaffna");

		//Enter address line-2
		driver.findElement(By.id("Addl2")).sendKeys("SriLanka");

		

		//Enter state

		driver.findElement(By.id("state")).sendKeys("northern");

		

		//Enter postal-code
		driver.findElement(By.id("postalcode")).sendKeys("j-001");

		

		//Select country
		WebElement country2 = driver.findElement(By.xpath("//div[5]//div[2]//div[1]//div[1]//div[1]//select[1]"));
		Select myCountry2 = new Select(country2);
		myCountry2.selectByValue("Australia");
		WebElement selectCountry2 = myCountry2.getFirstSelectedOption();
		System.out.println(selectCountry2.getText());
		

		//Select the date of birth
		driver.findElement(By.xpath("//input[@id='Date']")).sendKeys("07052024");

		//Select the radio button
		WebElement radio1 =driver.findElement(By.xpath("//input[@id='female']"));
		radio1.click();
		System.out.println("Radio button option 2 is selected");

		//Click the term and condition box
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		//Click submit button
		driver.findElement(By.xpath("//input[@type='submit']")).click();



		
		
	}

}
