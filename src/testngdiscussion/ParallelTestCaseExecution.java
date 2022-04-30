package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTestCaseExecution {

	@Test
	public void googleTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\desktop\\Katraj\\15 Jan\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// chrome browser will get open

		driver.manage().window().maximize();// to maximize the window

		driver.get("https://www.google.com");
	}

	@Test
	public void facebookTest() {
		System.setProperty("webdriver.gecko.driver", "E:\\desktop\\Katraj\\15 Jan\\Selenium\\chromedriver.exe");

		WebDriver driver = new FirefoxDriver();// chrome browser will get open

		driver.manage().window().maximize();// to maximize the window

		driver.get("https://www.facebook.com");
	}

}
