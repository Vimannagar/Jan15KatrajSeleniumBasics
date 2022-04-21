package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitWaits {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\desktop\\Katraj\\15 Jan\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// chrome browser will get open

		driver.manage().window().maximize();// to maximize the window

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		WebElement searchbox = driver.findElement(By.xpath("//*[@title='Search']"));
		
		Actions act = new Actions(driver);
		
		act.click(searchbox).sendKeys("India").build().perform();
		
		act.sendKeys(Keys.ENTER).perform();
		
		
		driver.findElement(By.xpath("//*[text()='Central Bank of India']")).click();
	
		
	}

}
