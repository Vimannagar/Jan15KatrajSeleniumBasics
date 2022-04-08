package basicmethods;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ScreenShot;

public class OrangeHRMWithScreenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\desktop\\Katraj\\15 Jan\\Selenium\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();// chrome browser will get open
		
		driver.manage().window().maximize();// to maximize the window
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		
		
		username.sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		ScreenShot.captureScreenshot(driver, "scr1");// calling of screenshot method to capture screenshot
		
	}
	

}
