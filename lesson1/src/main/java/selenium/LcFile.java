package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LcFile {


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
	public void fileManagement() {

		driver.get("https://letcode.in/file");

		// FILE UPLOADING USING SENDKEYS ....
		WebElement chooseFile = driver.findElement(By.xpath("//input[@class='file-input' and @type='file']"));
		chooseFile.sendKeys("C:\\Users\\Admin\\Pictures\\Screenshots\\Screenshot (3).png");//Uploading the file using sendKey

		//file download excel sheet
		WebElement excelDownload = driver.findElement(By.xpath("//a[@id='xls']"));
		excelDownload.click();

		//file download PDF file
		WebElement pdfDownload = driver.findElement(By.xpath("//a[@id='pdf']"));
		pdfDownload.click();

		//file download text 
		WebElement textDownload = driver.findElement(By.xpath("//a[@id='txt']"));
		textDownload.click();


		/*
		driver.get("https://www.monsterindia.com/seeker/registration"); //Testing webpage

		JavascriptExecutor js = (JavascriptExecutor)driver; //Scrolling using JavascriptExecutor
		js.executeScript("window.scrollBy(0,380)");//Scroll Down to file upload button (+ve)
		//Thread.sleep(3000);

		// FILE UPLOADING USING SENDKEYS ....

		WebElement browse = driver.findElement(By.xpath("//input[@type='file']"));
		//click on ‘Choose file’ to upload the desired file
		browse.sendKeys("C:\\Users\\Admin\\Desktop\\Doc1.pdf"); //Uploading the file using sendKeys
		System.out.println("File is Uploaded Successfully");
		 */

	}	

}
