package selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LetCodeDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;

		 WebDriverManager.chromedriver().setup();
	        // Create the driver object
	        driver = new ChromeDriver();
			driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		
		//dd1
		WebElement dd1 = driver.findElement(By.id("fruits"));
		Select drop1 = new Select(dd1);
		drop1.selectByVisibleText("Apple");
		
		//dd2
		WebElement dd2 = driver.findElement(By.id("superheros"));
		Select drop2 = new Select(dd2);
		if(drop2.isMultiple()) {
			drop2.selectByValue("wv");
			drop2.selectByVisibleText("Batman");
			drop2.selectByIndex(7);
		}	
		//dd3
		WebElement dd3 = driver.findElement(By.id("lang"));
		Select drop3 = new Select(dd3);
		drop3.selectByIndex(4);
		List<WebElement> all3 = drop3.getOptions();
		for(WebElement option: all3) System.out.println(option.getText());
		//dd4
		WebElement dd4 = driver.findElement(By.id("country"));
		Select drop4 = new Select(dd4);
		drop4.selectByValue("India");
		String India = drop4.getFirstSelectedOption().getText();
		System.out.println(India);
	}
}
