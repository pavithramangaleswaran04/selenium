package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LcTable {

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
	public void simpleTable() {

		
		driver.get("https://letcode.in/table");

		//go to table


		driver.get("https://letcode.in/");

		driver.findElement(By.id("testing")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[5]/div/div/div/div[2]/app-menu/div/footer/a")).click();

		//Add all pricess and check if the all the prices
		WebElement tables = driver.findElement(By.id("shopping"));
		List<WebElement>rows= tables.findElements(By.cssSelector("tbody tr"));
		int sum = 0;
		for(int i=0; i<rows.size(); i++) {
		List<WebElement>cols = rows.get(i).findElements(By.tagName("td"));
		WebElement prices = cols.get(1);
		String text = prices.getText();
		System.out.println("with in loop "+text);
		sum +=Integer.parseInt(text);
		}
		System.out.println("Total "+sum);
		WebElement sumprice = driver.findElement(By.xpath("//table[@id='shopping']/tfoot/td[2]"));
		if(Integer.parseInt(sumprice.getText())==(sum)) {
		System.out.println("Pass");
		}else System.out.println("fail");


		//Mark Raj as present
		WebElement table = driver.findElement(By.id("simpletable"));
		List<WebElement>allrows = table.findElements(By.cssSelector("tbody tr"));
		int size = allrows.size();
		System.out.println("Rows size "+ size);
		if(size==3) {
		System.out.println("pass");
		}else System.out.println("fail");


		for(int i=0; i<size; i++) {
		List<WebElement>rows1=allrows.get(i).findElements(By.tagName("td"));
		WebElement lastname = rows1.get(i);
		String text = lastname.getText();
		System.out.println(text);
		if(text.equals("Raj")) {
		WebElement input = rows1.get(3).findElement(By.tagName("input"));
		input.click();
		break;
		}


		List<WebElement>colname = driver.findElements(By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[3]/div/table"));

		String[] beforesort = new String[colname.size()];

		for(int j =0; j<colname.size();j++) {

		beforesort[j]=colname.get(j).getText().trim();

		System.out.println(beforesort[j]);

		}

		driver.findElement(By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[3]/div/table/thead/th[1]/div/div[2]/div[2]")).click();

		//List<WebElement>colname = driver.findElements(By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[3]/div/table"));

		String[] aftersort = new String[colname.size()];

		System.out.println("After sorting");

		for(int j =0; j<colname.size();j++) {

		aftersort[j]=colname.get(j).getText().trim();

		System.out.println(aftersort[j]);

		}

		}
		}
		

		
	
	    @AfterTest
	    void teardown() {
	       // Close the driver

	       // driver.quit();
	    }

}
