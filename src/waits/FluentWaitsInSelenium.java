package waits;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitsInSelenium {
	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\desktop\\Katraj\\15 Jan\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// chrome browser will get open

		driver.manage().window().maximize();// to maximize the window

		
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(60)).pollingEvery(Duration.ofMillis(2));
		
	}

}
