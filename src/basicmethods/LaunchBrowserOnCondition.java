package basicmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchBrowserOnCondition {
	
	
	public static void main(String[] args) {
	
		String browser = "Chrome";
		WebDriver d;
		if(browser.equals("Chrome"))
		{
		
		System.setProperty("webdriver.chrome.driver", "E:\\desktop\\Katraj\\15 Jan\\Selenium\\chromedriver.exe");
		
		 d = new ChromeDriver();// chrome browser will get open
		
		}
		
		else if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\desktop\\Katraj\\15 Jan\\Selenium\\geckodriver.exe");
			
			 d = new FirefoxDriver();// chrome browser will get open
			
		}
		
		
	}

}
