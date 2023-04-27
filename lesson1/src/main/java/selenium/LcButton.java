package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LcButton {
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
        driver.navigate().to("https://letcode.in/test");
        
        driver.findElement(By.id("testing")).click();
        driver.findElement(By.linkText("Click")).click();
        
        
        driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		
		
        WebElement ele=  driver.findElement(By.id("position"));
        Point point = ele.getLocation();
        int x= point.getX();
        int y= point.getY();
        System.out.println("x=>"+ x +" y =>" + y);
        
        
        WebElement btncolor= driver.findElement(By.id("color"));
        String color = btncolor.getCssValue("background-color");
        System.out.print(color);
        
        Rectangle rect = driver.findElement(By.id("property")).getRect();
        System.out.println("reat"+rect.getHeight());
        System.out.println(rect.getWidth());
        System.out.println(rect.getPoint());

        
        
        Dimension dime = rect.getDimension();
        System.out.println("dime"+dime);
        System.out.println(dime.getHeight());
        System.out.println(dime.getWidth());
        
        boolean isDisable = driver.findElement(By.id("isDisabled")).isEnabled();
        System.out.println(isDisable);
        
        
        // Locate the element C by By.xpath. 
        WebElement clickandhold = driver.findElement(By.xpath("/html/body/app-root/app-buttons/section[1]/div/div/div[1]/div/div/div[6]/div/button")); 
        
        // Create an object of actions class and pass reference of WebDriver as a parameter to its constructor. 
        Actions actions = new Actions(driver); 

       // Move the cursor to the position of element C. 
        actions.moveToElement(clickandhold); // Call clickAndHold() method to perform click and hold operation. 
        actions.clickAndHold().perform(); 
     

        
        
        }
    
    
    
    @AfterTest
    void teardown() {
       // Close the driver

       // driver.quit();
    }


}
