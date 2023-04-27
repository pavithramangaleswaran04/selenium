package selenium;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LcDropdown {
	
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
    void button() {
        driver.get("https://letcode.in/test");
        
        driver.findElement(By.id("testing")).click();
        driver.findElement(By.linkText("Drop-Down")).click();
         
        //select the apple using visible text
        WebElement fruits = driver.findElement(By.id("fruits"));
        Select myfruits = new Select(fruits);
        myfruits.selectByVisibleText("Apple");
      
        
        //Select your super hero's
        WebElement heros = driver.findElement(By.id("superheros"));
        Select myHeros = new Select(heros);
        boolean isMul= myHeros.isMultiple();
        System.out.println("Is Multiple?" + isMul);
        myHeros.selectByIndex(1);
        myHeros.selectByValue("bt");
 
        
        
         //Select India using value & print the selected value
         WebElement country = driver.findElement(By.id("country"));
         Select myCountry = new Select(country);
         myCountry.selectByValue("India");
         WebElement selectedCountry = myCountry.getFirstSelectedOption();
         System.out.println(selectedCountry.getText());
        
      
        //Select India using value & print the selected value
  		WebElement dd3 = driver.findElement(By.id("lang"));
  		Select drop3 = new Select(dd3);
 		drop3.selectByIndex(4);
 		List<WebElement> all3 = drop3.getOptions();
 		for(WebElement option: all3) System.out.println(option.getText());
 		
        
         
    }   
    
    @AfterTest
    void teardown() {
       // Close the driver
       // driver.quit();
    }

}
