package testngdiscussion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KiteLogin {
	static WebDriver driver;
	@Test(priority = 1)
	public void navToApp()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\desktop\\Katraj\\15 Jan\\Selenium\\chromedriver.exe");
		
		
		 driver = new ChromeDriver();// chrome browser will get open
		
		driver.manage().window().maximize();// to maximize the window
		
		driver.get("https://kite.zerodha.com/");
		
	}
	
	@Test(priority = 2)
	public void loginToApp()
	{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='userid']")).sendKeys("DAA677");
		
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Velocity@123");
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.findElement(By.xpath("//*[@id='pin']")).sendKeys("866918");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		
		
		
		driver.findElement(By.xpath("//*[@type='button']"));
		
		String url = driver.getCurrentUrl();
		String expected = "dashboard";
		
		boolean iscontains = url.contains(expected);
		
		System.out.println(iscontains);
		
		
		Assert.assertEquals(iscontains, false);
		
	}

}
