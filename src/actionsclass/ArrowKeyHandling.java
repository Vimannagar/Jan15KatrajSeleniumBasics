package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ArrowKeyHandling {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\desktop\\Katraj\\15 Jan\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// chrome browser will get open

		driver.manage().window().maximize();// to maximize the window

		driver.get("https://www.google.com");
		
		WebElement searchbox = driver.findElement(By.xpath("//*[@title='Search']"));
		
		Actions act = new Actions(driver);
		
		act.click(searchbox).sendKeys("Selenium").build().perform();
		
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER)
		.build().perform();
		
	}

}
