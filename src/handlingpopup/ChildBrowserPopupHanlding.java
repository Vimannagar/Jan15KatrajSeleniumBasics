package handlingpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopupHanlding {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\desktop\\Katraj\\15 Jan\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// chrome browser will get open

		driver.manage().window().maximize();// to maximize the window

		driver.get("https://groww.in/");

		driver.findElement(By.xpath("//*[@class='btn51Btn btn51RipplePrimary btn51Primary']//div//span[text()='Login/Register']")).click();

		
	
		
		driver.findElement(By.xpath("//*[@id='login_email1']")).sendKeys("abc@abc.com");
		
		
		driver.findElement(By.xpath("//*[@class='btn51Btn btn51RipplePrimary btn51Primary']//span[text()='Continue']")).click();
	}

}
