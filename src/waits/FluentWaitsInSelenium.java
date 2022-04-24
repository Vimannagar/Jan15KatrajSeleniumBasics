package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitsInSelenium {
	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\desktop\\Katraj\\15 Jan\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// chrome browser will get open

		driver.manage().window().maximize();// to maximize the window

		
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
										.withTimeout(Duration.ofSeconds(60))
										.pollingEvery(Duration.ofMillis(20));
		
		
		WebElement disablebutton = driver.findElement(By.xpath("//*[@id='disable']"));
		
		
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		
//	wait till the element is not clickable over the page	
		wait.until(ExpectedConditions.elementToBeClickable(disablebutton));
		
		
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
	
		
//		wait till the checkbox got selected
		
		driver.findElement(By.xpath("//*[@id='checkbox']")).click();
		
		
		wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//*[@id='ch']"), true));
		
		System.out.println("verified check box has been checked");
		
		
	}

}
