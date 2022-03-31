package basicmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchBrowser {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\desktop\\Katraj\\15 Jan\\Selenium\\chromedriver.exe");
		
		ChromeDriver d = new ChromeDriver();// chrome browser will get open
		
		RemoteWebDriver rw = new ChromeDriver();// chrome browser will get open
		
		WebDriver driver = new ChromeDriver();// chrome browser will get open
	}

}
