package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class LcRadio {

	WebDriver driver;
	public void name() {


		WebDriverManager.chromedriver().setup();
		// Create the driver object
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://letcode.in/test");
		
		
		// Click radio button
		driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[3]/div/div/div/div[2]/app-menu/div/footer/a")).click();

		//Select radio button1

		WebElement radio1 =driver.findElement(By.xpath("//*[@id=\"yes\"]"));
		radio1.click();
		System.out.println("Radio button option 1 is selected");



		//Select radio button2 and de_select radio button1

		WebElement radio2 = driver.findElement(By.xpath("//*[@id=\"no\"]"));
		radio2.click();
		System.out.println("Radio button option 2 is selected");



		//Find the bug

		WebElement radio3 = driver.findElement(By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[3]/div/label[2]"));
		radio3.click();
		WebElement radio4 = driver.findElement(By.xpath("//*[@id=\"nobug\"]"));
		radio4.click();



		if(radio3.isSelected())
		{
			System.out.println("Radio button option 3 is selected");
		}
		else if(radio4.isSelected()) {
			System.out.println("Radio button option 4 is selected");
		}





		//Confirm you can select only one radio button

		WebElement radio5 = driver.findElement(By.xpath("//*[@id=\"one\"]"));
		radio5.click();
		WebElement radio6 = driver.findElement(By.xpath("//*[@id='two']"));
		radio6.click();



		if(radio5.isSelected())
		{
			System.out.println("Radio button option 5 is selected");
		}
		else if(radio6.isSelected()) 
		{
			System.out.println("Radio button option 6 is selected");
		}





		//Confirm last field isDisabled

		WebElement radio7 = driver.findElement(By.xpath("//*[@id=\"maybe\"]"));
		boolean isEnabled = radio7.isEnabled();
		radio7.click();
		if(isEnabled==true) {
			System.out.println("isEnabled");
		}
		System.out.println("isNotEnabled");



		//Confirm you can select only one radio button

		WebElement yesbutton = driver.findElement(By.xpath("//*[@id=\"one\"]"));
		WebElement nobutton = driver.findElement(By.xpath("//*[@id=\"two\"]"));

		boolean status1=yesbutton.isSelected();
		boolean status2=nobutton.isSelected();

		System.out.println(status1);
		System.out.println(status2);


		//Click radio button
		driver.findElement(By.xpath("//a[@class='card-footer-item' and @href= '/radio']")).click();

		// Selecting CheckBox
		WebElement option1 = driver.findElement(By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[6]/label[2]/input"));

		// This will Toggle the Check box
		option1.click();

		// Check whether the Check box is toggled on
		if (option1.isSelected()) {
		System.out.println("Checkbox is Toggled On");

		} else {
		System.out.println("Checkbox is Toggled Off");
		}

		// Accept the T&C
		driver.findElement(By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[7]/label[2]/input")).click();


	}
}
