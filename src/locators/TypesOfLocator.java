package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypesOfLocator {
	
	
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "E:\\desktop\\Katraj\\15 Jan\\Selenium\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();// chrome browser will get open
		
		driver.manage().window().maximize();// to maximize the window
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
//		to locate the webelement we have to use findelement method
		
//		id locator
		WebElement username = driver.findElement(By.id("txtUsername"));
		
//	To type over a webelement we have to use sendKeys()
		username.sendKeys("Admin");
		
		WebElement  password = driver.findElement(By.id("txtPassword"));
		
		password.sendKeys("admin123");
		
//		name locator
		
//		driver.findElement(By.name("Submit")).click();
		
		
//		class
//		
//		driver.findElement(By.className("button")).click();
		
//	linkText	
//		driver.findElement(By.linkText("Forgot your password?")).click();
		
		
//  partialLinkText
		
		driver.findElement(By.partialLinkText("got your ")).click();
		
		
		
	}

}
