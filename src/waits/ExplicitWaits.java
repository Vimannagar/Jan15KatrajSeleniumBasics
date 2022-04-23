package waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaits {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\desktop\\Katraj\\15 Jan\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// chrome browser will get open

		driver.manage().window().maximize();// to maximize the window

		
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		WebElement disablebutton = driver.findElement(By.xpath("//*[@id='disable']"));
		
		
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//	wait till the element is not clickable over the page	
		wait.until(ExpectedConditions.elementToBeClickable(disablebutton));
		
		
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
	
		driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
		
		WebElement hiddenbutton = driver.findElement(By.xpath("//*[@id='hidden']"));
//		waiting until the element is visible over the webpage
		
		wait.until(ExpectedConditions.visibilityOf(hiddenbutton));
		
		System.out.println("button is displayed on the page");
		
	
}

}
