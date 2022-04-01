package basicmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BasicMethodForBrowser {
	
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\desktop\\Katraj\\15 Jan\\Selenium\\chromedriver.exe");
		
			
		WebDriver driver = new ChromeDriver();// chrome browser will get open
		
		driver.manage().window().maximize();// to maximize the window
//		driver.get("www.facebook.com/");// InvalidArgumentException
		
		
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.get("https://www.google.com");
		
		driver.navigate().back();// browser back button operate
		
		Thread.sleep(2000);
		
		driver.navigate().forward(); // browser forward button operate
		
		driver.get("https://jar-download.com/artifact-search/webdrivermanager");
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();// browser refresh button
		
		Thread.sleep(2000);
			
		driver.close();// close the current browser window
	}
}
